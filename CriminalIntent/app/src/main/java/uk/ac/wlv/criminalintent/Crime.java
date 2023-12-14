package uk.ac.wlv.criminalintent;


import java.util.UUID;
import java.util.Date;

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;
    private String mContactNumber;

    public Crime(){
        this(UUID.randomUUID());
    }
    public Crime(UUID id){
        mID = id;
        mDate = new Date();
    }
    public UUID getID(){
        return mID;
    }
    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title){
        mTitle = title;
    }
    public Date getDate(){

        return mDate;
    }
    public void setDate(Date date){
        mDate = date;
    }
    public boolean isSolved(){
        return mSolved;
    }
    public void setSolved(Boolean solved){
        mSolved = solved;
    }
    public String getSuspect(){
        return mSuspect;
    }
    public void setSuspect (String suspect){
        mSuspect = suspect;
    }
    public String getPhoneNum() {
        return mContactNumber;
    }

    public void setPhoneNum(String phoneNum) {
        mContactNumber = phoneNum;
    }

    public String getPhotoFilename(){
        return "IMG_" + getID().toString() + ".jpg";
    }
}
