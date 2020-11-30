package com.lambda;

public class Main {

    public static void main(String[] args) {
        ITelephone camsPhone;
        camsPhone = new DeskPhone(456456);

        camsPhone.powerOn();
        camsPhone.callPhone(456456);
        camsPhone.answer();

        camsPhone = new MobilePhone(123789);
        camsPhone.powerOn();
        camsPhone.callPhone(123789);
        camsPhone.answer();
    }
}
