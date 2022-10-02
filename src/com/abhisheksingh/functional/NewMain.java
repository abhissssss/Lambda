package com.abhisheksingh.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class NewMain {
    public static void main(String[] args) {
        Employees me = new Employees("Abhishek" , 21);
        Employees jane = new Employees("Zhenya" , 22);
        Employees sid = new Employees("Sid" , 32);
        Employees suraj = new Employees("Suraj" , 30);
        Employees karan = new Employees("Karan" , 34);
        Employees hari = new Employees("Hari" , 36);

        List<Employees> employees = new ArrayList<>();
        employees.add(me);
        employees.add(jane);
        employees.add(sid);
        employees.add(karan);
        employees.add(hari);
        employees.add(suraj);
        printEmployeesByAge(employees, "Employees over 30" , employees1 -> employees1.getAge()>30);
        printEmployeesByAge(employees, "\nEmployees 30 and under" , employees1 -> employees1.getAge()<=30);
        printEmployeesByAge(employees, "\nEmployees 25 and under", new Predicate<Employees>() {
            @Override
            public boolean test(Employees employees) {
                return employees.getAge()<25;
            }
        });

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i <100;

        System.out.println(greaterThan15.test(10));
        int a = 20;
        System.out.println(greaterThan15.test(a+5));
        System.out.println(greaterThan15.and(lessThan100).test(50));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());

        }
//        employees.forEach(employees1 -> {
//            System.out.println(employees1.getName());
//            System.out.println(employees1.getAge());
//        });

//        for (Employees employees1 : employees){
//            if (employees1.getAge()>=30){
//                System.out.println(employees1.getName());
//            }
//        }
//
//        System.out.println("\nEmployees 30 and younger");
//        System.out.println("================");
//        employees.forEach(employees1 -> {
//            if(employees1.getAge()<=30){
//                System.out.println(employees1.getName());
//            }
//        });


    }

    private static void printEmployeesByAge (List<Employees> employees, String ageText , Predicate<Employees> ageCondition){
        System.out.println(ageText);
        System.out.println("====================");
        for (Employees employees1 : employees){
            if (ageCondition.test(employees1)){
                System.out.println(employees1.getName());
            }
        }
    }

}
