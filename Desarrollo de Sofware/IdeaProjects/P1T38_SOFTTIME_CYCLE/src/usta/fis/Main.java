package usta.fis;

//AUTHOR     : Cristian Galvis
//DATE       : 23 March of 2021
//DESCRIPTION: This software calculate time between two cities

import java.util.Scanner; //para usar el teclado dentro del software

public class Main {

    public static void main(String[] args) {
	int v_distance= p_user_distance();
    }
    public static void p_show_info_program(){
        //DATE       : 23 March of 2021
        //DESCRIPTION: This method show the info software
        System.out.println("----------------------------------------------");
        System.out.println("__________SOFTTIMECYCLE VERSION 1.O___________");
        System.out.println("___________MAKER: Cristian Galvis_____________");
        System.out.println("DESCRIPTION: calculate time between two cities");
        System.out.println("----------------------------------------------");
}

public static int p_user_distance() {
    Scanner keyboard = new Scanner(System.in);
    int v_distance;
    System.out.println("input distance between two cities");
    v_distance = keyboard.nextInt();
    while (v_distance < 0) {
        System.err.println("Err: the distance should be greater than zero, input again distance between two cities");
        v_distance = keyboard.nextInt();
    }
    return v_distance;
}
}
