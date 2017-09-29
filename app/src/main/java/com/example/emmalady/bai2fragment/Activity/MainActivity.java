package com.example.emmalady.bai2fragment.Activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.emmalady.bai2fragment.Parcelable.MyParcelable;
import com.example.emmalady.bai2fragment.R;
import com.example.emmalady.bai2fragment.Fragment.StudentDetailFragment;
import com.example.emmalady.bai2fragment.Fragment.StudentFragment;
import com.example.emmalady.bai2fragment.Fragment.StudentNameFragment;

public class MainActivity extends AppCompatActivity {
    StudentNameFragment stuNameFragment;
    StudentFragment stuFragment;
    StudentDetailFragment stuDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stuNameFragment = new StudentNameFragment();
        addFragment(stuNameFragment);
    }
    public void addFragment(Fragment fragment){
//        FragmentManager fragmentManager = this.getFragmentManager()
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        stuNameFragment = new StudentNameFragment();
//        fragmentTransaction.replace(R.id.frameLayout, stuNameFragment)
//        fragmentTransaction.commit();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }

    public void addStudentFragment(String name){
        stuFragment = new StudentFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Bundle bundle = new Bundle();
        bundle.putString("Name", name);
        stuFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.frameLayout, stuFragment);
        fragmentTransaction.addToBackStack(null).commit();
    }

    public void addStudentDetailFragment(String name, String origin, String birth, String sex, String Class, String course){
        MyParcelable parcel = new MyParcelable();
        parcel.setmName(name);
        parcel.setmOrigin(origin);
        parcel.setmBirth(birth);
        parcel.setmSex(sex);
        parcel.setmClass(Class);
        parcel.setmCourse(course);

        stuDetailFragment = new StudentDetailFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Bundle bundle = new Bundle();
        bundle.putParcelable("Parcel", parcel);
        stuDetailFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.frameLayout, stuDetailFragment);
        fragmentTransaction.addToBackStack(null).commit();


    }
}
