package com.cm.pojo;

public class Class {
    private Integer cId;

    private String cName;

    private String cDepart;

    private String cCourt;

    private String cDesc;

    
    
    public Class(Integer cId, String cName, String cDepart, String cCourt) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cDepart = cDepart;
		this.cCourt = cCourt;
	}

	public Class() {
		super();
	}

	public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcDepart() {
        return cDepart;
    }

    public void setcDepart(String cDepart) {
        this.cDepart = cDepart == null ? null : cDepart.trim();
    }

    public String getcCourt() {
        return cCourt;
    }

    public void setcCourt(String cCourt) {
        this.cCourt = cCourt == null ? null : cCourt.trim();
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc == null ? null : cDesc.trim();
    }
}