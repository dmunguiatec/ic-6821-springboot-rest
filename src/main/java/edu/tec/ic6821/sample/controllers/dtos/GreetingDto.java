package edu.tec.ic6821.sample.controllers.dtos;

public class GreetingDto {
    private String message;

    public GreetingDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
