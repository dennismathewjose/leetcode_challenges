package DSA;
/*
852. Peak Index in a Mountain Array
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

Example 1:

Input: arr = [0,1,0]
Output: 1

Example 2:

Input: arr = [0,2,1,0]
Output: 1
 */
public class peakIndex {
    public static void main(String[] args){
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0; int end = arr.length-1;
       // int mid = (start + end) / 2;
        while (start != end){
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid+1])
                end = mid;
            else if (arr[mid] < arr[mid+ 1])
                start = mid + 1;
        }
        return start;
    }
}
