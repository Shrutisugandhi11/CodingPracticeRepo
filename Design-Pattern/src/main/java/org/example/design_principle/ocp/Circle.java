package org.example.design_principle.ocp;

public class Circle extends Area{
    @Override
    public String getArea() {
        return "2πr" ;
    }
}
