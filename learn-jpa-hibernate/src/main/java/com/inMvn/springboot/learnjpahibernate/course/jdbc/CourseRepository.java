package com.inMvn.springboot.learnjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.inMvn.springboot.learnjpahibernate.course.Course;

@Repository
public class CourseRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static String insert_Query=
			"insert into course(id,name,author)values(?,?,?)";
	
	public static String Delete_Query=
			"delete from course where id=?";
	public static String Select_Query=
			"select * from course where id=?";
	
	public void insert(Course course) {
		jdbcTemplate.update(insert_Query);
	}
	public void deleteById(long id) {
jdbcTemplate.update(Delete_Query,id);
}
	public Course findById(long id) {
		return jdbcTemplate.queryForObject(Select_Query, 
				new BeanPropertyRowMapper<>(Course.class),id);
		//ResultSet->Bean=>Row Mapper
		
		
	}
}
