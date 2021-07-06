package com.mindtree.studentapplication.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Student {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
	private long id;
	//@Column(unique = true)
	private String registrationNumber;

	private String name;
	private Date dob;
	private String gender;
	
	@ManyToOne
	@JoinColumn(name="courseCode")
	@JsonIgnore
	private Course course;

	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Report> reports;
	
	
	@Transient
	private String email;
	@Transient
	private String password;

	public Student() {
		super();
	}

	

	public Student(long id, String registrationNumber, String name, Date dob, String gender, Course course,
			List<Report> reports, String email, String password) {
		super();
		this.id = id;
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.course = course;
		this.reports = reports;
		this.email = email;
		this.password = password;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	

	public List<Report> getReports() {
		return reports;
	}



	public void setReports(List<Report> reports) {
		this.reports = reports;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", registrationNumber=" + registrationNumber + ", name=" + name + ", dob=" + dob
				+ ", gender=" + gender + ", course=" + course + ", reports=" + reports + ", email=" + email
				+ ", password=" + password + "]";
	}


}
