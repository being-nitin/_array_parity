package com.nitincodes;

public class Main {

    public static void main(String[] nums) {
	// write your code here
        int first = 0;
        int i = 0;
        int last = nums.length-1;
        int temp = 0;
        while(i<=last){
            if(nums[i]==0){
                temp = nums[i];
                nums[i] = nums[first];
                nums[first] = temp;
                first++;
                i++;
            }
            else if(nums[i]%2==0){
                i++;
            }
            else{
                temp = nums[i];
                nums[i] = nums[last];
                nums[last]=temp;
                last--;
            }
        }
        return nums;
    }
}
