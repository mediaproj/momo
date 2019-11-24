package com.mediaproj.momo.global.Retrofit;

import com.mediaproj.momo.data.LoginData;
import com.mediaproj.momo.data.Room;
import com.mediaproj.momo.data.User;
import com.mediaproj.momo.data.UserData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    @POST("user/create")
    Call<Void> createUser(@Body User user);

    @POST("auth/login")
    Call<UserData> login(@Body LoginData loginData);

    @GET("user/schedule/{email}")
    Call<List<Room>> getUserSchedule(@Path("email") String email);
}
