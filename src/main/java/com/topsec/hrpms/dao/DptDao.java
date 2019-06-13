package com.topsec.hrpms.dao;

import com.topsec.hrpms.entity.Dpt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DptDao extends JpaRepository<Dpt,Integer> {

    @Query(value = "select d from Dpt d where d.name like %?1%")
    List<Dpt> quzzyQuery(String quzzyName);
}
