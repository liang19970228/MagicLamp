package com.topsec.hrpms.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Checks implements Serializable {
    private int checkid;
    private Date checkdate;
    private String checkdesc;
    private Double reward;
    private Double punish;
    private Emp empByEmpid;

    @Id
    @Column(name = "checkid", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY,generator = "checkid")
    public int getCheckid() {
        return checkid;
    }

    public void setCheckid(int checkid) {
        this.checkid = checkid;
    }

    @Basic
    @Column(name = "checkdate", nullable = false)
    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    @Basic
    @Column(name = "checkdesc", nullable = true, length = 255)
    public String getCheckdesc() {
        return checkdesc;
    }

    public void setCheckdesc(String checkdesc) {
        this.checkdesc = checkdesc;
    }

    @Basic
    @Column(name = "reward", nullable = true, precision = 0)
    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    @Basic
    @Column(name = "punish", nullable = true, precision = 0)
    public Double getPunish() {
        return punish;
    }

    public void setPunish(Double punish) {
        this.punish = punish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checks checks = (Checks) o;
        return checkid == checks.checkid &&
                Objects.equals(checkdate, checks.checkdate) &&
                Objects.equals(checkdesc, checks.checkdesc) &&
                Objects.equals(reward, checks.reward) &&
                Objects.equals(punish, checks.punish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkid, checkdate, checkdesc, reward, punish);
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
