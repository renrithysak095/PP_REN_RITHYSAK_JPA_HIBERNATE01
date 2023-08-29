package com.example.pp_ren_rithysak_jpa_hibernate_homework001.controller;
import com.example.pp_ren_rithysak_jpa_hibernate_homework001.model.Employee;
import com.example.pp_ren_rithysak_jpa_hibernate_homework001.repository.EmployeeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api")
@Tag(name = "JPA/Hibernate Homework")
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepo;

    @PostMapping("/post-employee")
    @Operation(summary = "insert-employee")
    public Employee addPost(){
        Employee emp = new Employee(null,"Rithysak","Ren","renrithysak096@gmail.com",new Date(),null);
        return empRepo.add(emp);
    }

    @PostMapping("/insert-employee")
    @Operation(summary = "perform detach and then merge")
    public Employee addEmployee(){
        Employee emp = new Employee(null,"Rithysak","Ren","renrithysak095@gmail.com",new Date(),null);
        return empRepo.addEmployee(emp);
    }

    @GetMapping("findby/{id}")
    @Operation(summary = "query employee by id")
    public Employee getById(@PathVariable Integer id){
        return empRepo.find(id);
    }

    @DeleteMapping("remove/{id}")
    @Operation(summary = "remove employee by id")
    public void remove(@PathVariable Integer id){
        empRepo.remove(id);
    }



}
