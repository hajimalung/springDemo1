package com.hajimalung;

public class Alien {

    String name = "Unknown";
    private ComputingMachine com;

    public Alien(String name) {
        System.out.println("Creating Alien " + name);
        this.name = name;
    }

    public ComputingMachine getCom() {
        return com;
    }

    public void setCom(ComputingMachine com) {
        this.com = com;
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
        com.openIDE();
        System.out.println(this.name + " is coding");
        com.compileCode();
    }
}
