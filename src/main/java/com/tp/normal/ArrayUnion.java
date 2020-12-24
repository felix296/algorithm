package com.tp.normal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: felix.chen
 * @Date: 2019/4/24
 * @Description
 */
public class ArrayUnion {

    //数组并集交集
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4, 9, 2, 7};
        int[] c = {3, 4, 5, 6};
        Set<Integer> set = new HashSet<>();
        for (int anA : a) {
            for (int aB : b) {
                if (anA == aB) {
                    set.add(anA);
                }
            }
        }
        for (int cc : c) {
            set.add(cc);
        }
        int[] ab = new int[set.size()];
        int index = 0;
        for (Integer aSet : set) {
            ab[index] = aSet;
            index++;
        }
        System.out.println(Arrays.toString(ab));
    }

}
