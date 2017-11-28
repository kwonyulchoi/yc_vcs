package com.example.lib.retrofit;

import java.io.IOException;
import java.util.List;

import com.example.lib.Student;
import com.example.lib.StudentApi;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StudentRetrofitApi implements StudentApi {
	
	private RetrofitApi retrofitApi;
	
	public StudentRetrofitApi(String serverAddress) {
		Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(serverAddress)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
		retrofitApi = retrofit.create(RetrofitApi.class);
	}
	
	@Override
	public List<Student> getStudents() {
		List<Student> result = null;
		Call<List<Student>> students = retrofitApi.getStudents();
		
		try {
			Response<List<Student>> execute = students.execute();
			result = execute.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Student postStudent(Student student) {
		Student result = null;
		Call<Student> post = retrofitApi.postStudent(student);
		
		try {
			Response<Student> execute = post.execute();
			result = execute.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Boolean deleteStudent(Integer id) {
		Boolean result = false;
		Call<Boolean> delete = retrofitApi.deleteStudent(id);
		
		try {
			Response<Boolean> execute = delete.execute();			
			result = execute.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result == null ? false : result;
	}	
}
