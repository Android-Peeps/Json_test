package com.mohan.jsontest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://simplifiedCoding.net/demos/";

    @GET("marvel")
    Call<List<SuperHeros>> getHeros();
}
