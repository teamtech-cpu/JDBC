package com.inMvn.springboot.learnjpahibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.inMvn.springboot.learnjpahibernate.course.Course;
import com.inMvn.springboot.learnjpahibernate.course.jdbc.CourseRepository;

public class CourseCommandlineRunnerJpa implements CommandLineRunner {
	@Autowired
	private CourseJpaRepository courseRepository;

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseRepository.insert(new Course(1L,"Learn JAva","in28Minutes"));
				courseRepository.insert(new Course(2L,"Learn SQl","in30Minutes"));
				courseRepository.insert(new Course(3L,"Learn AWS","in48Minutes"));
courseRepository.deleteById(1L);
System.out.println(courseRepository.findById(2));
}
}
