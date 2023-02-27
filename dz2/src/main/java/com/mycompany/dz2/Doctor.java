/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz2;

import java.io.PrintStream;

/**
 *
 * @author Alex
 */
class Doctor {
    private String firstName;
     
    public String getFirstName() { return firstName; }
    
    private String secondName;
     
    public String getSecondName() { return secondName; }
    
    private int age;
     
    public int getAge() { return age; }

    public Doctor(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    
    public void doHeal(){
        System.out.println(firstName + " " + secondName + " " + age + " heal");
    }
    
    public void doExam(){
        System.out.println(firstName + " " + secondName + " " + age + " exam");
    }
    
    public void doOperation(){
        System.out.println(firstName + " " + secondName + " " + age + " operate");
    }
    
}
