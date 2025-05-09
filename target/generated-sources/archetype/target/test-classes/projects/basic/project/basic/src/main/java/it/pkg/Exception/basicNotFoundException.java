package it.pkg.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class basicNotFoundException extends RuntimeException {
    
    public basicNotFoundException(String msg)
    {
        super(msg);
    }
}