package com.mindtree.studentapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Report {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
	private long id;
	private float cgpa;
	private int sem;
	
	@ManyToOne
	@JoinColumn(name="registrationNumber")
	private Student student;
	//private String registrationNumber;

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Report(long id, float cgpa, int sem, Student student) {
		super();
		this.id = id;
		this.cgpa = cgpa;
		this.sem = sem;
		this.student = student;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Report [id=" + id + ", cgpa=" + cgpa + ", sem=" + sem + ", student=" + student + "]";
	}

	

}
