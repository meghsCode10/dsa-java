
// import java.util.Scanner;

public class condition {
    public static void main(String[] args) {

        int age = 16;                              
        if (age >= 18) {
        System.out.println("adult : drive");
        } else if ((age > 13) && (age < 18)) {
        System.out.println("teenager");
        } else {
        System.out.println("child");
        }

        // print two largest no.
        // int a = 12;
        // int b = 23;
        // if (a > b) {
        // System.out.println(a);
        // } else {
        // System.out.println(b);
        // }

        // print no. is even or odd
        // @SuppressWarnings("resource")
        // Scanner a = new Scanner(System.in);
        // int num = a.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("no. is even");
        // } else {
        // System.out.println("no. is odd");
        // }

        // income tax calculator
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000) {
        // tax = 0;
        // } else if ((income >= 500000) && (income < 1000000)) {
        // tax = income * 20 / 100;
        // } else {
        // tax = income * 30 / 100;
        // }
        // System.out.println("your tax is " + tax);

        // largest of three numbers
        // int a = 10;
        // int b = 70;
        // int c = 50;
        // if ((a > b) && (a > c)) {
        // System.out.println(a);
        // } else if ((b > a) && (b > c)) {
        // System.out.println(b);
        // } else {
        // System.out.println(c);
        // }

        // Ternary operator
        // int a = (5 < 2) ? 5 : 2;
        // System.out.println(a);
        // @SuppressWarnings("unused")
        // String input = (500 < 19) ? "even" : "odd";
        // System.out.println(input);
        // int num = 12;
        // String type = ((num % 2 == 0)) ? "even" : "odd";
        // System.out.println(type);

        // student marks
        // int marks = 35;
        // String result = (marks >= 33) ? "pass" : "fail";
        // System.out.println(result);

        // Switch Statements
        // Scanner sc = new Scanner(System.in);
        // int Weekdays = sc.nextInt();
        // switch (Weekdays) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("tuesday");
        // default:
        // System.out.println("no weekday");
        // break;
        // }
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char operator = sc.next().charAt(0);
        // switch (operator) {
        //     case '+':
        //         System.out.println(a + b);
        //         break;
        //     case '-':
        //         System.out.println(a - b);
        //         break;
        //     case '*':
        //         System.out.println(a * b);
        //         break;
        //     default:
        //         System.out.println("Error");
        //         break;
        // }

    }
}
