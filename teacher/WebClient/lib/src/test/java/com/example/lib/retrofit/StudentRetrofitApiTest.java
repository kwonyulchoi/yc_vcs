package com.example.lib.retrofit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.example.lib.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRetrofitApiTest {

//	String HTTP_URL = "http://localhost:8080";
	String HTTP_URL = "http://ec2-52-79-81-133.ap-northeast-2.compute.amazonaws.com:8080";
	
	private static int tempId;
	private StudentRetrofitApi api;
	
	public StudentRetrofitApiTest() {
		System.out.println("StudentRetrofitApiTest Created");
	}
	
	@Before
	public void setUp() {
		api = new StudentRetrofitApi(HTTP_URL);
	}
	
	@After
	public void tearDown() {
		api = null;
	}
	
	@Test
	public void TC01_getStudents() {
		int expectedSize = 3;
		
		List<Student> actual = api.getStudents();
		
		assertNotNull(actual);
		assertTrue(actual.size() >= expectedSize);
	}
	
	@Test
	public void TC02_postStudent() {
		Student student = new Student(null, "AaaTC", "BbbTC");
		
		Student actual = api.PostStudent(student);
		
		assertNotNull(actual);
		assertTrue(actual.getId() >= 1);		
		tempId = actual.getId();
	}
	
	@Test
	public void TC03_deleteStudent() {
		Boolean actual = api.deleteStudent(tempId);
		
		assertTrue(actual);
	}
	
	@Test
	public void TC04_deleteStudent() {
		Boolean actual = api.deleteStudent(10000);
		
		assertTrue(!actual);
	}

}
