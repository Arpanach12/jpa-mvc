package com.mindtree.codingChallenge.entity;



import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int studentId;
private String studentName;
private Date studentDateOfBirth;
private int studentAge;
@ManyToOne(cascade = CascadeType.PERSIST)
private Class studentClass;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public Date getStudentDateOfBirth() {
	return studentDateOfBirth;
}
public void setStudentDateOfBirth(Date studentDateOfBirth) {
	this.studentDateOfBirth = studentDateOfBirth;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public Class getStudentClass() {
	return studentClass;
}
public void setStudentClass(Class studentClass) {
	this.studentClass = studentClass;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
} 


}
