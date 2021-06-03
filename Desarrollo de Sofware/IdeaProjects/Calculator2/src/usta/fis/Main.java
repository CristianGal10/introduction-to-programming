package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number_one = 0;
        int number_two = 0;
        int v_result = 0;
        int operation_todo = 0;
        Scanner keyboard = new Scanner(System.in);

        program_info();

        System.out.println("Please type the aritmetic operation: 1 to add. 2 to substract, 3 multiply, 4 divide, 5 numbers prime: ");
        operation_todo = keyboard.nextInt();
        if (operation_todo != 0){
           operation_todo = keyboard.nextInt();
        System.out.println("Please type the first number: ");
        number_one = keyboard.nextInt();
            }
        if (operation_todo>0 && operation_todo<5) {
            System.out.println("Please type the second number: ");
            number_two = keyboard.nextInt();

        }

        v_result = operation_calculate(number_one, number_two, operation_todo, v_result);

        System.out.println("The result is: " + v_result);



    }

    public static int operation_calculate(int number1, int number2, int operation, int v_result) {
        if (operation == 1) {
            return number1 + number2;

        }
        if (operation == 2) {
            return number1 - number2;

        }
        if (operation == 3) {
            return number1 * number2;

        }
        if (operation == 4 && number2 != 0) {
            return number1 / number2;

        }
        if (operation == 5) {
            p_valite(number1);
        }

        return 0;
    }


    public static boolean p_valite(int v_prime){
        int v_numbers_divide=0;
        for (int i=1;i<=v_prime;i++){
            if (v_prime%i ==0){
                v_numbers_divide++;
            }
        }
        if (v_numbers_divide!=2){
            System.out.println("The number no is prime");
            return false;

        }
        System.out.println("The number is prime");
        return true;
    }

        public static void program_info () {
            System.out.println("This program add, substract, mulyiply and divide 2 integer number");
            System.out.println("Developed by: Cristian Galvis");
            System.out.println("Date: 7/05/2021");
        }
    }

