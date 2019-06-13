package com.topsec.hrpms.dto;

public class ChecksDto {
    private int checkid;
    private Integer empid;
    private String checkdate;
    private String checkdesc;
    private Double reward;
    private Double punish;

    public int getCheckid() {
        return checkid;
    }

    public void setCheckid(int checkid) {
        this.checkid = checkid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckdesc() {
        return checkdesc;
    }

    public void setCheckdesc(String checkdesc) {
        this.checkdesc = checkdesc;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public Double getPunish() {
        return punish;
    }

    public void setPunish(Double punish) {
        this.punish = punish;
    }

}
