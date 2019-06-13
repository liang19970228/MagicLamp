package com.topsec.hrpms.service.impl;

import com.topsec.hrpms.dao.DptDao;
import com.topsec.hrpms.entity.Dpt;
import com.topsec.hrpms.service.DptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DptServiceImpl implements DptService {
    @Autowired
    private DptDao dptDao;

    @Override
    public List<Dpt> findAll() {
        return dptDao.findAll();
    }

    @Override
    public void deleteById(int dptid) {
        dptDao.deleteById(dptid);
    }

    @Override
    public Dpt getDptById(int dptid) {
        return dptDao.getOne(dptid);
    }

    @Override
    public void createDpt(Dpt dpt) {
        dptDao.save(dpt);
    }

    @Override
    public List<Dpt> quzzyQuery(String quzzyName) {
        return dptDao.quzzyQuery(quzzyName);
    }
}
