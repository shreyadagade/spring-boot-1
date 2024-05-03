package com.itshaala.springboot1.controller;

import com.itshaala.springboot1.model.Course;
import com.itshaala.springboot1.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
@AllArgsConstructor

public class CourseController {
    CourseService courseService;

    @PostMapping
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);



    }

    @PostMapping("/bulk")
    public void addAllCourses(@RequestBody List<Course> courses){
        courseService.addAllCourses(courses);
    }


    @PutMapping
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @PutMapping("/bulk")
    public void updateAllCourses(@RequestBody List<Course> courses){
        courseService.updateAllCourses(courses);
    }


    @GetMapping
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/{courseId}")
    public Course getCourseById(@PathVariable("courseId") int courseId){
        return courseService.getCourseById(courseId);
    }





    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable("courseId") int courseId){
        courseService.deleteCourse(courseId);
    }

    @DeleteMapping("/bulk")
    public void deleteAllCourses(){
        courseService.deleteAll();
    }
}
