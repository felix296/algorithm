package com.tp.top100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenfeifei8090@100.me
 * @program timo
 * @date 2020-10-20 10:25
 * @desc
 **/
public class Top1 {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     */

    /**
     * 时间复杂度：O(N^2)，其中 N 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
     * 空间复杂度：O(1)。
     */
    static int[] twoSumByTraversal(int[] num, int target) {
        assert num.length > 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }

    static int[] twoSumByMap(int[] nums, int target) {
        assert nums.length > 1;
        Map<Integer, Integer> sumMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (sumMap.containsKey(target - nums[i])) {
                return new int[]{sumMap.get(target - nums[i]), i};
            }
            //下标小的值最先put进去
            sumMap.put(nums[i], i);
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15, 11};
        int target = 18;
        System.out.println(Arrays.toString(twoSumByMap(nums, target)));
    }


}
