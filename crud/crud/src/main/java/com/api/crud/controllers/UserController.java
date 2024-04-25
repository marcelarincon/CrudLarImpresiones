package com.api.crud.controllers;
//Marcela Rincon Ardila 2675835
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("usuarios")
public class UserController {

    @Autowired
    private UserService userRepository;
        
    // Este endpoint devuelve un mensaje de respuesta fijo para validar la conexión
    @GetMapping("/validar-conexion")
    public ResponseEntity<String> validarConexion() {
        return ResponseEntity.ok("Conexión exitosa");
    }

    // Este endpoint devuelve todos los usuarios
    @GetMapping("/todos")
    public List<UserModel> getUsers() {
        return userRepository.getUsers();
    }

    // Este endpoint permite buscar un usuario por su ID
    @GetMapping("/por-id/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable("id") Long id) {
        Optional<UserModel> user = userRepository.getById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Este endpoint permite agregar un nuevo usuario
    @PostMapping("/nuevo")
    public UserModel saveUser(@RequestBody UserModel user) {
        return userRepository.saveUser(user);
    }

    // Este endpoint permite actualizar un usuario por su ID
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<UserModel> updateUserById(@RequestBody UserModel request, @PathVariable("id") Long id) {
        UserModel updatedUser = userRepository.updateById(request, id);
        return ResponseEntity.ok(updatedUser);
    }

    // Este endpoint permite eliminar un usuario por su ID
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
        boolean deleted = userRepository.deleteUser(id);
        if (deleted) {
            return ResponseEntity.ok("Usuario con ID " + id + " eliminado exitosamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
