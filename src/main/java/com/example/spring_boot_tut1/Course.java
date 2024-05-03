package com.example.spring_boot_tut1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class Course {

    public Course(Comparable<String> courses, String department) {
    }

    public static void main(String[] args) {
        SpringApplication.run(Course.class, args);
    }

    @GetMapping("foundationCourses")
    public String getCourses(@RequestParam(value = "foundation", defaultValue = "Computer literacy for science, elementary computer programming") String courses) {
        return "foundation, courses";
    }

    @GetMapping("undergraduateCourses")
    public String getUndergraduateCourses(@RequestParam(value = "undergraduate", defaultValue = "Advanced Programming, Computer Architecture and Organisation, Database Management Design, Data structures and algorithm") String courses) {
        return "undergraduate, courses";
    }

    @GetMapping("honoursCourses")
    public String gethonoursCourses(@RequestParam(value = "honours", defaultValue = "Advanced Programming, Computer Architecture and Organisation, Database Management Design, Data structures and algorithm") String courses) {
        return "undergraduate, courses";

    }

}
