//2. count the number of pairs with given sum k




package com.citiustech;

import java.util.Scanner;

public class PairCount {
      public static void main(String[] args) {
            int [] arr= {3,4,6,5,8,4,9};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the target value : ");
            int k = scanner.nextInt(); //9
            int pairs=0;
            for(int i =0;i<arr.length-1;i++)
            {
                  for(int j =i+1;j<arr.length;j++)
                  {
                        if(arr[i]+arr[j]==k)
                        {
                              pairs+=1;
                        }
                  }     
                  }     
            System.out.println("No of pairs : " +pairs);
            scanner.close();
      }
}

