package pe.cibertec.bet.ApiStats.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pe.cibertec.bet.ApiStats.dto.ErrorResponseDto;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> 
        handleEntityNotFound(EntityNotFoundException ex){
            var status = HttpStatus.NOT_FOUND;
            var errorResponse = new ErrorResponseDto(status, 
                    ex.getMessage(),
                    ex.getStackTrace().toString());
            
            return new ResponseEntity<>(errorResponse, status);
    }
    
}
