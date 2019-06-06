//Create an array of 15 random integers from the segment [0;   9]. Display the array on the screen.
// Count how many in the array of even elements and display this number on the screen on a separate line.

import java.util.Arrays;
public class Task4 {
    public static void main(String[] args)
       {
        int[] nums = {5, 7, 2, 4, 9, 1, 2, 7, 8, 4, 5, 4, 6, 8, 9};
        int ctr_even = 0;
        System.out.println("Original Array: "+Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
            {
                ctr_even++;
            }
                   }
        System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
        System.out.printf("\n");
    }
}