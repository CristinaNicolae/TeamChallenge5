package com.scoalainformala.teamchallenge5.data;

public class WordDto {

    private final String name;
    private final String definition;


    public WordDto(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public String getDefinition() {
        return definition;
    }
}
