package com.assessmenttwo.dao;

import com.assessmenttwo.entity.Student;

import org.springframework.stereotype.Component;

import com.assessmenttwo.entity.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Component
public class StudentDAO {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgre");

    public Student saveStudent(Student s) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(s);
        et.commit();
        em.close();

        return s;
    }

    // Convenience method: create a Student with parameters
    public Student addStudent(String name, String email, int departmentId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Department dept = em.find(Department.class, departmentId);
        if (dept == null) {
            em.close();
            throw new IllegalArgumentException("Department not found with id: " + departmentId);
        }

        Student s = new Student();
        s.setName(name);
        s.setEmail(email);
        s.setDepartment(dept);

        et.begin();
        em.persist(s);
        et.commit();
        em.close();

        return s;
    }

    public void updateStudent(int studentId, String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Student s = em.find(Student.class, studentId);
        if (s != null) {
            s.setName(name);
            et.begin();
            em.merge(s);
            et.commit();
        }
        em.close();
    }

    public Student findOne(int studentId) {
        EntityManager em = emf.createEntityManager();
        Student s = em.find(Student.class, studentId);
        em.close();
        return s;
    }

    public void deleteStudent(int studentId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Student s = em.find(Student.class, studentId);
        if (s != null) {
            et.begin();
            em.remove(s);
            et.commit();
        }
        em.close();
    }
}