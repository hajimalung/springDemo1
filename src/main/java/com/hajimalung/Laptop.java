package com.hajimalung;

public class Laptop {
    private String brand;
    private String model;

    public Laptop() {
        System.out.println("Laptop created");
    }

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void openIDE(){
        System.out.println("Opening IDE on "+this.brand + " laptop");
    }
    public void compileCode(){
        System.out.println("Compiling code on "+this.model+" modal laptop");
    }
}
