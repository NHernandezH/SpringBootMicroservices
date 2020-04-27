/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import noe.com.example.basicauthentication.model.ErrorResponse;
import noe.com.example.basicauthentication.model.builder.ErrorResponseBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 *
 * @author noe_5
 */
@Component
public class CustomBasicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint{

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException {
        response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName() + "");
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.addHeader("Content-Type", "pplication/json;");
        PrintWriter writer = response.getWriter();
        ErrorResponse errorResponse = new ErrorResponseBuilder()
                .error("Authentication exception")
                .status(HttpStatus.UNAUTHORIZED.value())
                .timestamp(new Date().toLocaleString())
                .message(exception.getMessage());
        writer.print(new ObjectMapper().writeValueAsString(errorResponse));
    }

    @Override
    public void afterPropertiesSet() {
        setRealmName("noe.com");
        super.afterPropertiesSet();
    }
}
