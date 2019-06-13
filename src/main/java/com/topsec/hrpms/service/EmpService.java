package com.topsec.hrpms.service;

import com.topsec.hrpms.entity.Emp;
import org.hibernate.sql.Update;

import java.util.List;

public interface EmpService {

    List<Emp> findAll();

    void deleteById(int empid);

    Emp getEmpById(int empid);

    void createEmp(Emp emp);

    List<Emp> quzzyQuery(String quzzyName);

    Emp getEmpByName(String quzzyName);
}
