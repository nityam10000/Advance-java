package com.assessmenttwo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assessmenttwo.service.StudentService;
import com.assessmenttwo.entity.Department;
import com.assessmenttwo.entity.Student;
import com.assessmenttwo.service.DepartmentService;


public class Driver {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);

        StudentService studentService = ac.getBean(StudentService.class);
        DepartmentService departmentService = ac.getBean(DepartmentService.class);

//        Department dept = departmentService.addDepartment("Computer Science");
//        Department dept1 = departmentService.addDepartment("Law");
//        Department dept2 = departmentService.addDepartment("Not good department");

//        Student s = studentService.addStudent("Nityam", "nityam@gmail.com", dept.getId());
//        Student s1 = studentService.addStudent("Abhinav", "abhinav@gmail.com", dept.getId());
//        Student s2 = studentService.addStudent("Mohit", "mohit@gmail.com", dept1.getId());
        
        studentService.updateStudent(1, "Nityam2");
        studentService.deleteStudent(1);
        studentService.deleteStudent(2);
        studentService.deleteStudent(3);
    }
}