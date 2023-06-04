package com.company;

public class Student {

    private double id;
    private String name;
    private int age;
    private String doesIB;
    private String className;
    private int gradeNum;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDoesIB() {
        return doesIB;
    }

    public void setDoesIB(String doesIB) {
        this.doesIB = doesIB;
    }

    public String getDept() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getGradeNum() {
        return gradeNum;
    }

    public void setGradeNum(int gradeNum) {
        this.gradeNum = gradeNum;
    }


    public String toString(){
        return "Student [ID: " + id + ", NAME: " + name + ", AGE: " + age
                + ", DOES IB CLASSES(Yes/No): " + doesIB + ", "+"1st PERIOD CLASS: " + className + ", GRADE (Number):" + gradeNum + " ]";
    }

    public Student(double id, String name, int age, String doesIB, String className, int gradeNum ){
        super();
        this.id=id;
        this.name = name;
        this.className = className;
        this.age = age;
        this.gradeNum = gradeNum;
        this.doesIB =doesIB;
    }


}
