package com.yiteng.search;

public class A02_InsertSearchDemo3 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int index = binarySearch(arr,9);
        System.out.println(index);

    }
    private static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (((target - nums[low])/(nums[high] - nums[low]))*(high - low)) + low;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                low = mid + 1;
            }else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
