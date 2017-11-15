package com.web.app;

import com.example.lib.Student;
import com.example.lib.StudentApi;
import com.example.lib.retrofit.StudentRetrofitApi;

/**
 * Main-Entry Point Class
 * @author kwonyul.choi
 *
 */
public class Application {
	private static final String HTTP_URL = "http://localhost:8080";

	public static void main(String[] args) {
		StudentApi api = new StudentRetrofitApi(HTTP_URL);
		new Application().execute(api);
	}

	/**
	 * Main-Method
	 * @param api StudentAPI Object
	 */
	void execute(StudentApi api) {
		System.out.println("WebClient Application Start");
		String suffix = "07";
		
		//$ curl http://localhost:8080/api/students -v -X POST -H "Content-Type: application/json" -d "{\"firstName\" : \"aaaaa\", \"lastName\" : \"bbbbb3\"}"
		api.PostStudent(new Student(null, "student_first_name_" + suffix, "student_last_name_" + suffix));
		
		//$ curl http://localhost:8080/api/students/3 -v -X GET
		api.getStudents().forEach((student) -> {display("GetStudents : ", student);});

		System.out.println("WebClient Application Finish");
	}
	
	private void display(String msg, Student student) {
		System.out.println(msg + " : Student Info ->" + student.getId() + ", " + student.getFirstName() + " " + student.getLastName());
	}
}
