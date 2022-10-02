package com.abhisheksingh.lambda;

import java.util.ArrayList;
import java.util.List;

public class Scope {
    public static void main(String[] args) {
        List<MyEmployees> myEmployeesList = new ArrayList<>();

        MyEmployees me = new MyEmployees("Abhishek" , 21);
        MyEmployees jane = new MyEmployees("Zhenya" , 22);
        MyEmployees sid = new MyEmployees("Sid" , 32);
        MyEmployees suraj = new MyEmployees("Suraj" , 29);


        myEmployeesList.add(me);
        myEmployeesList.add(jane);
        myEmployeesList.add(sid);
        myEmployeesList.add(suraj);

myEmployeesList.forEach(myEmployees -> {
    System.out.println(myEmployees.getName());
    System.out.println(myEmployees.getAge());
});
//        for (Employee employee : employeeList){
//            System.out.println(employee.getName());
//            new Thread(()-> System.out.println(employee.getAge())).start();
//        }
//
//        System.out.println("**********************");
//        for (int i = 0; i < employeeList.size(); i++) {
//            Employee employee = employeeList.get(i);
//            System.out.println(employee.getName());
//            new Thread(()  -> System.out.println(employee.getAge())).start();
//
//        }
    }
}
