package com.example.spring_boot_tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    // Define the endpoint for foundation courses
    @GetMapping("/foundation")
    public List<Course> getFoundationCourses() {
        List<Course> foundationCourses;
        foundationCourses = new ArrayList<>();
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

    // Define the endpoint for honors courses
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
