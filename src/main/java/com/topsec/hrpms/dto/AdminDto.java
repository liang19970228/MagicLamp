package com.topsec.hrpms.dto;

public class AdminDto {
    private int id;
    private String name;
    private String username;
    private String oldPwd;
    private String newPwd1;
    private String newPwd2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public String getNewPwd1() {
        return newPwd1;
    }

    public void setNewPwd1(String newPwd1) {
        this.newPwd1 = newPwd1;
    }

    public String getNewPwd2() {
        return newPwd2;
    }

    public void setNewPwd2(String newPwd2) {
        this.newPwd2 = newPwd2;
    }
}
