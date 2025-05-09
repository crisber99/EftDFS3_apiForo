#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ${artifactId}NotFoundException extends RuntimeException {
    
    public ${artifactId}NotFoundException(String msg)
    {
        super(msg);
    }
}