package com.company;


import java.util.Scanner;

public class Main {

    private static Object elseif;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello java");
//
//      int a = 30;
//      int b =10;
//        System.out.println(Math.max(a,b));

      /*  int a = 30;
        int b = 20;
        System.out.println(Math.min(a,b));

        int c = 3;
        int d = 2;
        System.out.println(Math.sqrt(d));

        double e = 5;
        double f =2;
        System.out.println(Math.pow(5,f));
*/
//        double rand = Math.round( Math.random()*10);
//        System.out.println(rand);
//
//        double rand1 = Math.ceil(Math.random()*10);
//        System.out.println((int)rand1);
//
//        System.out.println(generateRandom(40,20));
//
//    }
//    static int generateRandom (int max, int min){
//        double rand = Math.ceil(Math.random() *(max-min)+min);
//        return (int) rand;
       /* double a = 10.5;
        System.out.println(Math.floor(a));
*/
      /*  try {
            Scanner input;
            input = new Scanner(System.in);
            System.out.println("Please Type your integer value:");
            int a = input.nextInt();
            System.out.println("Please type your double value :");
            double b = input.nextDouble();
            System.out.println("Please type your string value :");
            String c = input.next();


            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Please the correct input");
*//*

 */

//
//        int a,b,c;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter three numbers");
//        a = scan.nextInt();
//        b =scan.nextInt();
//        c =scan.nextInt();
//        scan.close();
//
//        if (a > b){
//            System.out.println("Big value");
//        }
//        else if (b > c){
//            System.out.println("Small value");
//        }
//
//        else {
//            System.out.println("other values");
//      }

//
//                int year;
//                Scanner sc = new Scanner(System.in);
//                System.out.println("enter a leap year value ::");
//                year = sc.nextInt();
//                if (((year % 4 ==0) && (year % 100!=0)) || (year % 400 ==0)){
//                    System.out.println("Specified year is leap year");
//                }
//                else {
//                    System.out.println("Specified year is not leap year ");
//                }
//        char ch;
//        System.out.println("Enter character ::");
//        Scanner sc = new Scanner(System.in);
//        ch = sc.next().charAt(0);
//        if ( ch >= 'A' && ch <= 'Z'){
//            System.out.println("Is an uppercase letter");
//        }
//        else if (ch >= 'a' && ch <= 'b'){
//            System.out.println("Is a lowercase letter");
//        }
//        else {
//            System.out.println("is not a alphabet");
//        }
//
//

        String _username = "Alamin";
        String _password = "1234";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name::");
        String username = scan.next();
        System.out.println("Enter user password");
        String password = scan.next();

        if (username.equals(_username) && (password.equals(_password))){
            System.out.println("Access guranted");
        }
        else {
            System.out.println("Mitch match");
        }



            }

        }










