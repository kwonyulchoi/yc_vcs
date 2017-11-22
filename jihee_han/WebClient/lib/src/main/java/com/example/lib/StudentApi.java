package com.example.lib;

import java.util.List;

public interface StudentApi {
	public List<Student> getStudents();
	public Student PostStudent(Student student);
}
