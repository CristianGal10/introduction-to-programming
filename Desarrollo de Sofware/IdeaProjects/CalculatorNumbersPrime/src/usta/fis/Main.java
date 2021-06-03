package usta.fis;
//NAME       : Cristian Galvis
//DATE       : 22/04/2021
//DESCRIPTION: This software use for calculate many operations


import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            int v_number_one = 0;
            int v_number_two = 0;
            int v_operation  = 0;
            p_show_info_program();
            Scanner keyboard = new Scanner(System.in);

            do {
                System.out.println("Please, type one for sum, two for subtract, three for multiply, four for divide, five for know if it is a prime number, six for that the prime numbers less than the digitized come out,zero for exit");
                v_operation = keyboard.nextInt();
                if (v_operation == 0){
                    System.exit(0);}
                if (v_operation != 0){
                v_operation = keyboard.nextInt();
                System.out.println("Please, type the number one");
                v_number_one = keyboard.nextInt();
                System.out.println("Please, type the number two");}
                if (v_operation>0 && v_operation<5) {
                    v_number_two = keyboard.nextInt();
                }
                System.out.println("The result is:" + p_operate_numbers(v_number_one, v_number_two, v_operation));
            }while (v_operation != 0);

            }

        public static String p_operate_numbers (int v_number_one, int v_number_two, int v_operation) {

            int v_result = 0;
            String v_convert = "";
            switch (v_operation) {
                case 1:
                    v_result = v_number_one + v_number_two;
                    break;
                case 2:
                    v_result = v_number_one - v_number_two;
                    break;
                case 3:
                    v_result = v_number_one * v_number_two;
                    break;
                case 4:
                    v_result = v_number_one / v_number_two;
                    break;
                case 5:
                    v_convert = "No is prime numbers";
                    if (p_validate_prime(v_number_one)) {
                        v_convert = "Is number prime";
                    }
                    break;
                case 6:
                    v_convert = "The prime number is:"+p_prime_numbers(v_number_one);
                    break;
                default:
                    v_convert = "Exit";
            }

            if (v_convert.isEmpty()) {
                v_convert = String.valueOf(v_result);
            }
            return v_convert;
        }

        public static String p_prime_numbers(int v_limit){
            String prime_numbers="";
            for (int counter = 1; counter<=v_limit;counter++){
                if (p_validate_prime(counter)){
                    prime_numbers=prime_numbers+String.valueOf(counter)+", ";
                }
            }

            return prime_numbers;
                }
        public static boolean p_validate_prime(int v_prime){
                        int v_numbers_divide=0;
                        for (int i=1;i<=v_prime;i++){
                            if (v_prime%i ==0){
                                v_numbers_divide++;
                            }
                        }
                if (v_numbers_divide!=2){
                    return false;
                }
                    return true;
            }

            public static void p_show_info_program () {
                //DATE       : 26-March-2021
                //DESCRIPTION: This method show info program
                System.out.println("------------------------------------------");
                System.out.println("-------SoftCalculator Version 1.0---------");
                System.out.println("--------Maker: Cristian Galvis------------");
                System.out.println("DESCRIPTION: This method show info program");
                System.out.println("------------------------------------------");

            }


}




