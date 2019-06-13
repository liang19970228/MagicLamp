package com.topsec.hrpms.dao;


import com.topsec.hrpms.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AdminDao extends JpaRepository<Admin,Integer> {

    @Query("select a from Admin a where a.name = ?1")
    Admin getAdminByName(String name);

    @Query("select a from  Admin a where a.username = ?1 and a.password = ?2")
    Admin login(String username, String password);


    /**
     * 1.更新info表下指定id的status字段， 这里使用了原生的sql语句。
     * 2.@Transactional 注解用于提交事务，若没有带上这句，会报事务异常提示。
     * 3.@Modifying(clearAutomatically = true) 自动清除实体里保存的数据。
     */
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update Admin a set a.name = ?3,a.username = ?2 where a.id = ?1")
    void update(int id, String username, String name);

    @Query(value = "select a from Admin a where a.name like %?1%")
    List<Admin> quzzyQuery(String quzzyName);

    @Query(value = "select a from Admin a where a.id = ?1")
    Admin getAdminById(int id);
}
