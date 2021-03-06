/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2ciclo4.Reto2.Repositorio;

import Reto2ciclo4.Reto2.Interface.InterfaceUser;
import Reto2ciclo4.Reto2.Modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public class UserRepository {
    @Autowired
    private InterfaceUser userCrudRepository;
    
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }
    
    public Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }
    
    public User save(User user){
        return userCrudRepository.save(user);
    }
    
    public void update(User user){
        userCrudRepository.save(user);
    }
    
    public void delete(User user){
        userCrudRepository.delete(user);
    }
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        return !usuario.isEmpty();
    }
    
    public Optional<User> authenticateUser (String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
}
