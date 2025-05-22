package com.example.meli_back.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * simple class that contains the needed information about any exception
 */
@Data
@AllArgsConstructor
public class ErrorResponse {

    private int statusCode;
    private String message;

}
