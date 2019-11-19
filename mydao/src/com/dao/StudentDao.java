package com.dao;
import java.util.List;

import object.Student;

public interface StudentDao {
	public void insertStudent(Student stu);
	public void updateStudent(Student stu);
	public void deleteStudent(Student stu);
	public Student getStudent(String sid);
	public List<Student> getStudentBySql(String sql);
	public void insertPStudent(Student stu);
}
