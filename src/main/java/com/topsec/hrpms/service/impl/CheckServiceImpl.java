package com.topsec.hrpms.service.impl;

import com.topsec.hrpms.dao.ChecksDao;
import com.topsec.hrpms.entity.Checks;
import com.topsec.hrpms.entity.Emp;
import com.topsec.hrpms.pojo.PayPojo;
import com.topsec.hrpms.service.CheckService;
import com.topsec.hrpms.util.CastEntityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    private ChecksDao checksDao;

    @Override
    public List<Checks> findAll() {
        return checksDao.findAll();
    }

    @Override
    public void deleteById(int checkid) {
        checksDao.deleteById(checkid);
    }

    @Override
    public Checks getChecksById(int checkid) {
        return checksDao.getOne(checkid);
    }

    @Override
    public void createChecks(Checks checks) {
        checksDao.save(checks);
    }

    @Override
    public List<Checks> quzzyQuery(Emp emp) {
        return checksDao.quzzyQuery(emp);
    }

    @Override
    public List<PayPojo> getCheckByYearAndMonth(String year, String month)throws Exception {

        List<Object[]> objects = checksDao.getCheckByYearAndMonth(year,month);
        List<PayPojo> payPojos = CastEntityUtil.castEntity(objects,PayPojo.class);
        return payPojos;
    }
}
