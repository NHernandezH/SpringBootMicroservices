/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author noe_5
 */
@RestController
public class HelloController {
    
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello";
    }
}
