package com.topsec.hrpms.dto;

public class PayDto {
    private int payid;
    private String month;
    private Double reawrds;
    private Double punishs;
    private double salary;
    private Integer empid;

    public int getPayid() {
        return payid;
    }

    public void setPayid(int payid) {
        this.payid = payid;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getReawrds() {
        return reawrds;
    }

    public void setReawrds(Double reawrds) {
        this.reawrds = reawrds;
    }

    public Double getPunishs() {
        return punishs;
    }

    public void setPunishs(Double punishs) {
        this.punishs = punishs;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "PayDto{" +
                "payid=" + payid +
                ", month='" + month + '\'' +
                ", reawrds=" + reawrds +
                ", punishs=" + punishs +
                ", salary=" + salary +
                ", empid=" + empid +
                '}';
    }
}
