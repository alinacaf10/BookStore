package com.DAO;

import com.bean.Student;

import java.util.List;

public interface StudentDAO {
     List<Student> getAllStudent();
     Student findStudentById(int id);

     boolean addStudent();

     boolean deleteStudent();
     Student updateStudent(Student student);

}
