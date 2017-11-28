package com.web.app;

import com.example.lib.Student;
import com.example.lib.StudentApi;
import com.example.lib.retrofit.StudentRetrofitApi;

public class StudentRunner {
	
	String HTTP_URL = "http://localhost:8080";
//	String HTTP_URL = "http://ec2-52-79-81-133.ap-northeast-2.compute.amazonaws.com:8080";

	private StudentApi api;
	public StudentRunner() {
		api = new StudentRetrofitApi(HTTP_URL);
	}
	
	StudentRunner(StudentApi api) {
		this.api = api;
	}
		
	public Boolean run(String firstName, String lastName) {
		//$ curl http://localhost:8080/api/students/3 -v -X GET
		api.getStudents().forEach((student) -> {display("get students : ", student);});
		
		//$ curl http://localhost:8080/api/students -v -X POST -H "Content-Type: application/json" -d "{\"firstName\" : \"aaaaa\", \"lastName\" : \"bbbbb3\"}"
		Student newStudent = api.postStudent(new Student(null, firstName, lastName));
		System.out.println("post student : " + newStudent);
				
		api.getStudents().forEach((student) -> {display("get students : ", student);});
		
		if (newStudent != null && newStudent.getId() > 0) {
			//$ curl http://localhost:8080/api/students/3 -v -X DELETE
			Boolean delete = api.deleteStudent(newStudent.getId());
			System.out.println("delete student : " + delete);
			
			api.getStudents().forEach((student) -> {display("get students : ", student);});
			return true;
		} else {
			return false;
		}
	}
	
	void display(String msg, Student student) {
		System.out.println(msg + " : Student Info ->" + student.getId() + ", " + student.getFirstName() + " " + student.getLastName());
	}
}
