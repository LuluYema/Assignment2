package com.example.spring_boot_tut1;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Course{
    public Course(Comparable<String> Courses,
                  String Department) {

    }

    @GetMapping("/foundation")
    public List<Course> getFoundationCourses() {
        List<Course> foundationCourses = new ArrayList<>();
        foundationCourses.add(new CourseBuilder().setCourses("Foundation Course 1").setDepartment("Computer Science Department").createCourse());
        foundationCourses.add(new CourseBuilder().setCourses("Foundation Course 2").setDepartment("Computer Science Department").createCourse());

        return foundationCourses;
    }

    // Define the endpoint for undergraduate courses
    @GetMapping("/undergraduate")
    public List<Course> getUndergraduateCourses() {
        List<Course> undergraduateCourses = new ArrayList<>();
        undergraduateCourses.add(new CourseBuilder().setCourses("Undergraduate Course 1").setDepartment("Computer Science Department").createCourse());
        undergraduateCourses.add(new CourseBuilder().setCourses("Undergraduate Course 2").setDepartment("Computer Science Department").createCourse());
        undergraduateCourses.add(new CourseBuilder().setCourses("Undergraduate Course 3").setDepartment("Computer Science Department").createCourse());
        undergraduateCourses.add(new CourseBuilder().setCourses("Undergraduate Course 4").setDepartment("Computer Science Department").createCourse());
        undergraduateCourses.add(new CourseBuilder().setCourses("Undergraduate Course 5").setDepartment("Computer Science Department").createCourse());

        return undergraduateCourses;
    }

    // Define the endpoint for honors courses
    @GetMapping("/honors")
    public List<Course> getHonorsCourses() {
        List<Course> honorsCourses = new ArrayList<>();
        honorsCourses.add(new CourseBuilder().setCourses("Honors Course 1").setDepartment("Computer Science Department").createCourse());
        honorsCourses.add(new CourseBuilder().setCourses("Honors Course 2").setDepartment("Computer Science Department").createCourse());
        honorsCourses.add(new CourseBuilder().setCourses("Honors Course 3").setDepartment("Computer Science Department").createCourse());
        honorsCourses.add(new CourseBuilder().setCourses("Honors Course 4").setDepartment("Computer Science Department").createCourse());

        return honorsCourses;
    }
}
