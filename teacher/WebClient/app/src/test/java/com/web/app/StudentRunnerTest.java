package com.web.app;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import com.example.lib.Student;
import com.example.lib.StudentApi;

public class StudentRunnerTest {

	private String firstName = "Aaa";
	private String lastName = "Bbb";
	
	@Test
	@Ignore
	public void testRunner() {
		StudentRunner runner = new StudentRunner();
		
		Boolean run = runner.run(firstName, lastName);
		
		assertTrue(!run);
	}
	
	@Test
	public void testRunnerUsingDummy() {
		StudentApi dummy = Mockito.mock(StudentApi.class);
		StudentRunner runner = new StudentRunner(dummy);
		
		Boolean run = runner.run(firstName, lastName);
		
		assertTrue(!run);
	}
	
	@Test
	public void testRunnerUsingMock() {
		StudentApi mock = Mockito.mock(StudentApi.class);
		StudentRunner runner = new StudentRunner(mock);
		
		runner.run(firstName, lastName);
		
		Mockito.verify(mock, Mockito.times(2)).getStudents();
		Mockito.verify(mock, Mockito.atLeastOnce()).postStudent(Mockito.any());
		
		InOrder inOrder = Mockito.inOrder(mock);
		inOrder.verify(mock).getStudents();
		inOrder.verify(mock).postStudent(Mockito.any());
		inOrder.verify(mock).getStudents();
	}
	
	@Test
	public void testRunnerUsingStub() {
		StudentApi stub = Mockito.mock(StudentApi.class);
		Mockito.when(stub.getStudents()).thenReturn(Arrays.asList(new Student(1, firstName, lastName)));
		Mockito.when(stub.postStudent(Mockito.anyObject())).thenReturn(new Student(1, firstName, lastName));
		StudentRunner runner = new StudentRunner(stub);
		
		Boolean run = runner.run(firstName, lastName);
		
		assertTrue(run);
	}
	
	@Test
	public void testRunnerUsingSpy() {
		StudentApi dummy = Mockito.mock(StudentApi.class);
		StudentRunner spy = Mockito.spy(new StudentRunner(dummy));
		
		spy.run(firstName, lastName);
		
		Mockito.verify(spy, Mockito.times(0)).display(Mockito.anyString(), Mockito.any());
	}
}
