package com.example.emmalady.bai2fragment.Parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Liz Nguyen on 29/09/2017.
 */

public class MyParcelable implements Parcelable{
    private String mName;
    private String mOrigin;
    private String mBirth;
    private String mSex;
    private String mClass;
    private String mCourse;

    public MyParcelable(){
        super();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
//        out.writeInt(mData);
        out.writeString(this.mName);
        out.writeString(this.mOrigin);
        out.writeString(this.mBirth);
        out.writeString(this.mSex);
        out.writeString(this.mClass);
        out.writeString(this.mCourse);
    }

    public static final Parcelable.Creator<MyParcelable> CREATOR = new Parcelable.Creator<MyParcelable>() {
        public MyParcelable createFromParcel(Parcel in) {
            return new MyParcelable(in);
        }

        public MyParcelable[] newArray(int size) {
            return new MyParcelable[size];
        }
    };

    public MyParcelable(Parcel in) {
//        mData = in.readInt();
        this.mName = in.readString();
        this.mOrigin = in.readString();
        this.mBirth = in.readString();
        this.mSex = in.readString();
        this.mClass = in.readString();
        this.mCourse = in.readString();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmOrigin() {
        return mOrigin;
    }

    public void setmOrigin(String mOrigin) {
        this.mOrigin = mOrigin;
    }

    public String getmBirth() {
        return mBirth;
    }

    public void setmBirth(String mBirth) {
        this.mBirth = mBirth;
    }

    public String getmSex() {
        return mSex;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex;
    }

    public String getmClass() {
        return mClass;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public String getmCourse() {
        return mCourse;
    }

    public void setmCourse(String mCourse) {
        this.mCourse = mCourse;
    }
}
