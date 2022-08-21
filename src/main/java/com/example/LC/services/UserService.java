package com.example.LC.services;

import java.util.ArrayList;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.LC.models.UserModel;
import com.example.LC.repositories.UserReposiroty;

@Service
public class UserService {
    @Autowired
    UserReposiroty userReposiroty;

   //Metodos 
    public ArrayList<UserModel> mostrarUsuarios(){
        return (ArrayList<UserModel>)userReposiroty.findAll();

    }
    public UserModel guardarUsuario(UserModel usuario){
        return userReposiroty.save(usuario);
    }
    public Optional<UserModel>mostrarPorId(Long id){
        return userReposiroty.findById(id);
    }    
    public boolean eliminarUsuario(Long id){
        try{
            userReposiroty.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }

    }
    public UserModel modificarPorId(UserModel usuario,long id){
        UserModel u = new UserModel();
        u.setID(id);
        return userReposiroty.save(usuario);
    }
}
