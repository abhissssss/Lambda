package com.abhisheksingh.lambda;

class AnotherClass {


    public String doSomething() {
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expressions class is " + getClass().getSimpleName());
            return s1.toUpperCase()+s2.toUpperCase();

        };
        System.out.println("The Another class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "Sid", "Jain");
    }

    public void printValue() {
        int number = 25;
        Runnable r = () -> {
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };
        new Thread(r).start();
    }
}
