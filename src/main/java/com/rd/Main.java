package com.rd;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PhoneBrand phoneBrand = PhoneBrand.getInstance();
        phoneBrand.managePhoneBrand();

        Phone phone = Phone.managePhone("Iphone","14 Pro",8,6.4 ,"White");

        System.out.println(phone);
    }
}


