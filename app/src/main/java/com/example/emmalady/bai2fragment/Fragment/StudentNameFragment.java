package com.example.emmalady.bai2fragment.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.emmalady.bai2fragment.Activity.MainActivity;
import com.example.emmalady.bai2fragment.R;

public class StudentNameFragment extends Fragment {
    private Button btnOK;
    private EditText edName;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_student_name, container, false);

        btnOK = (Button) v.findViewById(R.id.btnOK);
        edName = (EditText) v.findViewById(R.id.edName);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = edName.getText().toString();
                ((MainActivity)getActivity()).addStudentFragment(Name);
            }
        });
        return v;
    }

}
