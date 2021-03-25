package usta.fis;

import java.util.Scanner;

//AUTHOR: Cristian Galvis
//DATE:2021-March-16
//DESCRIPTION: This software show variable than input by keyboard
public class Main {

    public static void main(String[] args) {

        System.out.println("-------------");
        System.out.println("SoftInputNum version 1.0");
        System.out.println("Maker: Cristian Galvis");
        System.out.println("-------------");
        Scanner keyboard= new Scanner(System.in);

        int v_number1, v_number2, v_sum;
        System.out.println("input the first number");
        v_number1= keyboard.nextInt();
        System.out.println("input the second number");
        v_number2= keyboard.nextInt();
        v_sum= v_number1+v_number2;
        System.out.println("the total sum is: " + v_sum);
    }
}
