/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2ciclo4.Reto2.Interface;

import Reto2ciclo4.Reto2.Modelo.Gadgets;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author usuario
 */
public interface InterfaceGadgets extends MongoRepository<Gadgets, Integer> {
    
}
