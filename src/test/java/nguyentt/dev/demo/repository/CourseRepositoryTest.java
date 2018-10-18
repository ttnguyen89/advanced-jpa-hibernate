package nguyentt.dev.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import nguyentt.dev.demo.DemoApplication;
import nguyentt.dev.demo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourseRepositoryTest {

	@Autowired
	private CourseRepository repo;
	
	@Test
	public void loadCourse_returnCourseExpectedCourseName() {
		Course course = repo.findById(10001L);
		assertEquals("JPA in 50 Steps", course.getName());
	}
	
	@Test
	@DirtiesContext
	public void deleteById_theCourseIsDeleted() {
		repo.deleteById(10002L);
		assertNull(repo.findById(10002L));
	}
	
	@Test
	@DirtiesContext
	public void saveCourse() {
		Course course = repo.findById(10001L);
		course.setName("JPA in 50 Steps - updated");
		
		repo.save(course);
		
		Course updatedCourse = repo.findById(10001L);
		assertEquals("JPA in 50 Steps - updated", updatedCourse.getName());
	}
}
