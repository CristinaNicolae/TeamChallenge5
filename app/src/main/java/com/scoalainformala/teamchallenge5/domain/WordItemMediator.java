package com.scoalainformala.teamchallenge5.domain;

import android.app.Notification;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WordItemMediator {

    private final WordRepository localRepository;
    private final WordRepository remoteRepository;
    private final ExecutorService executorService;
    private final MutableLiveData<List<WordItem>> liveWords;


    public WordItemMediator(WordRepository localRepository, WordRepository remoteRepository) {
        this.localRepository = localRepository;
        this.remoteRepository = remoteRepository;
        this.executorService = Executors.newSingleThreadExecutor();
        this.liveWords = new MutableLiveData<>();
    }

    public LiveData<List<WordItem>> getWords(){
        ArrayList<WordItem> list = new ArrayList<>();
        for (WordDto dto :
                localRepository.getWords()) {
            list.add(new WordItem(dto.getName(), dto.getDefinition()));
        }

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (WordDto dto :
                        remoteRepository.getWords()) {
                    list.add(new WordItem(dto.getName(), dto.getDefinition()));
                }
            }
            this.liveWords.postValue(list);
        });

        return liveWords;
    }
}
