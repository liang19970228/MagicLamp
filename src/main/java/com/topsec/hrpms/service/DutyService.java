package com.topsec.hrpms.service;

import com.topsec.hrpms.entity.Duty;

import java.util.List;

public interface DutyService {

    List<Duty> findAll();

    void deleteById(int dutyid);

    Duty getDutyById(int dutyid);

    void createDuty(Duty duty);

    List<Duty> quzzyQuery(String quzzyName);
}
