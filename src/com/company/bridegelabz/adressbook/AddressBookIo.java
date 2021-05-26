package com.company.bridegelabz.adressbook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressBookIo {
    public static final String file = "addressbook.txt";

    public static void main(String[] args) {
        ContactInfo[] contactarray = {
                new ContactInfo("shruti", "Patil", "Mangaon", "Pune", "Maharashtra", "402104", "9130416631", "shruti13798@gmail.com"),
                new ContactInfo("Dadu", "Patil", "building", "pune", "maharshtra", "402104", "2020020200", "shsheueu@gmail.com"),
                new ContactInfo("RINKU", "bhingare", "building", "pune", "maharshtra", "402104", "9130416631", "shssjs@gmail.com")
        };
        AddressBookIo addressbook = new AddressBookIo();
        addressbook.writeDatatoFile(Arrays.asList(contactarray));
        addressbook.readDataFromFile();
    }

    private void readDataFromFile() {
        try {
            Files.lines(new File(file).toPath()).forEach(System.out::println);
            long entires = Files.lines(new File(file).toPath()).count();
            System.out.println(entires);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void writeDatatoFile(List<ContactInfo> list) {
        StringBuffer buffer = new StringBuffer();
        list.forEach(contacts -> {
            String concatString = contacts.toString().concat("\n");
            buffer.append(concatString);
        });
        try {
            Files.write(Paths.get(file), buffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
