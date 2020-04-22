/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.service.impl;

import java.util.ArrayList;
import java.util.List;
import noe.com.example.basicauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author noe_5
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        noe.com.example.basicauthentication.entity.User user = userRepository.findUserByUsername(username);
        return userBuilder(user);
    }
    
    private User userBuilder(noe.com.example.basicauthentication.entity.User user){
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getRole()));
        return new User(user.getUsername(), new BCryptPasswordEncoder().encode(user.getPassword()), roles);
    }
}
