package com.sesc.mapping;

import com.sesc.mapping.entities.Address;
import com.sesc.mapping.entities.Student;
import com.sesc.mapping.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;


@SpringBootApplication
public class MappingApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	private Logger logger = LoggerFactory.getLogger(MappingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		Address studentAddress = new Address();
		student.setStudentCourse("BSC");
		student.setStudentName("Bryan");
		student.setStudentId(774);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		student.setDateOfBirth(format.parse("03/07/1990"));

		studentAddress.setCountryName("Philippines");
		studentAddress.setPostCode("2316");
		studentAddress.setStreetName("Basilio Street");
		studentAddress.setStudent(student);

		student.setAddress(studentAddress);

		Student save = studentRepository.save(student);

		logger.info("saved student : {}", save.getStudentName());
	}
}
