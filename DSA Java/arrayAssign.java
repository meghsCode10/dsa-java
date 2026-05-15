public class arrayAssign {

    public static boolean duplicate(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int rotateBinary(int nums[], int target){
        int start=0, end=nums.length-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            } 
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target<= nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    start= mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = (prices[i]-buyPrice);
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        // int nums[] = {1, 2,3,1};
        // System.out.println(duplicate(nums));
    //     int nums[] = {3,4,5,6,7,0,1,2};
    //     int target = 0;
    //    System.out.println(rotateBinary(nums, target)); 
     int prices[] = {7,1,5,3,6,4};
     System.out.print(buyAndSellStocks(prices));
    }
}
