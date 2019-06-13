package com.topsec.hrpms.service;

import com.topsec.hrpms.entity.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAll();

    void createAdmin(Admin admin);

    Admin findAdminByName(String name);

    Admin findAdminById(int id);

    void deleteAdmin(int id);

    Admin login(String username, String password);

    void update(int id, String username, String name);

    List<Admin> quzzyQuery(String quzzyName);

    Admin getAdminById(int id);
}
