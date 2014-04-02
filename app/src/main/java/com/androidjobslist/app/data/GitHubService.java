package com.androidjobslist.app.data;

import com.androidjobslist.app.model.Job;

import org.json.JSONArray;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface GitHubService {
    @GET("/positions.json?description=android")
    public void listPositionsForAndroid(Callback<List<Job>> callback);

    @GET("/positions.json?description=android")
    public List<Job> listPositionsForAndroidNoCallback();

    @GET("/positions.json")
    public void listPositionsFromSearch(@Query("description") String description, Callback<List<Job>> callback);

    @GET("/positions.json")
    public List<Job> listPositionsFromSearchNoCallback(@Query("description") String description);

    @GET("/positions/{id}.json?")
    public void getSpecificJobInformation(@Path("id") int positionId, Callback<Job> callback);
}
