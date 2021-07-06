package com.mindtree.studentapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.studentapplication.entity.Report;

public interface ReportDao extends JpaRepository<Report, Long> {

}
