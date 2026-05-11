//1. Minimum and Maximum element in the array



package com.citiustech;

public class MinumumAndMaximum {
      public static void main(String[] args) {
            int[] arr= {20,01,02,10,40,35,75,35};
            int minimum = arr[0];
            int maximum = arr[0];
            
            for(int i =-0;i<arr.length;i++)
            {
                  for (int j=i+1;j<arr.length;j++)
                  {
                        if (arr[j] < minimum)
                        {
                              minimum= arr[j];
                        }
                        else if(arr[j] > maximum)
                        {
                              maximum = arr[j];
                        }
                  }
                  

            }
            System.out.println("Minimum : "+minimum);
            System.out.println("maximum : "+maximum);
      }

}
