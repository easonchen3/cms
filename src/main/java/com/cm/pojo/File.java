package com.cm.pojo;

public class File {
    private Integer fId;

    private String fName;

    private String fPath;

    private String fDesc;

    private Integer fSid;

    private String fDate;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfPath() {
        return fPath;
    }

    public void setfPath(String fPath) {
        this.fPath = fPath == null ? null : fPath.trim();
    }

    public String getfDesc() {
        return fDesc;
    }

    public void setfDesc(String fDesc) {
        this.fDesc = fDesc == null ? null : fDesc.trim();
    }

    public Integer getfSid() {
        return fSid;
    }

    public void setfSid(Integer fSid) {
        this.fSid = fSid;
    }

    public String getfDate() {
        return fDate;
    }

    public void setfDate(String fDate) {
        this.fDate = fDate == null ? null : fDate.trim();
    }
}