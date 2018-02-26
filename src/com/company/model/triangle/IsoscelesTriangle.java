package com.company.model.triangle;

public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(double side, double base) {
        super(side,side,base);
        this.name="Равнобедренный Треугольник";
    }
    @Override
    public String getInfo() {
        return name +" со сторонами " + firstSide + " и основанием " + thirdSide;
    }
}
