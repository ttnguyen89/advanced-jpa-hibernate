package nguyentt.dev.demo.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nguyentt.dev.demo.entity.Student;

@Repository
@Transactional
public class StudentRepository {


	@Autowired
	EntityManager entityManager;
	
	public Student findById(Long id) {
		return entityManager.find(Student.class, id);
	}
	
	
	public Student save(Student student) {
		if(student.getId() == 0) {
			entityManager.persist(student);
		} else {
			entityManager.merge(student);
		}
		return student;
	}
	
	public void deleteById(Long id) {
		Student student = findById(id);
		entityManager.remove(student);
	}
}
