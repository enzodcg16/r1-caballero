package com.example.LC.controllers;

import java.util.ArrayList;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import com.example.LC.models.UserModel;

import com.example.LC.services.UserService;



@RestController
@RequestMapping("/api/v1/accounts")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> mostrarUsuarios(){
        return userService.mostrarUsuarios();
    }
    @PostMapping
    public UserModel guardarUsuarios(@RequestBody UserModel usuarios){
        return this.userService.guardarUsuario(usuarios);

    }
    @GetMapping(path = "/{id}")
    public Optional<UserModel> mostrarUsuarioPorId(@PathVariable("id")Long id){
        return this.userService.mostrarPorId(id);
    }
    @DeleteMapping(path = "/{id}")
    public String BorrarPorId(@PathVariable("id")Long id){
        boolean ok =this.userService.eliminarUsuario(id);
        if (ok){
        return "Se Elimino La Cuenta con ID:"+id;
        
        }else{
            return "No Se pudo Eliminar la Cuenta con ID:"+id;
        }
    }
    @PutMapping
    public UserModel actualizarUsuarios(@RequestBody UserModel usuarios){
        return this.userService.guardarUsuario(usuarios);

    }
    @PutMapping(path="/{id}")
    public UserModel modificarUsuario( @RequestBody UserModel usuario,@PathVariable("id")Long id){
        
        
     return userService.modificarPorId(usuario,id);


    }
}
