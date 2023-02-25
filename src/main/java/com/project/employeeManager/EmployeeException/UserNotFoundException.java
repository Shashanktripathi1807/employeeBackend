package com.project.employeeManager.EmployeeException;

public class UserNotFoundException extends RuntimeException{
    private String message;

    public UserNotFoundException(String message){
        super(message);
    }
}
