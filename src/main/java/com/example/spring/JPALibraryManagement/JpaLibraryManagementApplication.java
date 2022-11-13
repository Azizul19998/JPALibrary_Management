package com.example.spring.JPALibraryManagement;

import com.example.spring.JPALibraryManagement.Repository.CardRepository;
import com.example.spring.JPALibraryManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaLibraryManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaLibraryManagementApplication.class, args);

	}

	@Autowired
	CardRepository cardRepository;
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		//this will automatically when the application starts
	Student student = new Student("Azizul",22, "India");
	Card card = new Card();
	student.setCard(card);
	int amount=student.getCard().getFine();

  cardRepository.save(card);
  studentRepository.save(student);

	}
}
