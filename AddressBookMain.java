package com.bridgelabz;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
        ArrayList book = new ArrayList();

        Scanner sc = new Scanner(System.in);
        
        int option;
        do{
            System.out.println("Enter Number: ");
            System.out.print("1.Add\n");
            System.out.print("2.Display\n");
            System.out.print("3.Exit\n");
            option = sc.nextInt();

            switch (option){

                case 1 :
                    AddressBook addressBook = new AddressBook();
                    addressBook.getContact();
                    book.add(addressBook);
                    System.out.println(book);
                    break;

                case 2 :
                    System.out.println("Display Contact : ");
                    System.out.println(book);
                    break;

                case 3 :
                    System.out.println("Exiting from book");
                    break;

            }
        }
        while (option != 3);


    }
	}


