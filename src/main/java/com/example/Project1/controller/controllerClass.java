package com.example.Project1.controller;

import com.example.Project1.entity.DTO.Request;
import com.example.Project1.entity.Employees;
import com.example.Project1.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class controllerClass {
    private EmpService service;

    @Autowired
    public controllerClass(EmpService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Employees>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employees> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getbyId(id));
    }

    @PostMapping
    public ResponseEntity<Employees> addEmp(@RequestBody Request emp) {
        return ResponseEntity.ok(service.addEmp(emp));
    }
}
