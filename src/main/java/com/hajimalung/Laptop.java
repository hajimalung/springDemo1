package com.hajimalung;

import java.beans.ConstructorProperties;

public class Laptop {
    private String brand;
    private String model;

    public Laptop() {
        System.out.println("Laptop created");
    }

    @ConstructorProperties({ "brand", "model1" })
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
