package com.example.part_9_task_22_androidpro;

import android.util.Log;

public class Cars  {

    int wheels;
    int doors;
    String model;

    public Cars(int wheels, int doors, String model){
        this.wheels = wheels;
        this.doors = doors;
        this.model = model;
    };

    public void remedial(){
        Log.d("mylog","Cars remedials");
    }
    public void remedial(int doors,int wheels){
        Log.d("mylog","Remedials doors and wheels");
    }
    public void remedial(String model){
        Log.d("mylog","Use model");
    }
}
