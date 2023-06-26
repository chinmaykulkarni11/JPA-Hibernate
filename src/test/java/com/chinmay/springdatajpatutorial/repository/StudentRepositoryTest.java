package com.chinmay.springdatajpatutorial.repository;

import com.chinmay.springdatajpatutorial.entity.Guardian;
import com.chinmay.springdatajpatutorial.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;


    @Test
    public void addStudentWithGuardian() {
        Guardian guardian = Guardian.builder().email("pappa2@gmail.com").mobile("123452").name("Pap2pa").build();
        Student student = Student.builder().firstName("Chinmay").lastName("Kulkarni").emailId("csk2@gmail.com").guardian(guardian).build();
        studentRepository.save(student);
    }

    @Test
    public void getAllStudent() {
        List<Student> students = studentRepository.findAll();
        log.info("Students are : {}", students);
    }
}