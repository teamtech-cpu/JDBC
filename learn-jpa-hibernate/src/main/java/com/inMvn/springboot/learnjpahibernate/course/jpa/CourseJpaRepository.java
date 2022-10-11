package com.inMvn.springboot.learnjpahibernate.course.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.inMvn.springboot.learnjpahibernate.course.Course;

@Repository
@Transactional
public class CourseJpaRepository {
	//to maintian our entity classes we go for
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
public Course findById(long id) {
	return entityManager.find(Course.class, id);
}
public void deleteById(long id) {
	Course course = entityManager.find(Course.class, id);
	entityManager.remove(course);
}
}


/*
 * /
 * 
 * JDBC: ---writing lot of sql queries
 * and write a lot of java code
 * spring JDBC:
 * write a lot of sql queries
 * But lesser java code
 * JPA:
 * Do Not worry about queries
 * Just Map Entityes to table
 * 
 * Spring Data JPA
 * Let's make JPA even more simple!
 * I will ttake care of everything
 * 
 * 
 * 
 * 
 */



