package com.school.controller;

import com.school.domain.Person;
import com.school.domain.Student;
import com.school.domain.Teacher;
import com.school.repository.PersonRepository;
import org.jsondoc.core.annotation.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;


@Api(
        name = "OAuth Process API",
        description = "Methods for the OAuth Proccess",
        group = "oauth service"
)
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(
            value = "/create",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity loginURL() throws UnsupportedEncodingException {

        Student student = new Student();

        student.setName("student " + System.currentTimeMillis());
        student.setEmail("test@test.com");
        student.setClassName("CS 01");

        personRepository.save(student);

        Teacher teacher = new Teacher();

        teacher.setName("teacher " + System.currentTimeMillis());
        teacher.setMainSubject("computer science");
        teacher.setSalary(1000000000);

        personRepository.save(teacher);


        Iterable<Person> list = personRepository.findAll();

        return ResponseEntity.ok(list);
    }
}