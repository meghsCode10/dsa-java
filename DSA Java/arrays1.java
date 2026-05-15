import java.util.*;

@SuppressWarnings("unused")
public class arrays1 {

    // UPDATION IN ARRAY ELEMENTS
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    // LINEAR SEARCH FOR NUMBERS
    public static int linearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // LINEAR SEARCH FOR STRINGS/ALPHABETS
    public static int linearSearch(String fruits[], String item) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == item) {
                return i;
            }
        }
        return -1;
    }

    // LARGEST NUMBER
    public static int largest_num(int num[]) {
        int max = Integer.MIN_VALUE; // minus infinity
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];

            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The smallest num is : " + min);
        return max;
    }

    // BINARY SEARCH
    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // REVERSE OF AN ARRAY
    public static int Reverse(int numbers[]) {
        int first = 0, last = (numbers.length - 1);
        while (first < last) {
            // SWAP
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        return -1;
    }

    // PAIRS OF AN ARRAY
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Number of total pairs : " + tp);
    }

    // PRINT SUBARRAY
    public static void printSubarray(int numbers[]) {
        int TS = 0;
        int sum = 0;
        int maxSum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    System.out.println();
                    sum += numbers[k];
                    if (maxSum > numbers[k]) {
                        maxSum = numbers[k];
                    }
                }
                TS++;
                System.out.println("total sum = " + sum);
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total Strings:" + TS);
    }

    public static void nullArray() {
        int[] marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }

    public static void searchElement() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int x = 6;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Index of x is:" + i);
            }
        }
    }

    public static void nameArray() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];

        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }

    public static void maxMin() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void asce() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAsending = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isAsending = true;
            } else {
                isAsending = false;
            }
        }

        if (isAsending == true) {
            System.out.println("the array is in asending order");
        } else {
            System.out.println("array is not sorted");
        }

    }

    public static int largestSmallest(int marks[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
            if (marks[i] > max) {
                max = marks[i];
            }

        }
        System.out.println(min); 
        return max;
    }

    public static void main(String[] args) {
        // maxMin();
        // int marks[] = {32,12,43,54};
        // asce();
        // nullArray();
        // searchElement();
        // nameArray();
        // CREATION/INPUT/OUTPUT OF AN ARRAY
        // CREATION
        // int marks[] = new int[100];
        // INPUT OF AN ARRAY
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // OUTPUT OF AN ARRAY
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // int percentage = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println(percentage + "%");
        // System.out.println("Length of marks array : " + marks.length);

        // int marks[] = {98,93,92};
        // UPDATION OF AN ARRAY
        // update(marks);
        // FOR PRINTING SINGLE ELEMENT OF AN ARRAY
        // System.out.println(marks[2]);
        // FOR PRINTING ALL ELEMENTS OF AN ARRAY
        // for(int i=0; i<marks.length; i++){
        // System.out.println(marks[i]);
        // }
        // System.out.println();

        // Linear Search FOR STRINGS ELEMENT
        // int marks[]= {2,4,6,8,10,12,14,16};
        // String fruits[] = {"mango", "orange", "grapes", "strawberry", "banana"};
        // int key = 10;
        // String item = "grapes";

        // int index = linearSearch(marks, key);
        // if(index == -1){
        // System.out.println("item not found");
        // }else{
        // System.out.println("Key is found at: " + index);
        // }

        // for(int i=0; i<marks.length; i++){
        // if(marks[i] == key){
        // System.out.println("item found at index " + i);
        // }
        // }

        // int Newindex = linearSearch(fruits, item);
        // if(Newindex == -1){
        // System.out.println("item not found");
        // }else{
        // System.out.println("Key is found at: " + Newindex);
        // }

        // int num[] = { 1, 2, 6, 3, 5 };
        // LARGEST NUMBER AND SMALLEST NUMBER
        // System.out.println("the largest nmber is " + largest_num(num));

        // BinarySearch
        // int numbers[] = {2,4,6,8,10,12,14};
        // int key = 10;
        // System.out.println("THE key is at index: " + BinarySearch(numbers, key));

        // REVERSE OF AN ARRAY
        // int numbers[] = {2,4,6,8,10};
        // Reverse(numbers);
        // for(int i=0; i<numbers.length; i++){
        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();

        // PAIRS OF ARRAY'S ELEMENT
        // int numbers[] = { 2, 4, 6, 8, 10 };
        // printPairs(numbers);

        // PRINT SUBARRAYS
        // int numbers[] = { 2, 4, 6, 8, 10 };
        // int numbers[] = {1, -2, 6, -1, 3};
        // printSubarray(numbers);
    }
}
