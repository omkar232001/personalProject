package com.example.Project1.services.Impl;

import com.example.Project1.GlobalException.Excehandle;
import com.example.Project1.entity.DTO.Request;
import com.example.Project1.entity.Employees;
import com.example.Project1.repository.EmpRepo;
import com.example.Project1.services.EmpService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    private EmpRepo repo;
    private ModelMapper mapper;

    @Autowired
    public EmpServiceImpl(EmpRepo repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<Employees> getAll() {
        return repo.findAll();
    }

    @Override
    public Employees getbyId(int id) {
        return repo.findById(id).orElseThrow(() -> new Excehandle("Employee not found with id: " + id));
    }

    @Override
    public Employees addEmp(Request rq) {
        Employees emp = mapper.map(rq, Employees.class);
        return repo.save(emp);
    }
}
