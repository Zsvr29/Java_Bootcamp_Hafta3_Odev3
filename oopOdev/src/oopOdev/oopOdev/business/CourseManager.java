package oopOdev.oopOdev.business;

import java.util.Iterator;

import oopOdev.coreLogging.Logger;
import oopOdev.dataAccess.CourseDao;
import oopOdev.entities.Course;

public class CourseManager {
	
	 private  CourseDao courseDao;
	  private Logger[] loggers;
	  
	  public CourseManager(CourseDao courseDao,Logger[]loggers) {
		  this.courseDao=courseDao;
		  this.loggers=loggers;
	  }
	  public  void add(Course course) throws Exception {
	
	if (course.getPrice()<0 && course.getName()!=course.getName()) {
		throw new Exception("Kurs fiyatı 0' dan küçük olamaz ve kurs ismi tekrar edemez");
		
	}
	courseDao.add(course);
	for(Logger logger: loggers) {
		logger.log(course.getName());
	}

}
}