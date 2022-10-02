package com.abhisheksingh.lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MyEmployees me = new MyEmployees("Abhishek", 21);
        MyEmployees jane = new MyEmployees("Zhenya", 22);
        MyEmployees sid = new MyEmployees("Sid", 33);
        MyEmployees suraj = new MyEmployees("Suraj", 29);

        List<MyEmployees> myEmployeesList = new ArrayList<>();
        myEmployeesList.add(me);
        myEmployeesList.add(jane);
        myEmployeesList.add(sid);
        myEmployeesList.add(suraj);



        myEmployeesList.sort(Comparator.comparing(MyEmployees::getName));
        int i = 1;
        System.out.println("The employees are as following :");
        for (MyEmployees myEmployees : myEmployeesList) {
            System.out.println(i++ + "-->" + myEmployees.getName());

        }
        UpperConcat uc = (s1, s2) -> {

         String result = s1.toUpperCase() + "----" + s2.toUpperCase();
         return result;
          };
        String sillyString = doStringStuff(uc, myEmployeesList.get(0).getName(), myEmployeesList.get(1).getName());
        System.out.println(sillyString);


        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

      static String doStringStuff(UpperConcat upperConcat, String s1, String s2) {
        return upperConcat.upperAndConcat(s1, s2);
    }


}




