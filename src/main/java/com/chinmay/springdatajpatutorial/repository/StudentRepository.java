package com.chinmay.springdatajpatutorial.repository;

import com.chinmay.springdatajpatutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String name);

    List<Student> findByLastName(String name);


    List<Student> findByFirstNameContaining(String name);

    List<Student> findByLastNameNotNull();

    List<Student> findByGuardianName(String guardianName);

    Student findByFirstNameAndLastName(String firstName, String lastName);


}
