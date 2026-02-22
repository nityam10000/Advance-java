package com.assessmenttwo.dao;

import org.springframework.stereotype.Component;

import com.assessmenttwo.entity.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Component
public class DepartmentDAO {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgre");

    public Department saveDepartment(Department d) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(d);
        et.commit();
        em.close();

        return d;
    }

    // Convenience method: create a Department with parameters
    public Department addDepartment(String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Department d = new Department();
        d.setName(name);

        et.begin();
        em.persist(d);
        et.commit();
        em.close();

        return d;
    }

    public void updateDepartment(int departmentId, String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Department d = em.find(Department.class, departmentId);
        if (d != null) {
            d.setName(name);
            et.begin();
            em.merge(d);
            et.commit();
        }
        em.close();
    }

    public Department findOne(int departmentId) {
        EntityManager em = emf.createEntityManager();
        Department d = em.find(Department.class, departmentId);
        em.close();
        return d;
    }

    public void deleteDepartment(int departmentId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Department d = em.find(Department.class, departmentId);
        if (d != null) {
            et.begin();
            em.remove(d);
            et.commit();
        }
        em.close();
    }
}