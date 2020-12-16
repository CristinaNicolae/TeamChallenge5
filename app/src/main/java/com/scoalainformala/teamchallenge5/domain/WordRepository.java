package com.scoalainformala.teamchallenge5.domain;

import java.util.List;

public interface WordRepository {
    List<WordItem> getWords();
    void addWord(WordItem word);
}
