package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] charArray;
        Scanner keyboard = new Scanner(System.in);
        String cadena = "";
        String result= "";
        System.out.println("This program show info about of capicua letters or numbers ENTER to end");

        cadena = keyboard.next();
        capicuaMethod(cadena);
        result=capicuaAnswer(cadena);
        System.out.println("The analisis result of the string is: "+result);


    }
    public static String capicuaAnswer(String cadena){
        if (capicuaMethod(cadena)==true){
            return "es capicua";
        }else{
            return  "No es capicua";

        }

    }

    public static boolean capicuaMethod(String cadena){
        char []charArray;
        charArray=new char[cadena.length()];
        charArray=cadena.toCharArray();

        for (int i=0; i < charArray.length; i++){
            if (charArray[i]!=charArray[charArray.length-(i+1)]){
                return false;
            }
        }
        return true;
    }
}
