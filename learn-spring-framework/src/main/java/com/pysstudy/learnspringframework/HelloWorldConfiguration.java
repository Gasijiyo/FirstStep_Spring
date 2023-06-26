package com.pysstudy.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// Released in JDK16
record Person (String name, int age, Address address) {};	

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 99;
	}
	
	@Bean
	public Person person() {
		return new Person("YS", 29, new Address("강남구", "서울시"));
	}
	
	@Bean 
	public Person person2MethodCall() {
		return new Person("새이름", 100, address());
	}
	
	@Bean 
	public Person person3Parameters(String name, int age, Address 주소) {
		return new Person(name, age, 주소);
	}
	
	@Bean 
	@Primary
	// No qualifying bean of type 'com.pysstudy.learnspringframework.Address'
	// available: expected single matching bean but found 2: 주소,address3
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean 
	// No qualifying bean of type 'com.pysstudy.learnspringframework.Address'
	// available: expected single matching bean but found 2: 주소,address3
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name = "주소")
	@Primary
	public Address address() {
		return new Address ("응암동","서울특별시");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address ("교현동","충주시");
	}
	
}
