package com.mindtree.codingChallenge.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.codingChallenge.entity.Class;
import com.mindtree.codingChallenge.entity.Student;
import com.mindtree.codingChallenge.exception.ServiceException;
import com.mindtree.codingChallenge.repository.ClassRepository;
import com.mindtree.codingChallenge.repository.StudentRepository;
import com.mindtree.codingChallenge.service.ClassService;
@Service
public class ClassServiceImpl implements ClassService {
@Autowired
ClassRepository classRepository;
@Autowired
StudentRepository studentRepository;
	@Override
	public void addClassToDatabase(Class class1) {
		classRepository.save(class1);
	}

	@Override
	public List<Class> getAllClass() {
		return classRepository.findAll();
	}

	@Override
	public void addStudentToDatabase(Student student) throws ServiceException {
		Class class1=classRepository.findById(student.getStudentClass().getClassId()).get();
		//System.out.println(class1.getClassStudents().size()+"  "+class1.getClassNumOfStudents());
		if(class1.getClassStudents().size()+1>class1.getClassNumOfStudents())
		{
			throw new ServiceException("no new Students can be added");
		}
		else
		{
			studentRepository.save(student);
		}
		
	}

	@Override
	public List<Student> getAllStudentinClass(int classId) {
		return classRepository.findById(classId).get().getClassStudents();
	}

}
