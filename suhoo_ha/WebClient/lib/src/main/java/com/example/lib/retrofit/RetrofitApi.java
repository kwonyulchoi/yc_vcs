package com.example.lib.retrofit;

import java.util.List;

import com.example.lib.Student;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitApi {
	@GET("/api/students")
	public Call<List<Student>> getStudents();
	
	@POST("/api/students")
	public Call<Student> postStudent(@Body Student student);
}
