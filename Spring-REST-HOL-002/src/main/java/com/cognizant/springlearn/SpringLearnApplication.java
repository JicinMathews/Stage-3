package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
		displayCountries();
	}
	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		System.out.println("Answer 1");
		LOGGER.debug("Country : {}", country.toString());
		System.out.println("Answer 2");
		LOGGER.debug("Country : {}", anotherCountry.toString());
	}
	public static void displayCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country>list=(List<Country>)context.getBean("countryList");
		System.out.println("Answer 3 ");
		for(Country country:list) {
			LOGGER.debug("Country : {}", country.toString());
		}
	}
}
