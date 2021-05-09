package com.company.bridegelabz.adressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static ArrayList<ContactInfo> user = new ArrayList<ContactInfo>();


    public static void addContact() {
        ContactInfo a1 = new ContactInfo();
        a1.getInput();
        user.add(a1);
        System.out.println(user);
    }

    public static void chooseOption() {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose one option from below \n 1:add contact \n 2:edit contact \n 3:delete contact");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                AddressBookMain.addContact();
                System.out.println("If you want to continue then press 1 or press 2 if you want to quit");
                int num = scan.nextInt();
                if (num == 1) {
                    chooseOption();
                } else {
                    break;
                }
                break;
            case 2:
                editContact();
                break;
            case 3:
                deleteContact();
                break;
            default:
                System.out.println("You choose Wrong Option please choose right option");
                AddressBookMain.chooseOption();
                break;
        }

    }

    public static void editContact() {

        Scanner scan = new Scanner(System.in);
        System.out.println("1");
        System.out.println("Enter name of contact you want to change in Address Book");
        String userName = scan.next();
        int count = 0;
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).inputFirstname.equalsIgnoreCase(userName)) {
                count++;
                System.out.println("Contact Found");
                System.out.println("Which Information You Want to Change Select Option \n 1.firstname \n 2.lastname \n 3.city\n 4.state\n 5.zip \n 6.phoneno \n 7.email-id ");
                int option = scan.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter First Name Of Person");
                        String name = scan.next();
                        user.get(i).inputFirstname = name;
                        System.out.println("Updated Address Book is");
                        System.out.println(user);
                        break;
                    case 2:
                        System.out.println("Enter Last Name Of Person");
                        name = scan.next();
                        user.get(i).inputLastname = name;
                        System.out.println("Updated Address Book is");
                        System.out.println(user);
                        break;
                    case 3:
                        System.out.println("Enter City Of Person");
                        name = scan.next();
                        user.get(i).inputCity = name;
                        System.out.println("Updated Address Book is");
                        System.out.println(user);
                        break;
                    case 4:
                        System.out.println("Enter State Of Person");
                        name = scan.next();
                        user.get(i).inputState = name;
                        System.out.println("Updated Address Book is");
                        System.out.println(user);
                        break;
                    case 5:
                        System.out.println("Enter Zip Of Person");
                        name = scan.next();
                        user.get(i).inputZip = name;
                        System.out.println("Updated Address Book is");
                        System.out.println(user);
                        break;
                    case 6:
                        System.out.println("Enter Phone Number Of Person");
                        name = scan.next();
                        user.get(i).inputPhoneno = name;
                        System.out.println("Updated Address Book is");
                        System.out.println(user);
                        break;
                    case 7:
                        System.out.println("Enter EmailId Of Person");
                        name = scan.next();
                        user.get(i).inputEmailid = name;
                        System.out.println("Updated Address Book is");
                        System.out.println(user);
                        break;
                    default:
                        System.out.println("you choose wrong option");
                        break;
                }
            }
        }
        if (count == 0) {
            System.out.println("Contact Not Found");
        }
    }

    public static void deleteContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Contact Person name");
        String name = scan.next();
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).inputFirstname.equalsIgnoreCase(name)) {
                System.out.println("Contact found");
                user.remove(i);
                System.out.println("Contact Removed From Address Book");
                System.out.println(user);
                break;
            }
            System.out.println("Contact not found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Programme");
        //UC1
        AddressBookMain.addContact();
        //UC2
        AddressBookMain.chooseOption();


    }
}
