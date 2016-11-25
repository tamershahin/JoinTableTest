package com.school.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "abstract_person")
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    @Column(name="person_id")
    private Long id;

    @Column(nullable = false, length = 125, name="name")
    @Getter
    @Setter
    String name;

    @Column(name = "person_type", nullable = false, insertable = false, updatable = false)
    @Getter@Setter
    String personType;

}
