package oopOdev.oopOdev.business;

import oopOdev.coreLogging.Logger;
import oopOdev.dataAccess.InstructorDao;
import oopOdev.entities.Instructor;

public class InstructorManager {
	private InstructorDao ınstructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao ınstructorDao, Logger[] loggers) {
		this.ınstructorDao=ınstructorDao;
		this.loggers=loggers;
	}
  public void add(Instructor ınstructor) {
	  
	  ınstructorDao.add(ınstructor);
	  for(Logger logger:loggers) {
		  logger.log(ınstructor.getFirstName());
	  }
  }
  
  
}
