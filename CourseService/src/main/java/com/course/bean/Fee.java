package com.course.bean;

public class Fee {
	private int courseId;
	private int  courseFee;
	
	
	
	
	@Override
	public String toString() {
		return "Fee [courseId=" + courseId + ", courseFee=" + courseFee + "]";
	}

	public Fee() {}
	
	public Fee(int courseId, int courseFee) {
		super();
		this.courseId = courseId;
		this.courseFee = courseFee;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	

}
