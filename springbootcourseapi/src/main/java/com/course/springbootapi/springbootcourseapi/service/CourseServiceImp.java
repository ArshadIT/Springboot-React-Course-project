package com.course.springbootapi.springbootcourseapi.service;

import com.course.springbootapi.springbootcourseapi.dao.CourseDao;
import com.course.springbootapi.springbootcourseapi.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseDao courseDao;
    //List<Course> list;

    public CourseServiceImp() {
        //list = new ArrayList<>();
        //list.add(new Course(145, "Java", "this course for Java"));
        //list.add(new Course(109, "Java spring boot", "this course for spring boot"));
    }

    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
//        Course c = null;
//        for (Course course : list) {
//            if (course.getId() == courseId) {
//                c = course;
//                break;
//            }
//        }
//        return c;

        return courseDao.getById(courseId);
    }

    @Override
    public Course addCourse(Course course) {

        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        // list.forEach(e -> {
        ////   if (e.getId() == course.getId()) {
        //   e.setTitle(course.getTitle());
        // e.setDescription(course.getDescription());
        //}
        //});
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(long parseLong) {
        ////////   .collect(Collectors.toList());
        courseDao.getById(parseLong);
        courseDao.delete(courseDao.getById(parseLong));
    }


}
