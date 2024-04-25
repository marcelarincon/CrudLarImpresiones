/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.crud.UserModel.excepciones;
//Marcela Rincon Ardila 2675835
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)//Manejo de Excepciones
public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID=1L;
    public ResourceNotFoundException(String mensaje){
    super(mensaje);
    }
    
}
