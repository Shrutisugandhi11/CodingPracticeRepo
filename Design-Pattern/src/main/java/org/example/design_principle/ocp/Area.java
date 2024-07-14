package org.example.design_principle.ocp;

public abstract class Area {
    //rather than providing implementation of method in area class shape can extend area and get area

    public abstract String getArea();
}
