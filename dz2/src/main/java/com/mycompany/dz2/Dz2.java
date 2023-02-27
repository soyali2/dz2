/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dz2;

/**
 *
 * @author Alex
 */
public class Dz2 {

    public static void main(String[] args) {
        System.out.println("РИБО-04-21 Монахов Александр Вариант 3");
        Doctor ivan = new Doctor("Иван", "Иванов", 30);
        ivan.doHeal();
        ivan.doExam();
        ivan.doOperation();
        Doctor petr = new Surgeon("Петр", "Петров", 40);
        petr.doHeal();
        petr.doExam();
        petr.doOperation();
    }
}
