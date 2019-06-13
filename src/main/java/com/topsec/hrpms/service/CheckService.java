package com.topsec.hrpms.service;



import com.topsec.hrpms.entity.Checks;
import com.topsec.hrpms.entity.Emp;
import com.topsec.hrpms.pojo.PayPojo;

import java.util.List;
import java.util.Map;

public interface CheckService {

    List<Checks> findAll();

    void deleteById(int checkid);

    Checks getChecksById(int checkid);

    void createChecks(Checks checks);

    List<Checks> quzzyQuery(Emp emp);

    //根据时间 年和月份查询考勤
    List<PayPojo> getCheckByYearAndMonth(String year, String month)throws Exception;
}
