package com.chinmay.springdatajpatutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tbl_student" , uniqueConstraints ={ @UniqueConstraint(name = "emailId_unique", columnNames = "email_address") /*, @UniqueConstraint(name = "guardian_emailId_unique", columnNames = "guardianEmail")*/} )
public class Student {

    @Id
    @SequenceGenerator(name = "studentId_sequence", initialValue = 1, sequenceName = "studentId_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentId_sequence")
    private Long studentId;
    private String firstName;
    private String lastName;


    @Column(name = "email_address", nullable = false,unique = true)
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;

}
