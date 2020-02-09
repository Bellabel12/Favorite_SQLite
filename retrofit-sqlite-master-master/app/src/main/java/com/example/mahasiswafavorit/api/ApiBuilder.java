package com.example.mahasiswafavorit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBuilder {

    //--------------------------------------------------
    //Service untuk mengambil url dan deklarasi Retrofit
    //Sesuaikan IP Dengan IP Server yaaah
    //--------------------------------------------------

    public static final String URL = "http://192.168.1.5:8080/uas/";
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
