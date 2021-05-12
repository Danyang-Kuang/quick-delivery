package com.mycompany.app;

public class Userprofile implements Newuser{
    private String name;
    private int phone;
    private String address;
    private String email;

    public Userprofile(String name, int phone, String address, String email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }


    @Override
    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public void changePhoneNumber(int number) {
        this.phone = number;
    }

    @Override
    public void changeAddress(String address) {
        this.address = address;
    }

    @Override
    public void changeEmail(String email) {
        this.email = email;
    }
}
