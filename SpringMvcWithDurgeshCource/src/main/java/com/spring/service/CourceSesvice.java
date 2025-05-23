package com.spring.service;

import java.util.List;

import com.spring.entity.Course;

public interface CourceSesvice {
	public List<Course>getCourse();
	public Course getCourseName(long courseId);

}
