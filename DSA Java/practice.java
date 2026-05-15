import java.util.Scanner;

public class practice {

    public static int printHello() {
        System.out.println("Hello");
        return 3;
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            sum += lastDigit;

        }
        return sum;

    }

    public static int binomialCoefficient(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int bincoeff = a / (b * c);
        return bincoeff;
    }

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

    public static void primeInRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i + "");
                ;
            }
        }
        System.out.println();
    }

    public static void fibonica(int n) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + "");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

    }

    public static void decimalToBinary(int n) {
        int ans = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            ans = ans + rem * (int) (Math.pow(10, pow));
            pow++;
            n /= 2;

        }
        System.out.print(ans);
    }

    public static void binaryToDecimal(int n) {
        int ans = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans + rem * (int) (Math.pow(2, pow));
            pow++;
            n /= 10;

        }
        System.out.print(ans);
    }

    public static void invertedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void floyd2(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void triPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterFly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dimaond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            char letter = 'A';
            letter += i;
            for (int j = 0; j <= i; j++) {
                System.out.print(letter);
                letter--;
            }

            System.out.println();
        }
    }

    public static void patter1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void invTri(int n) {

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            ch += i;
            for (int j = n; j >= (n - i); j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void pyrPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            // spaces
            if (i != 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            // spaces
            if (i != 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triPyrPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    // ARRAY

    public static int linearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void largest(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    public static void smallest(int nums[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
    }

    public static int binarySearch(int nums[], int key){
        int start=0; int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==key){
                return mid;
            }else if(nums[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }


    public static int reverse(int nums[]){
        int start = 0, end=nums.length-1;
        while(start<=end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start]  = temp;
            start++;
            end--;
        }
        return -1;
    }


    public static int pairs(int nums[]){
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            for(int j=i+1; j<nums.length; j++){
                System.out.print("(" + curr + "," + nums[j] + ")");
            }
            System.out.println();
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 28, 12, 60, 32 };
        // largest(nums);
        // smallest(nums);
        // int key = 12;
        // int index = binarySearch(nums, key);
        // System.out.println("index of key: " + index);
        // reverse(nums);
        // for(int i=0; i<nums.length; i++){
        //  System.out.print(nums[i] + " ");
        // }

        pairs(nums);

        // int marks[] = {45,10,29,87,49};
        // int key = 10;
        // int index = linearSearch(marks, key);
        // if(index==-1){
        // System.out.print("key is not found");
        // }else{
        // System.out.print("key is fount at: " + index);
        // }

    }

    // public static void main(String[] args) {
    // pyrPattern(4);
    // hollowDiamond(4);
    // triPyrPattern(5);
    // floyd2(4);
    // invTri(4);
    // patter1(4);
    // square(3);
    // pattern(4);
    // dimaond(4);
    // hollowRhombus(5);
    // solidRhombus(5);
    // butterFly(4);
    // triPyramid(5);
    // floyd(5);
    // invHalfPyramid(5);
    // invertedPyramid(4);
    // binaryToDecimal(100);

    // decimalToBinary(8);
    // fibonica(4);

    // primeInRange(10);

    // System.out.println(isPrime(12));

    // System.out.println(binomialCoefficient(4, 5));

    // System.out.println(sumOfDigit(325));

    // System.out.println(factorial(5));

    // System.out.println(sum(5));

    // System.out.println(min(9, 4));

    // int value = printHello();
    // System.out.println("value is: " + value);

    // find chaaracter lowercase or uppercase

    // Scanner sc = new Scanner(System.in);
    // char ch = sc.next().charAt(0);
    // if( ch>=65 && ch<=90){
    // System.out.println("character is uppercase");
    // }else {
    // System.out.println("character is lowercase");
    // }

    // int n=-45;
    // String calc = (n>=0) ? "positive" : "negative";
    // System.out.println(calc);

    // int n = 5, sum=0, i=1;
    // while(i<=n){
    // if(i%2 ==0){
    // sum += i;

    // }
    // i++;
    // }
    // System.out.println(sum);

    // int n=5;
    // boolean isPrime = true;
    // for(int i=2; i<n; i++){
    // if(n%i==0){
    // isPrime = false;
    // }
    // }
    // if(isPrime == true){
    // System.out.println("no. is prime");
    // }else{
    // System.out.println("no. is not prime");
    // }

    // int n = 10, sum=0;
    // for(int i=1; i<=n; i++){
    // if(i%3==0){
    // sum += i;
    // }
    // }
    // System.out.println(sum);

    // int fact =1, n=6;
    // for(int i=1; i<=n; i++){
    // fact *= i;
    // }
    // System.out.println(fact);

    // System.out.print("Enter the value of n:");
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // for(int i=1; i<=n; i++){
    // for(int j=1; j<=n; j++){
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    // }

}
