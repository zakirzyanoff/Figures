package com.company.model.triangle;

import com.company.model.FigureBase;
import com.company.model.Validator;

public class Triangle extends FigureBase{

    private final String ERROR_MESSAGE= "Треугольник с задаными сторонами не может существовать";

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        Validator validator = new Validator();
        if (validator.validateTriangle(firstSide,secondSide,thirdSide)) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            this.name = "Треугольник";
        }else {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    double firstSide;
    double secondSide;
    double thirdSide;

    @Override
    public double getPerimeter() {
        return firstSide+secondSide+thirdSide;
    }

    @Override
    public String getInfo() {
        return name +" со сторонами " + firstSide + ", " + secondSide + ", "+ thirdSide;
    }



}
