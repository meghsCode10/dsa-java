package practice;

import java.util.Scanner;

public class prac5 {
    

    public static int avg(int a, int b, int c) {
        
        int sum = a+b+c;
        int average = sum/3;        
        return average;
    }

    public static boolean isEven(int n) {
            if(n%2==0){
                return true;
            }
        return false; 
    }
    
    public static boolean isPalindrome(int n) {
        int num = n;
        int rev=0;
        while (num!=0) {
            int lastdigit = num%10;
            rev = (rev * 10) +lastdigit;
            num=num/10;
        }
        if(n == rev){
            return true;
        }
        return false;
    }



    public static int sumDigits(int n) {
        int sumOfDigits=0;
        while(n>0) {
            int lastDigit=n%10;
            sumOfDigits+=lastDigit;
            n/=10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        // System.out.print(avg(5, 5, 5));
        // System.out.println(isEven(44));
        // System.out.println("Please Enter a number :");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)) {
            System.out.println("Number : "+ num +" is a palindrome");
        }else
        {
        System.out.println("Number : "+ num +" is not a palindrome");}



        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input an integer: ");
        // int digits = sc.nextInt();
        // System.out.println("The sum is "+sumDigits(digits));
    }


}

