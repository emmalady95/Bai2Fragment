package com.example.emmalady.bai2fragment.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.emmalady.bai2fragment.Parcelable.MyParcelable;
import com.example.emmalady.bai2fragment.R;

public class StudentDetailFragment extends Fragment {
    private TextView tvShowName, tvShowOrigin, tvShowBirth, tvShowSex, tvShowClass, tvShowCourse;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_student_detail, container, false);
        tvShowName = (TextView) v.findViewById(R.id.tvShowName);
        tvShowOrigin = (TextView) v.findViewById(R.id.tvShowOrigin);
        tvShowBirth = (TextView) v.findViewById(R.id.tvShowBirth);
        tvShowSex = (TextView) v.findViewById(R.id.tvShowSex);
        tvShowClass = (TextView) v.findViewById(R.id.tvShowClass);
        tvShowCourse = (TextView) v.findViewById(R.id.tvShowCourse);

        MyParcelable parcel = new MyParcelable();
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            parcel = bundle.getParcelable("Parcel");
            tvShowName.setText(parcel.getmName());
            tvShowOrigin.setText(parcel.getmOrigin());
            tvShowBirth.setText(parcel.getmBirth());
            tvShowSex.setText(parcel.getmSex());
            tvShowClass.setText(parcel.getmClass());
            tvShowCourse.setText(parcel.getmCourse());
        }
        return v;
    }
}
