package com.software_solutions.optimus_tech_project201709;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by H.P on 23-Jun-17.
 */

public class SliderWalkthrough {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public SliderWalkthrough(Context context) {
        this.context = context;
        sharedPreferences=context.getSharedPreferences("first",0);
        editor=sharedPreferences.edit();
     }

    public void setFirst(Boolean firstTime){
        editor.putBoolean("check",firstTime);
        editor.commit();
    }

    public boolean Check()
    {
        return sharedPreferences.getBoolean("check",true);
    }
}
