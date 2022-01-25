package com.company;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
//        int balance = 100000, withdraw, deposit;
//
//        //create scanner class object to get choice of user
//
//        Scanner sc = new Scanner(System.in);
//
//
//        while(true)
//        {
//            System.out.println("Automated Teller Machine");
//            System.out.println("Choose 1 for Withdraw");
//            System.out.println("Choose 2 for Deposit");
//            System.out.println("Choose 3 for Check Balance");
//            System.out.println("Choose 4 for EXIT");
//            System.out.print("Choose the operation you want to perform:");
//
//            //get choice from user
//            int choice = sc.nextInt();
//            switch(choice)
//            {
//                case 1:
//                    System.out.print("Enter money to be withdrawn:");
//
//                    //get the withdrawl money from user
//                    withdraw = sc.nextInt();
//
//                    //check whether the balance is greater than or equal to the withdrawal amount
//                    if(balance >= withdraw)
//                    {
//                        //remove the withdrawl amount from the total balance
//                        balance = balance - withdraw;
//                        System.out.println("Please collect your money");
//                    }
//                    else
//                    {
//                        //show custom error message
//                        System.out.println("Insufficient Balance");
//                    }
//                    System.out.println("");
//                    break;
//
//                case 2:
//
//                    System.out.print("Enter money to be deposited:");
//
//                    //get deposite amount from te user
//                    deposit = sc.nextInt();
//
//                    //add the deposit amount to the total balanace
//                    balance = balance + deposit;
//                    System.out.println("Your Money has been successfully depsited");
//                    System.out.println("");
//                    break;
//
//                case 3:
//                    //displaying the total balance of the user
//                    System.out.println("Balance : "+balance);
//                    System.out.println("");
//                    break;
//
//                case 4:
//                    //exit from the menu
//                    System.exit(0);
//            }
//
//        }

        int balance = 100000, withdraw,deposited;
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("Automated taller Machine ");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposited");
            System.out.println("Choose 3 for check Balance");
            System.out.println("Choose 4 Exit");
            System.out.println("Choose the operation you want to perform");
            int choice = sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("Enter money to be withdraw");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw){
                        balance = balance -withdraw;
                        System.out.println("please collect your money");
                    }
                    else{
                        System.out.println("In sufficient balance");
                    }
                    break;

                case 2:
                    System.out.println("Enter deposited money");
                    deposited = sc.nextInt();
                    balance = balance +deposited;
                    System.out.println("Money deposited successfully done");
                    break;

                case 3:
                    System.out.println("Enter the check balance ");
                    System.out.println("Balance " + balance);
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }

}