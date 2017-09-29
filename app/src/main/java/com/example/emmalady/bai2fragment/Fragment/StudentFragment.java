package com.example.emmalady.bai2fragment.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.emmalady.bai2fragment.Activity.MainActivity;
import com.example.emmalady.bai2fragment.R;

public class StudentFragment extends Fragment {
    private TextView tvName;
    private EditText edOrigin, edBirth, edSex, edClass, edCourse;
    private Button btnSend;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_student, container, false);
        tvName = (TextView) v.findViewById(R.id.tvName1);
        edOrigin = (EditText) v.findViewById(R.id.edOrigin);
        edBirth = (EditText) v.findViewById(R.id.edBirth);
        edSex= (EditText) v.findViewById(R.id.edSex);
        edClass = (EditText) v.findViewById(R.id.edClass);
        edCourse = (EditText) v.findViewById(R.id.edCourse);
        btnSend = (Button) v.findViewById(R.id.btnSend);

        Bundle bundle = this.getArguments();
        if (bundle != null){
            String name = bundle.getString("Name");
            if(!TextUtils.isEmpty(name)){
                tvName.setText(name);
            }else{
                tvName.setText("Name is NULL");
            }
        }else{
            tvName.setText("Bundle is NULL");
        }

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name, Origin, Birth, Sex, Class, Course;
                Name = tvName.getText().toString();
                Origin = edOrigin.getText().toString();
                Birth = edBirth.getText().toString();
                Sex = edSex.getText().toString();
                Class = edClass.getText().toString();
                Course = edCourse.getText().toString();
                ((MainActivity)getActivity()).addStudentDetailFragment(Name, Origin, Birth, Sex, Class, Course);
            }
        });
        return v;

    }
}
