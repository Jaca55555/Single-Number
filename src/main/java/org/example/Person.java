package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public int searchInsert(int[] nums, int target) {
        int s = 0, mid, end = nums.length - 1;//6,1
        while (s <= end) {
            mid = (s + end) / 2; //3 /0
            if (nums[mid] == target) {
                return mid;
            } else {
                if (nums[mid] > target) {
                    end = mid - 1; //end=2; /0
                } else s = mid + 1;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Person main=new Person();
        int[] nums={1,9,5,6,7,2,4};//6
        int target=0;
        System.out.println(main.searchInsert(nums,target));


    }
}
