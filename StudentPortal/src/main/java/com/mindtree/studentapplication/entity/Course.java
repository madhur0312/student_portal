package com.mindtree.studentapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Course {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
	private long id;
	//@Column(unique = true)
	private String courseCode;
	private String courseName;
	private int duration;

	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
	private List<Student> students;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String courseCode, String courseName, int duration, List<Student> students) {
		super();
		this.id = id;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.duration = duration;
		this.students = students;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseCode=" + courseCode + ", courseName=" + courseName + ", duration="
				+ duration + ", students=" + students + "]";
	}

}
