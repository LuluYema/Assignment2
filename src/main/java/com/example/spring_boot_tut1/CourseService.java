package com.example.spring_boot_tut1;



import java.util.List;

public interface CourseService {
    List<Course> getFoundationCourses();

    List<Course> getUndergraduateCourses();

    List<Course> getHonoursCourses();

    Course createCourse(Course course);

    Course getCourseById(Long id);

    Course updateCourse(Long id, Course courseDetails);

    boolean deleteCourse(Long id);
}