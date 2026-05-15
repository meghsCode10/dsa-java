package practice;




import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Quesstion 1
        // int NUM = sc.nextInt();
        // if (NUM > 0) {
        // System.out.println("Positive");
        // } else {
        // System.out.println("Negative");
        // }

        // Question 2
        // double temp = 103.5;
        // if (temp > 100) {
        // System.out.println("You have Fever");
        // } else {
        // System.out.println("You don't have fever");
        // }

        // // Question 3
        // int Weekdays = sc.nextInt();
        // switch (Weekdays) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thursday");
        // break;
        // case 6:
        // System.out.println("Friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Error");
        // break;
        // }

        // Question 4
        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println(x);
        // System.out.println(y);

        // Question 5
        int year = sc.nextInt();
        boolean x = (year % 4 == 0);
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
        System.out.println(year + " is a leap year");
        } else {
        System.out.println(year + " is not a leapyear");

        }
        if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("Non Leap year");
        }
    }
}
