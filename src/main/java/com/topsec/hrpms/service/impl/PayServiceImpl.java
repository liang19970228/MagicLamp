package com.topsec.hrpms.service.impl;

import com.topsec.hrpms.dao.PayDao;
import com.topsec.hrpms.entity.Pay;
import com.topsec.hrpms.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayDao payDao;

    @Override
    public List<Pay> findAll() {
        return payDao.findAll();
    }

    @Override
    public void deleteById(int payid) {
        payDao.deleteById(payid);
    }

    @Override
    public Pay getPayById(int payid) {
        return payDao.getOne(payid);
    }

    @Override
    public void createPay(Pay pay) {
        payDao.save(pay);
    }

    @Override
    public List<Pay> getPayByMonth(String payDate) {
        return payDao.getPayByMonth(payDate);
    }
}
