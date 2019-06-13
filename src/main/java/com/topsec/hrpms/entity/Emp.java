package com.topsec.hrpms.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Emp implements Serializable {
    private int empid;
    private String name;
    private String sex;
    private Date birthday;
    private String birthplace;
    private String nation;
    private String political;
    private double basesalary;
    private Date entrytime;
    private Date leavetime;
    private String graduationschool;
    private String education;
    private String major;
    private String address;
    private String telphone;
    private String email;
    private int status;
    private Dpt dptByDptid;
    private Duty dutyByDutyid;

    @Id
    @Column(name = "empid", nullable = false)
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex", nullable = false, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "birthplace", nullable = true, length = 50)
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Basic
    @Column(name = "nation", nullable = true, length = 50)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "political", nullable = true, length = 50)
    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    @Basic
    @Column(name = "basesalary", nullable = false, precision = 0)
    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

    @Basic
    @Column(name = "entrytime", nullable = false)
    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    @Basic
    @Column(name = "leavetime", nullable = true)
    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    @Basic
    @Column(name = "graduationschool", nullable = true, length = 50)
    public String getGraduationschool() {
        return graduationschool;
    }

    public void setGraduationschool(String graduationschool) {
        this.graduationschool = graduationschool;
    }

    @Basic
    @Column(name = "education", nullable = true, length = 50)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "major", nullable = true, length = 50)
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "telphone", nullable = true, length = 50)
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empid == emp.empid &&
                Double.compare(emp.basesalary, basesalary) == 0 &&
                status == emp.status &&
                Objects.equals(name, emp.name) &&
                Objects.equals(sex, emp.sex) &&
                Objects.equals(birthday, emp.birthday) &&
                Objects.equals(birthplace, emp.birthplace) &&
                Objects.equals(nation, emp.nation) &&
                Objects.equals(political, emp.political) &&
                Objects.equals(entrytime, emp.entrytime) &&
                Objects.equals(leavetime, emp.leavetime) &&
                Objects.equals(graduationschool, emp.graduationschool) &&
                Objects.equals(education, emp.education) &&
                Objects.equals(major, emp.major) &&
                Objects.equals(address, emp.address) &&
                Objects.equals(telphone, emp.telphone) &&
                Objects.equals(email, emp.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, name, sex, birthday, birthplace, nation, political, basesalary, entrytime, leavetime, graduationschool, education, major, address, telphone, email, status);
    }

    @ManyToOne
    @JoinColumn(name = "dptid", referencedColumnName = "dptid", nullable = false)
    public Dpt getDptByDptid() {
        return dptByDptid;
    }

    public void setDptByDptid(Dpt dptByDptid) {
        this.dptByDptid = dptByDptid;
    }

    @ManyToOne
    @JoinColumn(name = "dutyid", referencedColumnName = "dutyid", nullable = false)
    public Duty getDutyByDutyid() {
        return dutyByDutyid;
    }

    public void setDutyByDutyid(Duty dutyByDutyid) {
        this.dutyByDutyid = dutyByDutyid;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", birthplace='" + birthplace + '\'' +
                ", nation='" + nation + '\'' +
                ", political='" + political + '\'' +
                ", basesalary=" + basesalary +
                ", entrytime=" + entrytime +
                ", leavetime=" + leavetime +
                ", graduationschool='" + graduationschool + '\'' +
                ", education='" + education + '\'' +
                ", major='" + major + '\'' +
                ", address='" + address + '\'' +
                ", telphone='" + telphone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", dptByDptid=" + dptByDptid +
                ", dutyByDutyid=" + dutyByDutyid +
                '}';
    }
}
