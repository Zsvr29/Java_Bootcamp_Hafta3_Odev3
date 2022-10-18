package oopOdev;

import oopOdev.coreLogging.DatabaseLogger;
import oopOdev.coreLogging.FileLogger;
import oopOdev.coreLogging.MailLogger;
import oopOdev.dataAccess.JdbcCategoryDao;
import oopOdev.dataAccess.JdbcCourseDao;
import oopOdev.dataAccess.JdbcInstructorDao;
import oopOdev.entities.Category;
import oopOdev.entities.Course;
import oopOdev.entities.Instructor;
import oopOdev.oopOdev.business.CategoryManager;
import oopOdev.oopOdev.business.CourseManager;
import oopOdev.oopOdev.business.InstructorManager;
import oopOdev.coreLogging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1=new Course(1,"Java",5000);
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course1);
		
		
		Category category1= new Category(1,"Kamp");
		Logger[] loggers2= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		CategoryManager categoryManager= new CategoryManager(new JdbcCategoryDao(),loggers2);
		categoryManager.add(category1);
		
		Instructor ınstructor1= new Instructor(1,"Engin","Demiroğ");
		Logger[] loggers1= {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		InstructorManager ınstructorManager= new InstructorManager(new JdbcInstructorDao(), loggers1);
	    ınstructorManager.add(ınstructor1);	
	}
		
	
		
		
	}


