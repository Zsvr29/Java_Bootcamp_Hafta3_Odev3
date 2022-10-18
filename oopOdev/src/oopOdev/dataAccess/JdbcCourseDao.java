package oopOdev.dataAccess;

import oopOdev.entities.Course;

public class JdbcCourseDao implements CourseDao{

	
	public void add(Course course) {
		
		System.out.println("JDBC ile veritabınına eklendi");
		
	}

}
