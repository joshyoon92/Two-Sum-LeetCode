package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i=0; i<map.size(); i++){
            int diff = target -nums[i];
            if (map.containsKey(diff) && map.get(diff)!=i){
                return new int[] {map.get(diff), i};
            }
        }
        return new int[]{};
    }
}
