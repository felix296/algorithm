package com.tp.normal;

import java.util.Arrays;

/**
 * Created on 2019/5/29.
 *
 * @author felix.chen
 */
public class LeetCode4 {

    //中位数 排序后取中

    /**
     * There are two sorted arrays nums1 and nums2 of size m and n respectively.
     * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
     * You may assume nums1 and nums2 cannot be both empty.
     * Example 1:
     * nums1 = [1, 3]
     * nums2 = [2]
     * The median is 2.0
     * Example 2:
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     * The median is (2 + 3)/2 = 2.5
     */

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 22, 6};
        int[] nums2 = {2, 5, 7, 8, 9, 10};
        double a = findMedianSortedArrays(nums1, nums2);
        System.out.println(a);
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length,
            n = nums2.length,
            left = (m + n + 1) / 2,
            right = (m + n + 2) / 2;
        return (findKth(nums1, nums2, left) + findKth(nums1, nums2, right)) / 2.0;
    }

    static int findKth(int[] nums1, int[] nums2, int k) {
        int m = nums1.length, n = nums2.length;
        if (m == 0) {
            return nums2[k - 1];
        }
        if (n == 0) {
            return nums1[k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[0], nums2[0]);
        }
        int i = Math.min(m, k / 2), j = Math.min(n, k / 2);
        if (nums1[i - 1] > nums2[j - 1]) {
            return findKth(nums1, Arrays.copyOfRange(nums2, j, n), k - j);
        } else {
            return findKth(Arrays.copyOfRange(nums1, i, m), nums2, k - i);
        }
    }
}
