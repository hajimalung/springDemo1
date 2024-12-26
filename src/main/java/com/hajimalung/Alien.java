package com.hajimalung;

public class Alien {

    String name = "Unknown";

    private Laptop lapObj;

    public Laptop getLapObj() {
        return lapObj;
    }

    public void setLapObj(Laptop lapObj) {
        this.lapObj = lapObj;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setting age to " + age);
        this.age = age;
    }

    public Alien() {
        System.out.println(" Created Alien | ");
    }

    public void code(){
        lapObj.openIDE();
        System.out.println(this.name + " is coding");
        lapObj.compileCode();
    }
}
