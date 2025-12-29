package com.example.Project1.services;

import com.example.Project1.entity.DTO.Request;
import com.example.Project1.entity.Employees;

import java.util.List;

public interface EmpService {
    List<Employees> getAll();
    Employees getbyId(int id);
    Employees addEmp(Request emp);

}
