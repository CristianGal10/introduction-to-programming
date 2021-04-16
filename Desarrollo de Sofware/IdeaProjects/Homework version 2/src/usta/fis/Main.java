package usta.fis;
//NAME       : Cristian Galvis
//DATE       : 16/04/2021
//DESCRIPTION: This software calculate the sum, rest, multiply or division between two numbers

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int v_number_one = 0;
        int v_number_two = 0;
        int v_operation = 0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please type the number one");
        v_number_one = keyboard.nextInt();
        System.out.println("please type the number two ");
        v_number_two = keyboard.nextInt();
        System.out.println("please type one for sum, two for rest, three for multiply or four for divide");
        v_operation = keyboard.nextInt();
        System.out.println("The result is:" + p_operate_numbers(v_number_one, v_number_two, v_operation));
        while (v_operation < 1 || v_operation > 4) {
            System.err.println("ERR: The options entered are not correct, please try again");
            v_operation = keyboard.nextInt();
        }
    }

    public static int p_operate_numbers(int v_number_one, int v_number_two, int v_operation) {
        if (v_operation == 1) {
            return v_number_one + v_number_two;
        }
        if (v_operation == 2) {
            return v_number_one - v_number_two;
        }
        if (v_operation == 3) {
            return v_number_one * v_number_two;
        }
        if (v_operation == 4) {
            return v_number_one / v_number_two;

        }
        return v_number_one;
    }

        public static void p_show_info_program(){
            //DATE       : 26-March-2021
            //DESCRIPTION: This method show info program
            System.out.println("------------------------------------------");
            System.out.println("-------SoftCalculator Version 1.0---------");
            System.out.println("--------Maker: Cristian Galvis------------");
            System.out.println("DESCRIPTION: This method show info program");
            System.out.println("------------------------------------------");

        }
    }


