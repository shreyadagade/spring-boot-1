package com.itshaala.springboot1.service;

import com.itshaala.springboot1.dao.CourseRepository;
import com.itshaala.springboot1.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class CourseService {
    CourseRepository courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);

    }

    public void deleteCourse(int courseId) {
        courseRepository.deleteById(courseId);
    }


    public Course getCourseById(int courseId) {

       return courseRepository.findById(courseId).get();
    }

    public void deleteAll() {
        courseRepository.deleteAll();
    }

    public void addAllCourses(List<Course> courses) {
        courseRepository.saveAll(courses);
    }

    public void updateAllCourses(List<Course> courses) {
      List<Course> courseList =  courseRepository.findAllById(
                courses.stream()
                        .map(course -> course.getCourseId())
                        .collect(Collectors.toList()));
                courseRepository.saveAll(courseList);

    }
}
