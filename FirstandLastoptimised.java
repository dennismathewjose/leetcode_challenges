package DSA;
/*
34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

 */
import java.util.Arrays;
public class FirstandLastoptimised {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static int[] searchRange(int[] nums, int target){

        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);

        return ans;
    }

    static int search(int[] arr, int tar, boolean findNextInd){
        int start = 0; int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = (start + end)/2;

            if (tar > arr[mid])
                start = mid + 1;
            else if(tar < arr[mid])
                end = mid - 1;
            else {
                ans = mid;
                if(findNextInd)
                    end = mid-1;
                else
                    start = start+1;
            }
        }
        return ans;
    }
}
