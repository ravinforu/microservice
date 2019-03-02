package com.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.course.bean.Course;
import com.course.bean.Fee;

@Service
public class CourseService {
	
	private static final String feesServiceURL = "http://localhost:8091/fees";
	RestTemplate restTemplate=new RestTemplate();
	List<Course> course_al=new ArrayList<Course>();
	
	public CourseService(){
		course_al.add(new Course(1,"Java"));
		course_al.add(new Course(2,"Spring"));
	}
	
	public List<Course> getAllCourse(){
		System.out.println("G="+course_al);
			return course_al;
	}
	
	public Course getCourse(int idParam){
		Course course=null;
		boolean flag=false;
		for(int i=0;i<course_al.size();i++){
			course=course_al.get(i);
			if(course.getId()==idParam){
				flag=true;
				Fee fee= getFee(course);
					course.setFee(fee);
				break;
			}
		}
		if(flag==false) {
			course=new Course();
		}
		System.out.println("GetCourse="+course);

		return course;
	}

	private Fee getFee(Course course) {
		Fee fee= restTemplate.getForObject(feesServiceURL+"?id="+course.getId(),Fee.class);
		return fee;
	}
}