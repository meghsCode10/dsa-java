public class Loops{
    public static void main(String[] args) {
        // WHILE LOOP
        int counter = 1;
        while (counter < 100) {
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("printed hello world 100times");

        // PRINT NO. 1 TO 10
        // while (counter <= 10) {
        // System.out.print(counter + " ");
        // counter++;
        // }

        // PRINT NO. 1 TO N
        // int n = 7;
        // int counter = 1;
        // while (counter <= n) {
        // System.out.println(counter + " ");
        // counter++;
        // }

        // SUM OF FIRST N NATURAL NO.
        // int n = 5;
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println(sum);

        // Print Square Pattern
        // int n = 4;
        // int i = 1;
        // while (i <= n) {
        // System.out.println("****");
        // i++;
        // }

        // FOR LOOP
        // for (int i = 1; i <= n; i++) {
        // System.out.println("****");
        // }

        // PRINT REVERSE OF NUMBER
        // int n = 445566;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n = n / 10;
        // }
        // System.out.println();

        // REVERSE NO.
        // int n = 10899;
        // int rev = 0;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // n = n / 10;
        // }
        // System.out.println(rev);

        // DO-WHILE LOOP
        // int n = 10;
        // int counter = 1;
        // do {
        // System.out.println(counter);
        // counter++;
        // } while (counter <= n);

        // int i = 1;
        // do{
        // System.out.println("hello World");
        // i++;
        // }while(i<=10);

        // BREAK STATEMENT
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("I am out of loop");

        // @SuppressWarnings("resource")
        // Scanner sc = new Scanner(System.in);
        // do {
        // int num = sc.nextInt();
        // if (num % 10 == 0) {
        // break;
        // }
        // System.out.println(num);
        // } while (true);

        // CONTINUE STATEMENT
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }
        // do {
        // System.out.println("Enter your number");
        // int num = sc.nextInt();
        // if (num % 10 == 0) {
        // continue;
        // }
        // System.out.println(num);
        // } while (true);

        // NO. IS PRIME OR NOT
        // Scanner sc = new Scanner(System.in);
        // int Num = sc.nextInt();
        // boolean ISPRIME = true;
        // for (int i = 2; i < Num; i++) {
        // if (Num % i == 0) {
        // ISPRIME = false;
        // }
        // }
        // if (ISPRIME == true) {
        // System.out.println("NO. IS PRIME");
        // } else {
        // System.out.println("NO. IS NOT PRIME");
        // }

    }
}
