package lk.ijse.exception;

import io.jsonwebtoken.ExpiredJwtException;
import lk.ijse.dto.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UsernameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIResponse handleUsernameNotFoundException
            (UsernameNotFoundException ex) {
        return new APIResponse(
                404,
                "User Not Fount",
                ex.getMessage());
    }
    @ExceptionHandler(BadCredentialsException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public APIResponse handleBadCredentialsException
            (BadCredentialsException ex) {
        return new APIResponse(401,
                "Unauthorized",
                "Invalid username or password");
    }
    @ExceptionHandler(ExpiredJwtException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public APIResponse handleExpiredJwtException
            (ExpiredJwtException ex) {
        return new APIResponse(401,
                "Unauthorized",
                "Expired JWT Token");
    }
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public APIResponse handleRuntimeException
            (RuntimeException ex) {
        return new APIResponse(500,
                "Internal Server Error",
                ex.getMessage());
    }

}