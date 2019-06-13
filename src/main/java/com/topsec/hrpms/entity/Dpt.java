package com.topsec.hrpms.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Dpt implements Serializable {
    private int dptid;
    private String name;
    private String dptdesc;
    private Dpt dptByParentid;

    @Id
    @Column(name = "dptid", nullable = false)
    public int getDptid() {
        return dptid;
    }

    public void setDptid(int dptid) {
        this.dptid = dptid;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "dptdesc", nullable = true, length = -1)
    public String getDptdesc() {
        return dptdesc;
    }

    public void setDptdesc(String dptdesc) {
        this.dptdesc = dptdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dpt dpt = (Dpt) o;
        return dptid == dpt.dptid &&
                Objects.equals(name, dpt.name) &&
                Objects.equals(dptdesc, dpt.dptdesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dptid, name, dptdesc);
    }

    @ManyToOne
    @JoinColumn(name = "parentid", referencedColumnName = "dptid")
    public Dpt getDptByParentid() {
        return dptByParentid;
    }

    public void setDptByParentid(Dpt dptByParentid) {
        this.dptByParentid = dptByParentid;
    }
}
