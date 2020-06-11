package com.example.todomvvm.adapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.todomvvm.MainFragment;
import com.example.todomvvm.R;
import com.example.todomvvm.database.UserEntry;
import com.example.todomvvm.tasks.LoginActivity;
import com.example.todomvvm.tasks.MainActivity;

public class ProfileFragment extends Fragment {

    UserEntry userentry;
    TextView texter;
    TextView fullname;
    TextView email;
    Button Logout;

    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        userentry = (UserEntry) getActivity().getIntent().getSerializableExtra("UserEntry");
        texter = view.findViewById(R.id.fullname);
        fullname = view.findViewById(R.id.full_name_profile);
        email = view.findViewById(R.id.full_email_profile);
        if (userentry !=null){
            texter.setText(userentry.getUserName());
            fullname.setText(userentry.getUserName());
            email.setText(userentry.getEmailAddress());
        }
        Intent in = getActivity().getIntent();
        String string = in.getStringExtra("message");
        Logout = (Button) view.findViewById(R.id.buttonLogout) ;
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Confirmation PopUp!").setMessage("You sure, that you want to logout?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getActivity().getApplicationContext(), LoginActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                        getActivity().finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert1 = builder.create();
                alert1.show();
            }
        });


        return view;
    }
}
