/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz2;

/**
 *
 * @author Alex
 */
class Surgeon extends Doctor{
    
    public Surgeon(String firstName, String secondName, int age){
        super(firstName, secondName, age);
    }
    
    @Override
    public void doHeal(){
        System.out.println(super.getFirstName() + " " + super.getSecondName() + " " + super.getAge() + " heal");
    }
    
    @Override
    public void doExam(){
        System.out.println(super.getFirstName() + " " + super.getSecondName() + " " + super.getAge() + " exam");
    }
    
    @Override
    public void doOperation(){
        System.out.println(super.getFirstName() + " " + super.getSecondName() + " " + super.getAge() + " operate");
    }
    
}
