package com.company.model.triangle;

public class EquilateralTriangle  extends IsoscelesTriangle{
    public EquilateralTriangle(double side) {
        super(side,side);
        this.name = "Равносторонний треугольник";
    }

    @Override
    public String getInfo() {
        return name + " со стороной " + firstSide;
    }
}
