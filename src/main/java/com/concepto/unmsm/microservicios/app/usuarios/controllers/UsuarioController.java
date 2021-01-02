package com.concepto.unmsm.microservicios.app.usuarios.controllers;

import com.concepto.unmsm.microservicios.app.usuarios.models.entities.User;
import com.concepto.unmsm.microservicios.app.usuarios.services.IUsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsuarioController {

    private final IUsuarioService _usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this._usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(_usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<User> usuario = _usuarioService.findById(id);
        if (!usuario.isPresent())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody User user) {
        User userDb = _usuarioService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDb);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable Long id) {
        Optional<User> userResult = _usuarioService.findById(id);
        if (!userResult.isPresent())
            return ResponseEntity.notFound().build();
        User userDb = userResult.get();
        userDb.setNombres(user.getNombres());
        userDb.setAppellidos(user.getAppellidos());
        userDb.setEmail(user.getEmail());
        userDb = _usuarioService.save(userDb);
        return ResponseEntity.status(HttpStatus.OK).body(userDb);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        _usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
