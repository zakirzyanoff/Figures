package com.company;

import com.company.model.FigureBase;
import com.company.model.triangle.EquilateralTriangle;
import com.company.model.triangle.IsoscelesTriangle;
import com.company.model.triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FigureBase[] figures = {
                    new Triangle(3, 4, 5),
                    new IsoscelesTriangle(4,5),
                    new EquilateralTriangle(8)};
            for (int i =0; i<figures.length;i++){
                System.out.println(figures[i].getInfo());
                System.out.println("Периметр: " + figures[i].getPerimeter());
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
