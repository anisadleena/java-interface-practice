package org.javaPractice;

public class SamsungPhone implements Phone{
    public String processor(){
        return "1000";
    }

    @Override
    public String spaceInGb() {
        return null;
    }
}
