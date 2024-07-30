package com.mvc.project.Springboot.MVC8.StudentController;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.project.Springboot.MVC8.Student.Student;

@Controller
public class StudentController {
	@Autowired
	SessionFactory sf;

	@RequestMapping("/studentpage")
	public String name() {
		return "student";
	}

	@PostMapping("/student")
	public Student saved(Student student) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(student);
		t.commit();
		return student;
	}

	@RequestMapping("/studentupdate")
	public String savedData(Student student) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.update(student);
		t.commit();
		return "student";

	}
	@RequestMapping("/studentdelete")
	public String deleteData(Student student) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Student std = s.get(Student.class, student.getId());
		s.delete(std);
		t.commit();
		return "student";

	}

}
