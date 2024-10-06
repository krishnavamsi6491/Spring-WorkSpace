package com.vamsi.Repository;

import java.util.List;

import com.vamsi.Student.Student;

public interface HelloRepository {
	
//DML
	 public Student save (Student entity);
	 
	 List<Student>  saveAll(List<Student> entities);

     public void delete(Student entity);
     
     public void deleteAll();
     
     public void deleteById(int id);
     
   public Student updateById(int pid,Student s1);
   
   public Student updateByName(String name,String email);
   
   //DRL
   public Student getById(int id);
   
   public List<Student> getAll();
   
   public void getAllRCH();
   
   public List<Student> AllStudents();
   
   //
   public int counts(int id);
   
   public List<Student> findAllStudents();
   
   public void SaveStudent(Student st);
}
