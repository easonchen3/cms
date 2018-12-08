package com.cm.pojo;

public class Message {
    private Integer mId;

    private String mName;

    private String mDesc;

    private Integer mSid;

    private String mDate;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc == null ? null : mDesc.trim();
    }

    public Integer getmSid() {
        return mSid;
    }

    public void setmSid(Integer mSid) {
        this.mSid = mSid;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate == null ? null : mDate.trim();
    }
}