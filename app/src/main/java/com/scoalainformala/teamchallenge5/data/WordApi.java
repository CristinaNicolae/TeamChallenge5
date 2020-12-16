package com.scoalainformala.teamchallenge5.data;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface WordApi {

    String BASE_URL = "https://aa-playground-449e2-default-rtdb.europe-west1.firebasedatabase.app/";

    @GET("terms.json")
    Call<List<WordDto>> getWords();

    static WordApi createApi() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WordApi.class);
    }

}
