package nguyentt.dev.demo.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import nguyentt.dev.demo.DemoApplication;
import nguyentt.dev.demo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepository;
	
	@Test
	public void contextLoads() {
		Course course = courseRepository.findById(10001L);
		assertEquals("JPA in 50 Steps", course.getName());
	}
}
