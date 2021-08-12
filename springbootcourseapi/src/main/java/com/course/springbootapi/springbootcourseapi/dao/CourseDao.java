package com.course.springbootapi.springbootcourseapi.dao;

import com.course.springbootapi.springbootcourseapi.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
}
