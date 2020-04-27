/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.repository;

import java.util.Optional;
import noe.com.example.basicauthentication.model.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 *
 * @author noe_5
 */
@Repository
public class UserRepository {
    
    public Optional<UserEntity> findUserByUsername(String username){
//        return Optional.of(new UserEntity("admin","admin","ADMIN"));
            return Optional.empty();
//            return null;
    }
}
