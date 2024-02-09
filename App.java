/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromenumberchecker;
import java.util.Scanner;
/**
 *
 * @author Hohm
 */
public class App {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        // Close the Scanner object
        scan.close();
    }
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }
}
