package com.example.spring_boot_tut1;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByType(String type);

    Optional<Course> findById(Long id);

    Course save(Course course);
    List<Course> getCourseByName(String name);

    List<Course> getCourseByType(String type);

    void deleteById(Long id);

    // Get methods
    List<Course> findAll();

    Course findByName(String name);

    Course findByTypeAndId(String type, Long id);

    // Set methods
    <S extends Course> S saveAndFlush(S entity);

    void deleteInBatch(Iterable<Course> entities);

    void deleteAllInBatch();

    Course getById(Long id);
}