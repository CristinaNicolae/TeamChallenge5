package com.scoalainformala.teamchallenge5.domain;

import androidx.lifecycle.LiveData;

import java.util.List;

public class FetchWordUseCase {

    private final WordItemMediator mediator;

    public FetchWordUseCase(WordItemMediator mediator) {
        this.mediator = mediator;
    }

    public LiveData<List<WordItem>> execute(){
        return mediator.getWords();
    }
}
