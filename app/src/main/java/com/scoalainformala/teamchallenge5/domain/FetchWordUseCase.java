package com.scoalainformala.teamchallenge5.domain;

import androidx.lifecycle.LiveData;

public class FetchWordUseCase {

    private final WordItemMediator mediator;

    public FetchWordUseCase(WordItemMediator mediator) {
        this.mediator = mediator;
    }

    public LiveData<WordItem> execute(){
        return mediator.getWords();
    }
}
