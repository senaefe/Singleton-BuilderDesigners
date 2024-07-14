package com.rd;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PhoneBrand phoneBrand = PhoneBrand.getInstance();
        phoneBrand.managePhoneBrand();

        Phone phone = new Phone.Builder()
                .setBrand("Iphone")
                .setModel("14 Pro Max")
                .setRam(8)
                .setScreenSize(6.4)
                .setColor("White")
                .build();

        System.out.println(phone);
    }
}


