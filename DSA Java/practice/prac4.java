package practice;

import java.util.Scanner;

public class prac4 {

    

  public static void main(String[]args) {
    @SuppressWarnings("resource")
    Scanner sc= new Scanner(System.in);

    //   Ques-2
    int number;
    // int choice;
    // int evenSum=0;
    // int oddSum=0;
    // do{
    //     System.out.print("Enter the number ");
    //     number=sc.nextInt();
    //     if(number%2==0) {
    //         evenSum+=number;
    //     }else{
    //         oddSum+=number;
    //     }
        
    //     System.out.print("Do you want to continue ? Press1 for yes or 0 for no");
    //     choice=sc.nextInt();
    // }
    // while(choice==1);
    // System.out.println("Sum of even numbers: "+evenSum);
    // System.out.println("Sum of odd numbers: "+oddSum);

    // Ques-3

    System.out.print("Enter the value of number: ");
    number = sc.nextInt();
    // int fact =1;

    // for(int i = 1; i <= number; i++){
    //     fact = fact * i;
    // }
    // System.out.print(fact);

    // Ques-4

    for(int i=1; i<=10;i++){
        int table = number * i;
        System.out.println(table);
    }
}
}
