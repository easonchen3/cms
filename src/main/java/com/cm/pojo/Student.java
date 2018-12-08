package com.cm.pojo;

public class Student {
    private Integer sId;

    private String sUsername;

    private String sName;

    private String sPassword;

    private Integer sClassid;

    private String sEmail;

    private String sGender;

    private Integer sType;

    private String sTel;

    private Class sClass;
    
    
    
    public Student(Integer sId, String sUsername, String sName, String sPassword, Integer sClassid, String sEmail,
			String sGender, Integer sType) {
		super();
		this.sId = sId;
		this.sUsername = sUsername;
		this.sName = sName;
		this.sPassword = sPassword;
		this.sClassid = sClassid;
		this.sEmail = sEmail;
		this.sGender = sGender;
		this.sType = sType;
	}

	public Student() {
		super();
	}

	public Class getsClass() {
		return sClass;
	}

	public void setsClass(Class sClass) {
		this.sClass = sClass;
	}

	public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        this.sUsername = sUsername == null ? null : sUsername.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public Integer getsClassid() {
        return sClassid;
    }

    public void setsClassid(Integer sClassid) {
        this.sClassid = sClassid;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender == null ? null : sGender.trim();
    }

    public Integer getsType() {
        return sType;
    }

    public void setsType(Integer sType) {
        this.sType = sType;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel == null ? null : sTel.trim();
    }

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sUsername=" + sUsername + ", sName=" + sName + ", sPassword=" + sPassword
				+ ", sClassid=" + sClassid + ", sEmail=" + sEmail + ", sGender=" + sGender + ", sType=" + sType
				+ ", sTel=" + sTel + ", sClass=" + sClass + "]";
	}
    
}