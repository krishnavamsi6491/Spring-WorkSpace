package com.vamsi;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vamsi.Repository.HelloRepository;
import com.vamsi.Student.Student;
//import com.vamsi.Repository.HelloRepositoryImpl;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		JdbcTemplate jt = context.getBean(JdbcTemplate.class);
		System.out.println(jt);
		
		System.out.println(jt.getDataSource());
		
		HelloRepository bean = context.getBean("hr", HelloRepository.class);
		//bean.deleteById(4);
		
		//bean.deleteById(5);
		
		//bean.save(new Student(7, "srikar","srikar@gmail.com"));
		
		//bean.updateById(7, new Student("srikar2001","Srikar2001@gmail.com"));
		
		//bean.updateByName("v", "vamsi6300@gmail.com");
		//Student byId = bean.getById(2);
		//System.out.println(byId);
		//List<Student> all = bean.getAll();
		//System.out.println(all);
		//bean.getAllRCH();
		
		//List<Student> allStudents = bean.AllStudents();
		//System.out.println(allStudents);
	//	int counts = bean.counts(1);
	//	System.out.println(counts);
		
		//List<Student> allStudents = bean.findAllStudents();
	//	System.out.println(allStudents);
		
		bean.SaveStudent(new Student(2, "Geetha","Geetha@gmail.com"));
		System.out.println("Done!!!!");

	}

}
