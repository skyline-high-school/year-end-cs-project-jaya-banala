package com.company;
import java.util.HashSet;
import java.util.Scanner;

public class Management {

    HashSet<Student> set = new HashSet<Student>();

    Student set1 = new Student(880541, "Jaya", 17, "Yes", "Statistics", 11);
    Student set2 = new Student(400005, "Anusha", 18, "Yes", "History", 12);

    Scanner sc = new Scanner(System.in);
    boolean IdFound = false;
    double id;
    String name;
    int age;
    String doesIB;
    String className;
    int gradeNum;

    public Management(){
        set.add(set1);
        set.add(set2);
    }

    //viewing all the employees
    public void viewAllStudents(){
        for (Student emp:set){
            System.out.println(emp);
        }

    }

    //view Student based on ID
    public void viewOneEmp(){
        System.out.println("Enter Student ID: ");
        id=sc.nextDouble();
        for(Student emp:set){
            if (emp.getId() ==id){
                System.out.println(emp);
                IdFound = true;
            }
        }
        if (!IdFound){
            System.out.println("Student with this ID is not present :(");
        }

    }

    //updating Student info
    public void updateEmp(){
        System.out.println("Enter Employee ID: ");
        id=sc.nextInt();
        boolean IdFound = false;
        for(Student emp:set){
            if (emp.getId() ==id){
                System.out.println("Enter Name: ");
                name = sc.next();
                System.out.println("Enter NEW age: ");
                age = sc.nextInt();
                emp.setName(name);
                emp.setAge(age);
                System.out.println("Enter NEW grade: ");
                gradeNum = sc.nextInt();
                emp.setName(name);
                emp.setGradeNum(gradeNum);
                System.out.println("Updated Details of Student are:");
                System.out.println(emp);
                IdFound=true;
            }
        }
        if (!IdFound){
            System.out.println("Student is not present :(");

        }else
            System.out.println("Student details have been updated! :)");



    }


    //deleting an Student
    public void deleteEmp(){
        System.out.println("Enter the Student ID that you would like to delete: ");
        id = sc.nextInt();
        boolean IdFound = false;
        Student empDelete = null;
        for (Student emp:set){
            if (emp.getId()==id){
                empDelete=emp;
                IdFound=true;
            }
        }
        if (!IdFound){
            System.out.println("Student is not present :(");
        }else{
            set.remove(empDelete);
            System.out.println("Student deleted! >:)");
        }
    }


    //add Student
    public void addStudent(){
        System.out.println("Enter ID: ");
        id= sc.nextInt();
        System.out.println("Enter Name: ");
        name= sc.next();
        System.out.println("Enter Age: ");
        age= sc.nextInt();
        System.out.println("Does IB Classes(Yes/No):");
        doesIB=sc.next();
        System.out.println("Enter 1st Period Class(no spaces): ");
        className= sc.next();
        System.out.println("Enter Grade(number): ");
        gradeNum = (int) sc.nextDouble();

        Student newStudent = new Student(id,name,age,doesIB,className, gradeNum) ;
        set.add(newStudent);
        System.out.println("New Student Added! :) ");
        System.out.println(newStudent);


    }





}
