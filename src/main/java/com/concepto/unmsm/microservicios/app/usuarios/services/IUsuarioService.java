package com.concepto.unmsm.microservicios.app.usuarios.services;

import com.concepto.unmsm.microservicios.app.usuarios.models.entities.User;

import java.util.Optional;

/**
 * Representa la estructura de las operaciones de un usuario.
 */
public interface IUsuarioService {
    /**
     * Obtiene todos los usuarios registrados en el sistema.
     *
     * @return Usuarios registrados en el sistema.
     */
    Iterable<User> findAll();

    /**
     * Obtiene la informacion de un usuario segun su identificador.
     *
     * @param id Identificador del usuario.
     * @return Informacion del usuario.
     */
    Optional<User> findById(long id);

    /**
     * Guarda la informacion de un usuario en el sistema.
     *
     * @param user Informacion del usuario.
     * @return Informacion del usuario actualizado.
     */
    User save(User user);

    /**
     * Elimina un usuario segun su identificador.
     *
     * @param id Identificador del usuario.
     */
    void deleteById(Long id);
}
