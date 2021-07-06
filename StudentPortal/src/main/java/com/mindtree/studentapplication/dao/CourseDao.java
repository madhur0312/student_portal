package com.mindtree.studentapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.studentapplication.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
