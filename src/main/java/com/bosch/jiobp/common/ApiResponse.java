package com.bosch.jiobp.common;


import lombok.Data;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse<T> {

    private int statusCode;
    private String message;
    private T id;

    public static <T> ApiResponse<T> success(String message, T id){
        return create(HttpStatus.OK.value(), message, id);
    }
    public static <T> ApiResponse<T> success(int statusCode,String message, T id){
        return create(statusCode, message, id);
    }
    public static <T> ApiResponse<T> create(int statusCode, String message, T id){
        ApiResponse<T> response = new ApiResponse<T>();
        response.setStatusCode(statusCode);
        response.setMessage(message);
        response.setId(id);
        return response;
    }
}
