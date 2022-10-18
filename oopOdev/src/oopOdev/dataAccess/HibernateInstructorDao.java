package oopOdev.dataAccess;

import oopOdev.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabınına eklendi");

	}

}
