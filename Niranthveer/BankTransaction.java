package com.citiustech;
import java.util.Scanner;

public class BankTransaction 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number:");
        
        long accountNumber =scanner.nextLong();

        System.out.println("Enter the account holder name : ");
        
        String name = scanner.next();

        System.out.println("Enter the initial balance  : ");
        int balance = scanner.nextInt();
        
        System.out.println("Enter the no of transactions : (Max 10)");
        int no_of_tx = scanner.nextInt();

        int tx_count =0;
        String[] miniStatement= new String[5]; 

        for (int i= 0; i< no_of_tx&& tx_count <10;i++) 
        {

            System.out.println("\n1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.print("Enter your choice : ");

            int choice =scanner.nextInt();
            String msg ="";  

            if (choice==1) 
            {
                System.out.println("Enter amount to deposit : ");
                int amount = scanner.nextInt();

                balance += amount;
                msg = "Deposited:"+amount+"|Balance: "+balance;

            } 
            else if (choice== 2) 
            {
                System.out.println("Enter amount to withdraw : ");
                int amount = scanner.nextInt();

                if (amount <=balance) 
                {
                    balance -= amount;
                    msg = "Withdrawn: " +amount +" |Balance: " + balance;
                } else {
                    msg = "Failed Withdrawal: Insufficient balance";
                    System.out.println(msg);
                }

            } 
            else 
            {
                System.out.println("Invalid choice");
                i--;
                continue;
            }

            //transactions record
            if (tx_count<5) 
            {
                miniStatement[tx_count] = msg;
            } 
            else 
            {
                for (int j =0;j<4;j++) 
                {
                    miniStatement[j] =miniStatement[j + 1];
                }
                miniStatement[4]=msg;
            }

            tx_count++;

            if (tx_count == 10) 
            {
                System.out.println("Max transactions reached!");
            }
        }

        // mini statement
        System.out.println("\n_____ Mini Statement (Last 5 Transactions) ---");
        for (String s : miniStatement) 
        {
            if (s != null) {
                System.out.println(s);
            }
        }
        scanner.close();
    }
}