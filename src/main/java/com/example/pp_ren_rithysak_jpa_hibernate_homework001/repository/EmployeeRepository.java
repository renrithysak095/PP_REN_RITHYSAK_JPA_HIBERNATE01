package com.example.pp_ren_rithysak_jpa_hibernate_homework001.repository;

import com.example.pp_ren_rithysak_jpa_hibernate_homework001.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Employee add(Employee emp){
        em.persist(emp);
        return emp;
    }

    @Transactional
    public Employee addEmployee(Employee emp){
        // Detach data
        em.detach(emp);
        Employee newObj = new Employee(null,"newFirstName","newLastName","newEmail@gmail.com",new Date(),null);
        em.merge(newObj);
        em.flush();
        return emp;

    }
    @Transactional
    public Employee find(Integer id){
        return em.find(Employee.class,id);
    }

    @Transactional
    public void remove(Integer id){
        Employee employee = em.find(Employee.class,id);
        em.remove(employee);
    }

}
