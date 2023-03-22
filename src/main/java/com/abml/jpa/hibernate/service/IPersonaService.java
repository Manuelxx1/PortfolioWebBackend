/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abml.jpa.hibernate.service;

/**
 *
 * @author Flash
 */

import com.abml.jpa.hibernate.model.Persona;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Flash
 */

//Persona service implementa esta interfaz para reforzar sus propios metodos
public interface IPersonaService {

    //metodo para traer todas las personas
    public List <Persona> getPersonas();
    //metodo para dar de alta a una persona
    public void savePersona (Persona perso);
    //metodo para borrar una persona
    public void deletePersona (Long id);
    //metodo para encontrar una persona
    public Persona findPersona (Long id);
   
    
}
        