public class arrays2 {

    public static void maxSubarray(int nums[]) {
        // Brute force approach --- Time complexity= O(n^3)
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                    System.out.print(nums[k] + " ");
                }
                System.out.println("The current sum is : " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("the max sum is: " + maxSum);
    }

    public static void NewmaxSubarray(int nums[]) {
        // PREFIX ARRAY APPROACH --- Time complexity= O(n)
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        // CALCULATE PREFIX ARRAY
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                // for (int k = i; k <= j; k++) {
                // currSum += nums[k];
                // System.out.print(nums[k] + " ");
                // }
                System.out.println("The current sum is : " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("the max sum is: " + maxSum);
    }

    // KADANE'S ALGORIHIM
    public static void kadaneMaxSubarray(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.print("Max sum is: " + maxSum);
    }

    //TRAPPING RAIN WATER
    public static int TrappingRainwater(int height[]){
        int n = height.length;
        //CALCULATE LEFT MAX BOUNDARY - ARRAY
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //CALCULATE RIGHT MAX BOUNDARY - ARRAY
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //LOOP
        for(int i=0; i<n; i++){
            //WATER LEVEL = MIN(LEFTMAX BOUND, RIGHTMAX BOUND)
            int waterLevel =  Math.min(leftMax[i], rightMax[i]);
               //TRAPPED WATER = WATER LEVEL - HEIGHT[I] OF BUILDING/BAR
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }

    //BUY AND SELLING STOCK
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = (prices[i] - buyPrice);
                maxProfit = Math.max(maxProfit, profit); 
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int nums[] = { 1, -2, 6, -1, 3 };
        // int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int nums[] = {-2, -3, -1, -2};
        // int height[] = {4,2,0,6,3,2,5};
        int prices[] = {7,1,5,3,6,4};


        // maxSubarray(nums);
        // NewmaxSubarray(nums);
        // kadaneMaxSubarray(nums);
        // System.out.println(TrappingRainwater(height));
        System.out.println(buyAndSellStocks(prices));
    }
}
