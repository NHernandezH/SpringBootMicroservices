/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.repository;

import noe.com.example.basicauthentication.entity.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author noe_5
 */
@Repository
public class UserRepository {
    
    public User findUserByUsername(String username){
        return new User("admin","admin","ADMIN");
    }
}
