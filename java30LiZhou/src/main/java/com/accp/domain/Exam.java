package com.accp.domain;

import java.util.Date;

public class Exam {
    private Integer stuid;

    private Integer keid;

    private Integer examscore;

    private Date examtime;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getKeid() {
        return keid;
    }

    public void setKeid(Integer keid) {
        this.keid = keid;
    }

    public Integer getExamscore() {
        return examscore;
    }

    public void setExamscore(Integer examscore) {
        this.examscore = examscore;
    }

    public Date getExamtime() {
        return examtime;
    }

    public void setExamtime(Date examtime) {
        this.examtime = examtime;
    }
}