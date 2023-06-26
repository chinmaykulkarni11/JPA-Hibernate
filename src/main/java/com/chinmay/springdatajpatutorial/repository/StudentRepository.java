package com.chinmay.springdatajpatutorial.repository;

import com.chinmay.springdatajpatutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

@Resource
public interface StudentRepository extends JpaRepository<Student,Long> {
}
