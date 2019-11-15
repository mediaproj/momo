package com.mediaproj.momo.global.Retrofit;

import com.mediaproj.momo.data.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("user/create")
    Call<Void> createUser(@Body User user);
}
