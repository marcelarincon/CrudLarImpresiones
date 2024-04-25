package com.api.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public List<UserModel> getUsers() {
      return userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    public UserModel updateById(UserModel request, Long id) {
        // Verificar si la entidad existe
        UserModel user = userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Usuario no encontrado con ID: " + id));

        // Actualizar los campos
        user.setPrimer_nombre(request.getPrimer_nombre());
        user.setPrimer_apellido(request.getPrimer_apellido());
        user.setEdad(request.getEdad());
        user.setFk_barrio(request.getFk_barrio());
        user.setCelular(request.getCelular());
        user.setEmail(request.getEmail());
        user.setFecha_ingreso(request.getFecha_ingreso());
        user.setSegundo_apellido(request.getSegundo_apellido());
        user.setCalle(request.getCalle());
        user.setCarrera(request.getCarrera());
        user.setSegundo_nombre(request.getSegundo_nombre());
        user.setPassword(request.getPassword());

        return userRepository.save(user); // Guardar la entidad actualizada
    }

    @Transactional
    public Boolean deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException e) {
            // Si no se encuentra la entidad, devolver false
            return false;
        }
    }
}
