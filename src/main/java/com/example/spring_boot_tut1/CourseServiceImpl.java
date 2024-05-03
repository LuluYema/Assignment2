package com.example.spring_boot_tut1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getFoundationCourses() {
        return courseRepository.findByType("Foundation");
    }

    @Override
    public List<Course> getUndergraduateCourses() {
        return courseRepository.findByType("Undergraduate");
    }

    @Override
    public List<Course> getHonoursCourses() {
        return courseRepository.findByType("Honours");
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(Long id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        return courseOptional.orElse(null);
    }

    @Override
    public Course updateCourse(Long id, Course courseDetails) {
        Course course = courseRepository.findById(id).orElse(null);
        if (course != null) {



            course.gethonoursCourses(courseDetails.getCourses(course.gethonoursCourses("")));
            course.getUndergraduateCourses(courseDetails.getUndergraduateCourses(course.gethonoursCourses("")));
            return courseRepository.save(course);
        }
        return null;
    }

    @Override
    public boolean deleteCourse(Long id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        if (courseOptional.isPresent()) {
            courseRepository.deleteById(id);
            return true;
        }
        return false;
    }
}