package usta.fis;
//AUTHOR: Cristian Josue Galvis Fonseca
//DATE: 15-04-2021
//Description: this software calculate the sum or rest between two numbers

import java.util.Scanner;  //Para usar el teclado dentro del software

public class Main {

    public static void main(String[] args) {
        int v_number1, v_number2, v_operacion;
        Scanner keyboard = new Scanner(System.in); //use la variable como instancia para el teclado
        System.out.println("Enter the first whole number");
        v_number1 = keyboard.nextInt(); //Pidiendo por teclado la variable numero
        System.out.println("Enter the second whole number");
        v_number2 = keyboard.nextInt();
        System.out.print("If you want addition, write the number 1 ");
        System.out.println("or if you want subtraction, write the number 2");
        System.out.println("If you want multiply, write the number 3");
        v_operacion = keyboard.nextInt();
        while (v_operacion < 1 || v_operacion > 3) {
            System.err.println("ERR: The options entered are not correct, please try again");
            v_operacion = keyboard.nextInt(); //Pidiendo por teclado la variable v_operación
        }
        if (v_operacion == 1) {
            System.out.print("The result of the sum is: ");
            System.out.println(v_number1 + v_number2);
        }
        if (v_operacion == 2) {
            System.out.print("The result of the subtraction is: ");
            System.out.print(v_number1 - v_number2);
        }
        if (v_operacion == 3) {
            System.out.println("The result of the product is: ");
            System.out.print(v_number1 * v_number2);


        }
    }
}



