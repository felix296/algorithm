package com.tp.normal;

/**
 * @author: felix.chen
 * @Date: 2019/2/13
 * @Description
 */
public class Reverse {

    public static void main(String[] args) {
        reverseString();
    }

    /**
     * 倒序输出数组
     */
    private static void reverseNumber() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - i - 1]);
        }
    }

    /**
     * 倒序输出字符串
     */
    private static void reverseString() {
        String a = "abcdefghij";
        String backStr = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            backStr += a.charAt(i);
        }
        System.out.println(backStr);
    }


}
