package com.example.spring_boot_tut1;

public class CourseBuilder {
    private Comparable<String> courses;
    private String department;

    public CourseBuilder setCourses(Comparable<String> courses) {
        this.courses = courses;
        return this;
    }

    public CourseBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Course createCourse() {
        return new Course(courses, department);
    }
}