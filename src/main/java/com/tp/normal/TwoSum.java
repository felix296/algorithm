package com.tp.normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: felix.chen
 * @Date: 2019/3/26
 * @Description
 */
public class TwoSum {

    /**
     * Given an array of integers, return indices(index的复数) of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static void main(String[] args) {
        Integer[] nums = {11, 15, 2, 7, 66, 77};
        Integer target = 9;
        Integer[] result = new Integer[2];
        // firstMethod(nums,target,result);
        secondMethod(result, nums, target);
    }

    private static void secondMethod(Integer[] result, Integer[] nums, Integer target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //i为索引
            //包含另一个key，则中止，获取另一个Key的索引
            if (map.containsKey(map.get(target - nums[i]))) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        System.out.println(Arrays.toString(result));
    }


    private static void firstMethod(Integer[] nums, Integer target, Integer[] result) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        System.out.println(Arrays.toString(result));
    }
}
