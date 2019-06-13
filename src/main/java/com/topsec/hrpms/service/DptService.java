package com.topsec.hrpms.service;

import com.topsec.hrpms.entity.Dpt;

import java.util.List;

public interface DptService {

    List<Dpt> findAll();

    void deleteById(int dptid);

    Dpt getDptById(int dptid);

    void createDpt(Dpt dpt);

    List<Dpt> quzzyQuery(String quzzyName);
}
