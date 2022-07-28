package DSA;
import java.util.Scanner;
/*
Given an array nums of integers, return how many of them contain an even number of digits.

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.

Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
 */
public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(digits(725));
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums)
            if (even(num))
                count++;
        return count;
    }

    static boolean even(int num){
        int digitsno = digits(num);

        return digitsno % 2 == 0;
    }
    static int digits(int num){
        int count = 0;
        if (num<0)
            num = num * -1;
        if (num == 0)
            return 1;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
