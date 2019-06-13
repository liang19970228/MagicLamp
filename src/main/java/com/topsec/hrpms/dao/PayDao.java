package com.topsec.hrpms.dao;

import com.topsec.hrpms.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayDao extends JpaRepository<Pay,Integer> {
    @Query(value = "select p from Pay p where p.month = ?1")
    List<Pay> getPayByMonth(String payDate);
}
