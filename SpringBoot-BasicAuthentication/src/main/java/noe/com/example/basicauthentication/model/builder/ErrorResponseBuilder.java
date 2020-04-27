/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.model.builder;

import java.util.Date;
import noe.com.example.basicauthentication.model.ErrorResponse;

/**
 *
 * @author noe_5
 */
public final class ErrorResponseBuilder extends ErrorResponse{

    public ErrorResponseBuilder() {
    }

    public ErrorResponseBuilder message(String message) {
        super.setMessage(message);
        return this;
    }

    public ErrorResponseBuilder error(String error) {
        super.setError(error); //To change body of generated methods, choose Tools | Templates.
        return this;
    }

    public ErrorResponseBuilder status(Integer status) {
        super.setStatus(status); //To change body of generated methods, choose Tools | Templates.
        return this;
    }

    public ErrorResponseBuilder timestamp(String timestamp) {
        super.setTimestamp(timestamp); //To change body of generated methods, choose Tools | Templates.
        return this;
    }

}
