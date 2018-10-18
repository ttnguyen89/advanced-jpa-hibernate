package nguyentt.dev.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nguyentt.dev.demo.entity.Course;
import nguyentt.dev.demo.repository.CourseRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		courseRepository.save(new Course("Microservices in 100 Steps"));
	}
}
