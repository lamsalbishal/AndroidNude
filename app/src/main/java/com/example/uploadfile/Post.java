package com.example.uploadfile;

import com.google.gson.annotations.SerializedName;

public class Post {

  private  int  postId;
  private int   id;
  private String   name ;
  private String  email;

  @SerializedName("body")
  private String  text ;

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}
