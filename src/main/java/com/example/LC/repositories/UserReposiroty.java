package com.example.LC.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.LC.models.UserModel;

// nuestro repositorio de CRUD
@Repository
public interface UserReposiroty extends CrudRepository<UserModel,Long> {
    
    
}
