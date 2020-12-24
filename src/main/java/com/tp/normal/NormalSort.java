package com.tp.normal;

public class NormalSort {


    public static void main(String[] args) {

        dichotomySearch();


    }

    /**
     * 二分法前提：数据需是有序不重复的
     * QUES:查找对应元素的下标
     */
    private static void dichotomySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 999, 111};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] < target) {
                start = middle;
            } else if (arr[middle] > target) {
                end = middle;
            } else {
                System.out.println(middle);
                break;
            }
        }
    }

    /**
     * 冒泡排序
     */
    private static void bubbleSort() {

    }
}
