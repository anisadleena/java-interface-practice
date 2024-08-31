package org.javaPractice;

public class Main {
    public static void main(String[] args) {

        SamsungPhone phone1 = new SamsungPhone();
        String p = phone1.processor();
        System.out.println("samsung phone processor : " +p);
        System.out.println("samsung phone spaceInGb : " +phone1.spaceInGb());

        System.out.println("========================");
        Iphone phone2 = new Iphone();
        String ip = phone2.processor();
        System.out.println("Iphone processor : " +ip);
        System.out.println("Iphone spaceInGb : " +phone2.spaceInGb());
    }
}