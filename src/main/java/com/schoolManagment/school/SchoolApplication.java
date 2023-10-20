package com.schoolManagment.school;

import com.schoolManagment.school.entity.Instructor;
import com.schoolManagment.school.entity.Student;
import com.schoolManagment.school.repository.InstructorRepository;
import com.schoolManagment.school.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SchoolApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private InstructorRepository instructorRepository;
	private static final Logger logger =(Logger) LoggerFactory.getLogger(SchoolApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
		logger.info("SchoolApplication Started");
	}

	@Override
	public void run(String... args) throws Exception {
		Instructor instructor1 = new Instructor(1L,"Alex","Own",new ArrayList<>());
		Instructor instructor2 = new Instructor(2L,"Brian", "John", new ArrayList<>());
		Instructor instructor3 = new Instructor(3L,"David", "Smith", new ArrayList<>());
		instructorRepository.save(instructor1);
		instructorRepository.save(instructor2);
		instructorRepository.save(instructor3);
		List<Student> students = Arrays.asList(
			new Student("Abdu", "Adam", "abdu@gmail.com", "Java", instructor1),
				new Student("Alex", "Ayu", "alex@gmail.com", "HTml", instructor2),
				new Student("Sara", "Moran", "sara@gmail.com", "Python", instructor3),
				new Student("Emily", "Logan", "emily@gmail.com", "Java", instructor1),
				new Student("John", "Johnson", "johnson@gmail.com", "Java", instructor2),
                new Student("David", "Smith", "david@gmail.com", "Java", instructor3),
				new Student("Emily", "Logan", "emily@gmail.com", "Java", instructor1),
                new Student("John", "Johnson", "johnson@gmail.com", "Java", instructor2),
                new Student("David", "Smith", "david@gmail.com", "Java", instructor3));
		studentRepository.saveAll(students);
		studentRepository.findAll().forEach(student->logger.info(student.getFirstName() +" " +student.getLastName()));




	}
}
