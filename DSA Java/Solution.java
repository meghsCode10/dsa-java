public class Solution {
    public static void twoSum(int nums[], int target) {
     
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length;j++){
                int result = nums[i] + nums[j];
                if( result == target){
                    System.out.print("(" + i + "," + j + ")");
                } 
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int nums[] = {2,7,11,15};
        int target = 18;
        twoSum(nums, target);
    }
} 
