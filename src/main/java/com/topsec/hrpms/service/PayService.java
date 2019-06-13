package com.topsec.hrpms.service;

import com.topsec.hrpms.entity.Pay;

import java.util.List;

public interface PayService {
    List<Pay> findAll();

    void deleteById(int payid);

    Pay getPayById(int payid);

    void createPay(Pay pay);

    List<Pay> getPayByMonth(String payDate);
}
