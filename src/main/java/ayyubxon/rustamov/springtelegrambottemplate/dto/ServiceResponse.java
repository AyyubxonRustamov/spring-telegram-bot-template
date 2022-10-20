package ayyubxon.rustamov.springtelegrambottemplate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceResponse<T> {

    private String message;
    private boolean success;
    private T data;

    public ServiceResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
}
