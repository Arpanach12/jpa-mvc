package com.mindtree.codingChallenge.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Class {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int classId;
private String classSection;
private String classTeacherName;
private int classNumOfStudents;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "studentClass")
private List<Student> classStudents;
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public String getClassSection() {
	return classSection;
}
public void setClassSection(String classSection) {
	this.classSection = classSection;
}
public String getClassTeacherName() {
	return classTeacherName;
}
public void setClassTeacherName(String classTeacherName) {
	this.classTeacherName = classTeacherName;
}
public int getClassNumOfStudents() {
	return classNumOfStudents;
}
public void setClassNumOfStudents(int classNumOfStudents) {
	this.classNumOfStudents = classNumOfStudents;
}
public List<Student> getClassStudents() {
	return classStudents;
}
public void setClassStudents(List<Student> classStudents) {
	this.classStudents = classStudents;
}

}
