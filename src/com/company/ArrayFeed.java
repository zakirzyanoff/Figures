package com.company;
import java.util.Scanner;
public class ArrayFeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte size = sc.nextByte();
        int[][] values = getIntArray(size);
        printArray(values);
    }
    private static int[][] getIntArray(byte size){
        int values[][] = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size;j++){
                if ((i==j)||(i==size-1-j)||(j==size/2)||(i==size/2)){
                    values[i][j]=1;
                }
            }
        }
        return values;
    }
    private static void printArray(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}