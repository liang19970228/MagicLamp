package com.topsec.hrpms.dto;

import java.io.Serializable;

public class EmpDto implements Serializable {

    private int empid;
    private String name;
    private String sex;
    private String birthday;
    private String birthplace;
    private String nation;
    private String political;
    private double basesalary;
    private String entrytime;
    private String graduationschool;
    private String education;
    private String major;
    private String address;
    private String telphone;
    private String email;
    private int status;
    private String leavetime;
    private int dutyid;
    private String dutyname;
    private int dptid;
    private String dptname;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getGraduationschool() {
        return graduationschool;
    }

    public void setGraduationschool(String graduationschool) {
        this.graduationschool = graduationschool;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(String leavetime) {
        this.leavetime = leavetime;
    }

    public int getDutyid() {
        return dutyid;
    }

    public void setDutyid(int dutyid) {
        this.dutyid = dutyid;
    }

    public int getDptid() {
        return dptid;
    }

    public void setDptid(int dptid) {
        this.dptid = dptid;
    }

    public String getDutyname() {
        return dutyname;
    }

    public void setDutyname(String dutyname) {
        this.dutyname = dutyname;
    }

    public String getDptname() {
        return dptname;
    }

    public void setDptname(String dptname) {
        this.dptname = dptname;
    }

    @Override
    public String toString() {
        return "EmpDto{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", nation='" + nation + '\'' +
                ", political='" + political + '\'' +
                ", basesalary=" + basesalary +
                ", entrytime='" + entrytime + '\'' +
                ", graduationschool='" + graduationschool + '\'' +
                ", education='" + education + '\'' +
                ", major='" + major + '\'' +
                ", address='" + address + '\'' +
                ", telphone='" + telphone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", leavetime='" + leavetime + '\'' +
                ", dutyid=" + dutyid +
                ", dutyname='" + dutyname + '\'' +
                ", dptid=" + dptid +
                ", dptname='" + dptname + '\'' +
                '}';
    }
}
