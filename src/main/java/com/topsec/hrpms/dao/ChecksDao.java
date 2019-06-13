package com.topsec.hrpms.dao;

import com.topsec.hrpms.entity.Checks;
import com.topsec.hrpms.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChecksDao extends JpaRepository<Checks,Integer> {

    @Query(value = "select c from Checks c where c.empByEmpid = ?1")
    List<Checks> quzzyQuery(Emp emp);

    @Query(value = "SELECT e.empid as empid,c.checkid as checkid,e.name as name,DATE_FORMAT(checkdate,'%Y-%m') as checkdate,e.basesalary as basesalary,sum(c.reward) as rewards,sum(c.punish) as punishes FROM checks c inner JOIN emp e on c.empid = e.empid WHERE year(c.checkdate) = :year AND month(c.checkdate) = :month GROUP BY c.empid",nativeQuery = true)
    List<Object[]> getCheckByYearAndMonth(@Param("year") String year, @Param("month") String month);
}
