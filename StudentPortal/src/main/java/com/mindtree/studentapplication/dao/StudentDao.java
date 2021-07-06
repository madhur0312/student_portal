package com.mindtree.studentapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.studentapplication.entity.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

}
