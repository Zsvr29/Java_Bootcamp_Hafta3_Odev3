package oopOdev.dataAccess;

import oopOdev.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabınına eklendi");
		
	}

}
