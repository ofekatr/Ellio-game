package com.hackbiu.accessibility;

public class TestListener implements FaceListener {
    public static boolean test;
    @Override
    public void onBlink(){
        test = !test;
    }
}
