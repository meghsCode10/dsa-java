

// import java.util.Scanner;

public class function {

    // public static int hello() {
    // System.out.println("hello");
    // System.out.println("hello");
    // System.out.println("hello");
    // return 0;
    // }

    // Sum
    // public static int calSum(int a, int b) { // PARAMETERS OR FORMAL PARAMETERS
    //     int sum = a + b;
    //     return sum;

    // }

    // SWAP
    // public static void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a =" + a);
    //     System.out.println("b = " + b);
    // }

    // public static void changeA(int a) {
    //     a = 10;
    // }

    // MULTIPLY
    // public static int multiply(int a, int b) {
    //     int mul = a * b;
    //     return mul;
    // }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // public static int bincoeff(int n, int r) {
    //     int a = factorial(n);
    //     int b = factorial(r);
    //     int c = factorial(n - r);

    //     int bincoeffi = a / (b * c);
    //     return bincoeffi;
    // }

    // SUM OF TWO NO.
    // public static int sum(int a, int b) {
    // return a+b;
    // }

    // SUM OF THREE NO.
    // public static int sum(int a, int b, int c) {
    // return a+b+c;
    // }

    // SUM OF TWO INT NO.
    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // public static float sum(float a, float b) {
    //     return a + b;
    // }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // public static void primeinRange(int n) {
    //     for (int i = 2; i <= n; i++) {
    //         if (isPrime(i)) {
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    // }

    // BINARY TO DECIMAL
    // public static void bintodec(int n) {
    //     int myNum = n;
    //     int pow = 0;
    //     int dec = 0;
    //     while (n > 0) {
    //         int lastdigit = n % 10;
    //         dec = dec + (lastdigit * (int) Math.pow(2, pow));
    //         pow++;
    //         n = n / 10;

    //     }
    //     System.out.println("Decimal of " + myNum + " is " + dec);
    // }

    public static void dectobin(int n){
        
        @SuppressWarnings("unused")
        int Mynum = n;
        while(n>0){
            int bin=0;
            int pow = 0;
            int rem = n%2;
            bin = bin+(rem * (int)Math.pow(10, pow));
            pow++;
            n=n/2;
            System.out.print(rem);
        }
        
    } 

    public static void main(String[] args) {
        // {
            // bintodec(1001);
            // @SuppressWarnings("resource")
            // Scanner sc = new Scanner(System.in);
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int sum= calSum(a,b); //ARGUMENTS
            // System.out.println("Sum is " + sum);

            // SWAP - VALUE CHANGES
            // int a = 5;
            // int b = 10;
            // // swap
            // swap(a, b);

            // int a = 5;
            // changeA(a);
            // System.out.println(a);

            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int prod = multiply(a, b);
            // System.out.println(prod);
            // int fact = factorial(n);
            // System.out.println(fact);

            // System.out.println(bincoeff(5, 2));

            // System.out.println(sum(2, 3));
            // System.out.println(sum(2.5f, 2.2f));
        //    System.out.println(isPrime(8));
            // primeinRange(20);
        // }
       dectobin(5);
    }
}
