package com.fullcycle.FCCatalogo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fullcycle.FCCatalogo.domain.entity.Category;
import com.fullcycle.FCCatalogo.domain.entity.Genre;

@SpringBootApplication
public class FcCatalogoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FcCatalogoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Genre genre = new Genre("Genre 1");
		Category category1 = new Category("Category 1");
		genre.addCategory(category1);
		System.out.println("Genre name: " + genre.getId() + " " + genre.getName() + " " + genre.getCategories());
	}

}
