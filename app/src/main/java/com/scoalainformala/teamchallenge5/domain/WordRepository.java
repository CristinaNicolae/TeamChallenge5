package com.scoalainformala.teamchallenge5.domain;

import com.scoalainformala.teamchallenge5.data.WordDto;

import java.util.List;

public interface WordRepository {
    List<WordDto> getWords();
    void addWord(WordDto word);
}
