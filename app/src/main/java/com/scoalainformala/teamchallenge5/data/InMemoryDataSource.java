package com.scoalainformala.teamchallenge5.data;

import java.util.Arrays;
import java.util.List;

public class InMemoryDataSource implements WordRepository {

    private List<WordDto> wordDtos;

    @Override
    public List<WordDto> getWords() {
        wordDtos = Arrays.asList(
                new WordDto("Negru", "Def1"),
                new WordDto("Galben", "Def2")
        );
        return wordDtos;
    }

    public void addWord(WordDto word) {
        wordDtos.add(word);
    }

}
