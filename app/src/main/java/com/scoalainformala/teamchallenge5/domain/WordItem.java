package com.scoalainformala.teamchallenge5.domain;

public class WordItem {

    private final String word;
    private final String definition;

    public WordItem(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }
}
