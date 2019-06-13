package com.topsec.hrpms.service.impl;


import com.topsec.hrpms.dao.AdminDao;
import com.topsec.hrpms.entity.Admin;
import com.topsec.hrpms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;


    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    @Override
    public void createAdmin(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    public Admin findAdminByName(String name) {
        return adminDao.getAdminByName(name);
    }

    @Override
    public Admin findAdminById(int id) {
        return adminDao.getOne(id);
    }

    @Override
    public void deleteAdmin(int id) {
        adminDao.deleteById(id);
    }

    @Override
    public Admin login(String username, String password) {
        return adminDao.login(username,password);
    }

    @Override
    public void update(int id, String username, String name) {
        adminDao.update(id,username,name);
    }

    @Override
    public List<Admin> quzzyQuery(String quzzyName) {
        return adminDao.quzzyQuery(quzzyName);
    }

    @Override
    public Admin getAdminById(int id) {
        return adminDao.getAdminById(id);
    }
}
