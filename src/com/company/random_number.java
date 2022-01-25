package com.company;

import java.util.Random;
import java.util.Scanner;

public class random_number {
    public static void main(String[] args) {

        int r,r1,sum;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Random random = new Random();
        r =  rand.nextInt(100)+1;
        r1 = random.nextInt(100)+1;

        sum = r + r1;
        System.out.println(r + " + " + r1 + " sum is :" + + sum);


    }


    }

