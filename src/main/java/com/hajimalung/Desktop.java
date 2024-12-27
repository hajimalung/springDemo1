package com.hajimalung;

public class Desktop implements ComputingMachine{
    @Override
    public void openIDE(){
        System.out.println("Opening IDE on  Desktop");
    }
    @Override
    public void compileCode(){
        System.out.println("Compiling code on  modal Desktop");
    }
}
