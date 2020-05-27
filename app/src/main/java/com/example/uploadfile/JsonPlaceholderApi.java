package com.example.uploadfile;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface JsonPlaceholderApi {

    @GET("comments?_limit=10")
    Call<List<Post>> getPost();

    @Multipart
    @POST("nsfw")
    Call<ResponseBody> uploadImage(@Part MultipartBody.Part file, @Part("image") RequestBody requestBody);
}
