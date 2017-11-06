package com.example.jamb.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by jamb on 9/18/2017.
 */

public class FragmentOne extends Fragment {
    Button changeBG;
    Button showToast;
    Toast toast;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can equally use getActivity() instead of view in some cases with fragments
        changeBG = view.findViewById(R.id.changeBG);
        showToast = view.findViewById(R.id.toastBT);


        changeBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBG.setBackgroundColor(Color.YELLOW);
                BackgroundColor();
            }
        });

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            //you have to use view instead of MainActivity in this context
            //if view doesn't work use getActivity(), if still doesn't work
            //use getActivity().getApplicationContext
            public void onClick(View view) {toast.makeText(getActivity(), "Thank you for the Toast", Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }

    public void BackgroundColor(){
        RelativeLayout relativeLayout = getActivity().findViewById(R.id.background);
        relativeLayout.setBackgroundColor(Color.YELLOW);
    }
}
