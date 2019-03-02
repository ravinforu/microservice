package com.course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.course.bean.Course;
import com.course.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(method=RequestMethod.GET,value="/course")
	public List<Course> getAllCourse(){
		System.out.println("getAllCourse");
		return courseService.getAllCourse();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/course/{idParam}")
	public Course getCourse(@PathVariable int idParam){
		System.out.println("getCourse");
			return courseService.getCourse(idParam);
	}
}
