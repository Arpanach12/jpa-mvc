package com.mindtree.codingChallenge.service;

import java.util.List;

import com.mindtree.codingChallenge.entity.Class;
import com.mindtree.codingChallenge.entity.Student;
import com.mindtree.codingChallenge.exception.ServiceException;

public interface ClassService {

	void addClassToDatabase(Class class1);

	List<Class> getAllClass();

	void addStudentToDatabase(Student student) throws ServiceException;

	List<Student> getAllStudentinClass(int classId);

}
