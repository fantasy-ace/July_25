package com.example.ace.july_25;

import com.example.ace.july_25.beans.ArtBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ACE on 2019/7/25.
 */

public interface ApiService {
    public final String URL="https://www.wanandroid.com/";
    @GET("article/list/{num}/json")
    Observable<ArtBean> getData(@Path("num")int n);
}
