package oopOdev.dataAccess;

import oopOdev.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	
	public void add(Category category) {
		System.out.println("Hibernate ile veritabınına eklendi");

		
	}

}
