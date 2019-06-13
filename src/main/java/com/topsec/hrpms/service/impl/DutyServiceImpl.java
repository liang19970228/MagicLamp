package com.topsec.hrpms.service.impl;

import com.topsec.hrpms.dao.DutyDao;
import com.topsec.hrpms.entity.Duty;
import com.topsec.hrpms.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    private DutyDao dutyDao;

    @Override
    public List<Duty> findAll() {
        return dutyDao.findAll();
    }

    @Override
    public void deleteById(int dutyid) {
        dutyDao.deleteById(dutyid);
    }

    @Override
    public Duty getDutyById(int dutyid) {
        return dutyDao.getOne(dutyid);
    }

    @Override
    public void createDuty(Duty duty) {
        dutyDao.save(duty);
    }

    @Override
    public List<Duty> quzzyQuery(String quzzyName) {
        return dutyDao.quzzyQuery(quzzyName);
    }
}
