package com.topsec.hrpms.service.impl;

import com.topsec.hrpms.dao.EmpDao;
import com.topsec.hrpms.entity.Emp;
import com.topsec.hrpms.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;


    @Override
    public List<Emp> findAll() {
        return empDao.getAll();
    }

    @Override
    public void deleteById(int empid) {
        empDao.deleteById(empid);
    }

    @Override
    public Emp getEmpById(int empid) {
        return empDao.getOne(empid);
    }

    @Override
    public void createEmp(Emp emp) {
        empDao.save(emp);
    }

    @Override
    public List<Emp> quzzyQuery(String quzzyName) {
        return empDao.quzzyQuery(quzzyName);
    }

    @Override
    public Emp getEmpByName(String name) {
        return empDao.getEmpName(name);
    }


}
