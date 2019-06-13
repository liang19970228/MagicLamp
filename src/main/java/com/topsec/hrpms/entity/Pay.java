package com.topsec.hrpms.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Pay implements Serializable {
    private int payid;
    private String month;
    private Double reawrds;
    private Double punishs;
    private double salary;
    private Emp empByEmpid;

    @Id
    @Column(name = "payid", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY,generator = "payid")
    public int getPayid() {
        return payid;
    }

    public void setPayid(int payid) {
        this.payid = payid;
    }

    @Basic
    @Column(name = "month", nullable = false, length = 20)
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Basic
    @Column(name = "reawrds", nullable = true, precision = 0)
    public Double getReawrds() {
        return reawrds;
    }

    public void setReawrds(Double reawrds) {
        this.reawrds = reawrds;
    }

    @Basic
    @Column(name = "punishs", nullable = true, precision = 0)
    public Double getPunishs() {
        return punishs;
    }

    public void setPunishs(Double punishs) {
        this.punishs = punishs;
    }

    @Basic
    @Column(name = "salary", nullable = false, precision = 0)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pay pay = (Pay) o;
        return payid == pay.payid &&
                Double.compare(pay.salary, salary) == 0 &&
                Objects.equals(month, pay.month) &&
                Objects.equals(reawrds, pay.reawrds) &&
                Objects.equals(punishs, pay.punishs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payid, month, reawrds, punishs, salary);
    }

    @ManyToOne
    @JoinColumn(name = "empid", referencedColumnName = "empid", nullable = false)
    public Emp getEmpByEmpid() {
        return empByEmpid;
    }

    public void setEmpByEmpid(Emp empByEmpid) {
        this.empByEmpid = empByEmpid;
    }
}
