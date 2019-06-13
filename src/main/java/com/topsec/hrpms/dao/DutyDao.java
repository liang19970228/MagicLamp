package com.topsec.hrpms.dao;

import com.topsec.hrpms.entity.Duty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DutyDao extends JpaRepository<Duty,Integer> {

    @Query(value = "select d from Duty d where d.name like %?1%")
    List<Duty> quzzyQuery(String quzzyName);
}
