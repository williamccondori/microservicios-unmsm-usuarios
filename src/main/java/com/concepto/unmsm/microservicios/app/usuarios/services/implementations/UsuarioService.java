package com.concepto.unmsm.microservicios.app.usuarios.services.implementations;

import com.concepto.unmsm.microservicios.app.usuarios.models.entities.User;
import com.concepto.unmsm.microservicios.app.usuarios.services.IUsuarioService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Override
    public Iterable<User> findAll() {
        User user = new User();
        user.setNombres("William");
        user.setAppellidos("Condori Quispe");
        user.setEmail("williamccondori@gmail.com");

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }

    @Override
    public Optional<User> findById(long id) {
        User user = new User();
        user.setNombres("William");
        user.setAppellidos("Condori Quispe");
        user.setEmail("williamccondori@gmail.com");
        return Optional.of(user);
    }

    @Override
    public User save(User user) {
        return user;
    }

    @Override
    public void deleteById(Long id) {

    }
}
