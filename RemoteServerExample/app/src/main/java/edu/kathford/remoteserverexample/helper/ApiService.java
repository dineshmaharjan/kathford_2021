package edu.kathford.remoteserverexample.helper;

import java.util.List;

import edu.kathford.remoteserverexample.entity.request.PostRequest;
import edu.kathford.remoteserverexample.entity.response.PostResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @POST("posts")
    Call<PostResponse> submitPost(@Body PostRequest postRequest);

    @GET("posts")
    Call<List<PostResponse>> getAllPosts();
}
