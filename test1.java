<<<<<<< HEAD
import java.util.Scanner;
public class Dec2Hex {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please provide a decimal number as a command-line argument.");
            return;
        }
        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid decimal number.");
          return;
        }
        if (num < 0) {
            System.out.println("Please provide a non-negative decimal number.");
            return;
        }
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        while (num != 0) {
            rem = num % 16;
           hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        System.out.println("Hexadecimal representation is: " + (hexadecimal.isEmpty() ? "0" : hexadecimal));
    }
=======


// Java Program to find the if the arrays are equal 
  
import java.util.Arrays; 
  
public class CheckArraysEqual { 
    public static void main(String[] args) 
    { 
        // Initializing the first array 
        int a[] = { 30, 25, 40 }; 
  
        // Initializing the second array 
        int b[] = { 30, 25, 40 }; 
  
        // store the result 
        // Arrays.equals(a, b) function is used to check 
        // whether two arrays are equal or not 
        boolean result = Arrays.equals(a, b); 
  
        // condition to check whether the 
        // result is true or false 
        if (result == true) { 
            // Print the result 
            System.out.println("Two arrays are equal"); 
        } 
        else { 
            // Print the result 
            System.out.println("Two arrays are not equal"); 
        } 
    } 
>>>>>>> 24602f7 (add test1.java)
}
