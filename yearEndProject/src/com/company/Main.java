package com.company;


import java.util.Scanner;
public class Main {
//OFFICE MANAGEMENT SYSTEM
    //success criteria:
    //
    //Keeps track of Student names
    //
    //Keeps track of student ids
    //
    //Keeps track of student grades
    //
    //Is easy to use

    Management management = new Management();
    static boolean order = true;
    public static void menu(){

        System.out.println("-----------------------------------------------------------------"+
                "\n1 ADD Student"
                + "\n2 DELETE Student"
                + "\n3 UPDATE Student"
                + "\n4 VIEW Student"
                + "\n5 VIEW ALL Students"
                + "\n6 EXIT");

    }


    public static void main(String[] args) {
        System.out.println("----------- ~ Welcome to the Office Management System ~ -----------");
        Scanner sc =  new Scanner(System.in);
        Management manage = new Management();
        do {
            menu();
            System.out.println("Enter a your choice (1-6):");
            int choice =sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("ADD Student");
                    manage.addStudent();

                    break;
                case 2:
                    System.out.println("DELETE Student");
                    manage.deleteEmp();
                    break;
                case 3:
                    System.out.println("UPDATE Student");
                    manage.updateEmp();
                    break;
                case 4:
                    System.out.println("VIEW Student");
                    manage.viewOneEmp();
                    break;
                case 5:
                    System.out.println("VIEW ALL Students");
                    manage.viewAllStudents();
                    break;
                case 6:
                    System.out.println("Thanks for using this system!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number from 1 to 6 >:(");


            }
        }while(order);

    }


}
