package pe.cibertec.bet.ApiStats.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorResponseDto {
    
    private Date timestamp;
    private int code;
    private String status;
    
    private Object message;
    
    private String stackTrace;
    
    public ErrorResponseDto(HttpStatus httpStatus, 
            Object message, String stackTrace){
        
        this.timestamp = new Date();
        this.code = httpStatus.value();
        this.status = httpStatus.name();
        this.message = message;
        this.stackTrace = stackTrace;
}
}
