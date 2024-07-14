package com.rd;

public class PhoneBrand {
    private static PhoneBrand instance;

    private PhoneBrand() {
        // Constructor
    }

    public static PhoneBrand getInstance() {
        if (instance == null) {
            instance = new PhoneBrand();
        }
        return instance;
    }

    public void managePhoneBrand() {
        System.out.println("Phone brand is being managed.");
    }
}

