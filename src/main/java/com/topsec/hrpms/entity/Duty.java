package com.topsec.hrpms.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Duty implements Serializable {
    private int dutyid;
    private String name;
    private String dutydesc;

    @Id
    @Column(name = "dutyid", nullable = false)
    public int getDutyid() {
        return dutyid;
    }

    public void setDutyid(int dutyid) {
        this.dutyid = dutyid;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "dutydesc", nullable = true, length = 255)
    public String getDutydesc() {
        return dutydesc;
    }

    public void setDutydesc(String dutydesc) {
        this.dutydesc = dutydesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duty duty = (Duty) o;
        return dutyid == duty.dutyid &&
                Objects.equals(name, duty.name) &&
                Objects.equals(dutydesc, duty.dutydesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dutyid, name, dutydesc);
    }

    @Override
    public String toString() {
        return "Duty{" +
                "dutyid=" + dutyid +
                ", name='" + name + '\'' +
                ", dutydesc='" + dutydesc + '\'' +
                '}';
    }
}
