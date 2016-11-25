package com.school.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("student")
@Table(name = "student_detail",schema = "school_service")
@PrimaryKeyJoinColumn(name = "student_id", referencedColumnName = "person_id")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {

    @Column(length = 32, nullable = false)
    @Getter
    @Setter
    String email;

    @Column(length = 32, nullable = false)
    @Getter
    @Setter
    String className;
}
