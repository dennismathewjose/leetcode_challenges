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
public class Firstandlastposition {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7,7,7,10};
        System.out.println(Arrays.toString(searchRange(nums,6)));

    }

    static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = startindex(nums, target);
        arr[1] = endindex(nums, target);
        return arr;
    }
    static int startindex(int[] arr, int target){
        int start = 0; int end = arr.length-1;
        int s_ind = -1; int temp = 0;
        while (start<=end){
            int mid = (start + end)/2;
            if (target == arr[mid]) {
                temp = mid;
                if (s_ind > temp || s_ind == -1)
                    s_ind = temp;
            }
            if (target > arr[mid])
                start = mid + 1;
            else end = mid - 1;
            }
        return s_ind;
    }

    static int endindex(int[] arr, int target){
        int start = 0; int end = arr.length-1;
        int l_ind = -1; int temp = 0;
        while (start<=end){
            int mid = (start + end)/2;
            if (target == arr[mid]) {
                temp = mid;
                if (l_ind < temp || l_ind == -1)
                    l_ind = temp;
            }
            if (target >= arr[mid])
                start = mid + 1;
            else end = mid - 1;
        }
        return l_ind;
    }
}

