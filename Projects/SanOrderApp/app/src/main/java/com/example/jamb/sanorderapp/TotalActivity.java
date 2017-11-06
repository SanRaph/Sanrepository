package com.example.jamb.sanorderapp;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.StringTokenizer;
/**
 * Created by jamb on 9/21/2017.
 */

public class TotalActivity extends MainActivity{
        MyApp mApp;
        EditText et_summary;
        TextView tv_total;
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.total);
            mApp=((MyApp)getApplicationContext());
            et_summary = (EditText) findViewById(R.id.et_summary);
            tv_total = (TextView) findViewById(R.id.tv_total);
            //Toast.makeText(getApplicationContext(), "You have chosen the" + " " +  mApp.getGlobalVarValue(), Toast.LENGTH_LONG).show();
            et_summary.setText(mApp.getGlobalVarValue());
            String str = mApp.getGlobalVarValue();
            StringTokenizer st = new StringTokenizer(str,"$");
            String test="";
            float total=0;
            int count=0;
            while (st.hasMoreElements()) {
                Toast.makeText(getApplicationContext(), st.nextElement().toString().substring(0,1), Toast.LENGTH_LONG).show();
                test = st.nextElement().toString().substring(0,1);
                if(count>0)
                    total+= Float.parseFloat(test);
                count++;
            }
            et_summary.setText(mApp.getGlobalVarValue());
            tv_total.setText("Total :" + total+"");
            mApp.setGlobalClear();


        }
        public boolean isFloat( String input )
        {
            try
            {
                Float.parseFloat( input );
                return true;
            }
            catch( Exception e)
            {
                return false;
            }
        }
    }
