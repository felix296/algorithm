package com.tp.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2019/5/29.
 *
 * @author felix.chen
 */
public class LeetCode3 {


    /**
     * [LeetCode] Longest Substring Without Repeating Characters 最长无重复字符的子串
     * Given a string, find the length of the longest substring without repeating characters.
     * Example 1:
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public static void main(String[] args) {
        String aa = "aaaabbbbvvvvsssaaww";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < aa.length(); i++) {
            Character ch = aa.charAt(i);
            set.add(ch);
        }
        System.out.println(set.size());

    }


}
