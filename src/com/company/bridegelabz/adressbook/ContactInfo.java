package com.company.bridegelabz.adressbook;

import java.util.Scanner;

public class ContactInfo {
    public String firstName;
    public String lastName;
    public String state;
    public String city;
    public String zip;
    public String PhoneNo;
    public String emailId;
    String inputFirstname, inputLastname, inputCity, inputState, inputZip, inputPhoneno, inputEmailid;

    public void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first name");
        inputFirstname = scan.next();

        System.out.println("enter last name");
        inputLastname = scan.next();

        System.out.println("city");
        inputCity = scan.next();

        System.out.println("state");
        inputState = scan.next();

        System.out.println("zip");
        inputZip = scan.next();

        System.out.println("phone number");
        inputPhoneno = scan.next();

        System.out.println("emailId");
        inputEmailid = scan.next();


    }

    @Override
    public String toString() {
        return "adressBook{" +
                "Firstname='" + inputFirstname + '\'' +
                ", Lastname='" + inputLastname + '\'' +
                ", City='" + inputCity + '\'' +
                ", State='" + inputState + '\'' +
                ", Zip='" + inputZip + '\'' +
                ", Phoneno='" + inputPhoneno + '\'' +
                ", Emailid='" + inputEmailid + '\'' +
                '}';
    }

    ContactInfo() {
        System.out.println("Welcome to Address Book");
    }

    ContactInfo(String firstName, String lastName, String city, String state, String zip, String PhoneNo, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.PhoneNo = PhoneNo;
        this.emailId = emailId;
    }
}
