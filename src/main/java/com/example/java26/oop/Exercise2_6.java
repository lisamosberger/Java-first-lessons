package com.example.java26.oop;

public class Exercise2_6 {
    static void main() {
        double price1 = 49.90;
        double price2 = price1;
        price1 = 99.90;

        System.out.println(price2); // Vad skivs ut?

        Employee e1 = new Employee("Alex", 32000, "IT");
        Employee e2 = e1;
        e2.setSalary(40000);
        System.out.println(e1.getSalary()); // Vad skrivs ut?

    }
}
