package com.topsec.hrpms.dao;

import com.topsec.hrpms.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDao extends JpaRepository<Emp,Integer> {

    @Query(value = "select e from Emp e where e.name like %?1%")
    List<Emp> quzzyQuery(String quzzyName);

    @Query(value = "select e from Emp e where e.name = ?1")
    Emp getEmpName(String name);

    @Query(value = "select e from Emp e")
    List<Emp> getAll();
}
