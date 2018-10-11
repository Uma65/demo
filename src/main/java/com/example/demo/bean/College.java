package com.example.demo.bean;

public class College {
private Integer id ;
private String collegeName;
private Student student;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Integer getCollegeCode() {
	return id ;
}
public void setCollegeCode(Integer collegeCode) {
	this.id  = collegeCode;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}


}
