
3. Frequency count of each element





package com.citiustech;

import java.util.Scanner;

public class FrequencyCount {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String s = scanner.nextLine();
            
            
            for(int i = 0;i<s.length()-1;i++)
            {
                  int count=1;
                  for (int j=i+1;j<s.length();j++)
                  {
                        if(s.charAt(i) == s.charAt(j))
                                    {
                                          count+=1;                           
                                    }
                  }
                  System.out.println("The character " +s.charAt(i) +" is repeating " +count+" "+ "times");
            }
            scanner.close();
      }
}
