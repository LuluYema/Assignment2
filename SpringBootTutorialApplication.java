package com.example.spring_boot_tutorial;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);


    }


    @GetMapping("/hello!")

    public String sayHello(@RequestParam(value = "myName", defaultValue = "name")String name) {

        return String.format("Hello%s!", name);
    }

}

class Course {

    public Course(String courseA, String computerScienceDepartment) {

    }
}@RestController
class Courses {


    @GetMapping("/foundation")
    public List<Course> getFoundationCourses() {
        List<Course> foundationCourses = new ArrayList<>();
        foundationCourses.add(new Course("Course A", "Computer Science Department"));
        foundationCourses.add(new Course("Course B", "Computer Science Department"));

        return foundationCourses;
    }

    // Define the endpoint for undergraduate courses
    @GetMapping("/undergraduate")
    public List<Course> getUndergraduateCourses() {
        List<Course> undergraduateCourses = new ArrayList<>();
        undergraduateCourses.add(new Course("Course 1", "Computer Science Department"));
        undergraduateCourses.add(new Course("Course 2", "Computer Science Department"));
        undergraduateCourses.add(new Course("Course 3", "Computer Science Department"));
        undergraduateCourses.add(new Course("Course 4", "Computer Science Department"));
        undergraduateCourses.add(new Course("Course 5", "Computer Science Department"));

        return undergraduateCourses;
    }

    @GetMapping("/honors")
    public List<Course> getHonorsCourses() {
        List<Course> honorsCourses = new ArrayList<>();
        honorsCourses.add(new Course("Course X", "Computer Science Department"));
        honorsCourses.add(new Course("Course Y", "Computer Science Department"));
        honorsCourses.add(new Course("Course Z", "Computer Science Department"));
        honorsCourses.add(new Course("Course W", "Computer Science Department"));

        return honorsCourses;
    }
}

