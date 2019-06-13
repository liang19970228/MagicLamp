package com.topsec.hrpms.pojo;

public class PayPojo {
    private Integer empid;
    private Integer checkid;
    private String name;
    private String checkdate;
    private Double basesalary;
    private Double rewards;
    private Double punishes;

    public PayPojo(){
        super();
    }

    public PayPojo(Integer empid, Integer checkid, String name, String checkdate, Double basesalary, Double rewards, Double punishes) {
        this.empid = empid;
        this.checkid = checkid;
        this.name = name;
        this.checkdate = checkdate;
        this.basesalary = basesalary;
        this.rewards = rewards;
        this.punishes = punishes;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getCheckid() {
        return checkid;
    }

    public void setCheckid(Integer checkid) {
        this.checkid = checkid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public Double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(Double basesalary) {
        this.basesalary = basesalary;
    }

    public Double getRewards() {
        return rewards;
    }

    public void setRewards(Double rewards) {
        this.rewards = rewards;
    }

    public Double getPunishes() {
        return punishes;
    }

    public void setPunishes(Double punishes) {
        this.punishes = punishes;
    }

    @Override
    public String toString() {
        return "PayPojo{" +
                "empid=" + empid +
                ", checkid=" + checkid +
                ", name='" + name + '\'' +
                ", checkdate='" + checkdate + '\'' +
                ", basesalary=" + basesalary +
                ", rewards=" + rewards +
                ", punishes=" + punishes +
                '}';
    }
}
