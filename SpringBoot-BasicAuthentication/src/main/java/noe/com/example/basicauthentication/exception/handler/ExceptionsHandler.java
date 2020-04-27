/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author noe_5
 */
@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(value = UsernameNotFoundException.class )
    protected ResponseEntity<Object> handleUsernameNotFounException(UsernameNotFoundException ex) {
        System.out.println("captura exception");
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
