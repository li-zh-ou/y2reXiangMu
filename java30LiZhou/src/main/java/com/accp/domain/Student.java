package com.accp.domain;

public class Student {
    private Integer id;

    private String name;

    private String classname;

    private Integer zhuanid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getZhuanid() {
        return zhuanid;
    }

    public void setZhuanid(Integer zhuanid) {
        this.zhuanid = zhuanid;
    }
}