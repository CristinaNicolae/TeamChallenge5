package com.scoalainformala.teamchallenge5.data;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import retrofit2.Response;

public class RemoteDataSource implements WordRepository {


    private final WordApi api;

    public RemoteDataSource(WordApi api) {
        this.api = api;
    }

    @Override
    public List<WordDto> getItems() {
        try {
            Response<List<WordDto>> response = api.getWords().execute();
            return response.body();
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

}
