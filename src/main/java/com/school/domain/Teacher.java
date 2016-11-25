package com.school.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
@PrimaryKeyJoinColumn(name = "teacher_id", referencedColumnName = "person_id")
public class Teacher extends Person{

    @Getter
    @Setter
    @Column(name = "main_subject")
    private String mainSubject;

    @Getter
    @Setter
    @Column(name = "salary")
    private int salary;
}
