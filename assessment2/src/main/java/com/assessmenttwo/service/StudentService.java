package com.assessmenttwo.service;

import com.assessmenttwo.dao.StudentDAO;
import com.assessmenttwo.entity.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

	@Autowired
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public Student addStudent(String name, String email, int departmentId) {
        return studentDAO.addStudent(name, email, departmentId);
    }

    public Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }

    public void updateStudent(int studentId, String name) {
        studentDAO.updateStudent(studentId, name);
    }

    public Student getStudent(int studentId) {
        return studentDAO.findOne(studentId);
    }

    public void deleteStudent(int studentId) {
        studentDAO.deleteStudent(studentId);
    }
}