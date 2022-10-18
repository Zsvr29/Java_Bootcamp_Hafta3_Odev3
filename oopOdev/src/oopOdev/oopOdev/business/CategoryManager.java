package oopOdev.oopOdev.business;

import java.util.List;

import oopOdev.coreLogging.Logger;
import oopOdev.dataAccess.CategoryDao;
import oopOdev.dataAccess.HibernateCategoryDao;
import oopOdev.dataAccess.JdbcCategoryDao;
import oopOdev.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers2;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers2) {
		this.categoryDao=categoryDao;
		this.loggers2=loggers2;
		
	}
	public void add(Category category)throws Exception {
		if(category.getCategoryName() != category.getCategoryName()) {
			throw new Exception("Kategori ismi tekrar edemez.");
			
		}
		
		  categoryDao.add(category);
		for(Logger logger:loggers2) {
			logger.log(category.getCategoryName());
		}
		
		
	}

}
