package com.company;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(student(7, 10));
        System.out.println(student(15, -30));
        System.out.println(student(22, 10));
        System.out.println(student(43, 50));
        System.out.println(student(7, 10));
    }


    public static String  student(int age, int temperature) {
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            return "Mojno idti gulyat";
        } else if ((age < 20) && (temperature >= 0 && temperature < 28)) {
            return "2";
        } else if ((age > 45) && (temperature > -10 && temperature < 25)) {
            return "2";
        } else {
            return "3";
        }
    }
}


