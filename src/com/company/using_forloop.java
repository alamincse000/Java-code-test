package com.company;


import java.util.Scanner;

public class using_forloop {
    public static void main(String[] args) {

        int i, number,sum =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a visible number::");
        number = scan.nextInt();
        for (i =1 ; i <=5;i++){
            if (number % 5 ==0){
                System.out.println("Divisible");
                sum +=i;
            }
            System.out.println(sum);

        }



    }



    }



