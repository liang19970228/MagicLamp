package com.topsec.hrpms.dto;

public class DptDto {
    private Integer dptid;
    private String name;
    private Integer parentid;
    private String parentName;
    private String desc;

    public Integer getDptid() {
        return dptid;
    }

    public void setDptid(Integer dptid) {
        this.dptid = dptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "DptDto{" +
                "dptid=" + dptid +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                ", parentName='" + parentName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
