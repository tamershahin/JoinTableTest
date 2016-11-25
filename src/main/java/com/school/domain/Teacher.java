package com.school.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("TEACHER")
@Table(name = "teacher")
@PrimaryKeyJoinColumn(name = "teacher_id", referencedColumnName = "person_id")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
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
