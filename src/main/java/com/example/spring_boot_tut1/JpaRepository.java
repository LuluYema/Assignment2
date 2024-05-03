package com.example.spring_boot_tut1;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface JpaRepository<T, T1> {
    List<Course> findByType(String type); // Returns a list of courses with the specified type

    List<Course> findByNameContaining(String name); // Returns a list of courses with names containing the specified string

}