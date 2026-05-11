3.toggle each character in the string




package com.citiustech;
import java.util.Scanner;
//toggle each character in a string
//upper case to lower and lower case to upper
public class ToggleCharacter {
      public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Enter the string which u want to toggle : ");
            String s= scanner.nextLine();
            String toggled="";
            
            for(int i =0;i<s.length();i++)
            {
                  char ch = s.charAt(i);
                  if (Character.isUpperCase(ch))
                  {
                        toggled=toggled+Character.toLowerCase(ch);                        
                  }
                  else if( Character.isLowerCase(ch))
                  {
                        toggled=toggled+Character.toUpperCase(ch);
                  }
                  else if (Character.isSpace(ch))
                  {
                        toggled=toggled+" ";
                  }
            }     
            System.out.println("Toggled string is : "+toggled);
      }

}
