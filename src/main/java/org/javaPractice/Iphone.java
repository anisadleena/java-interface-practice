package org.javaPractice;

public class Iphone implements Phone{
    @Override
    public String processor(){
        return "A15";
    }

    @Override
    public String spaceInGb() {
        return "250GB";
    }
}
