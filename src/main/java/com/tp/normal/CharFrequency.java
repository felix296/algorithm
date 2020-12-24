package com.tp.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: felix.chen
 * @Date: 2019/4/24
 * @Description
 */
public class CharFrequency {

    /**
     * 打印频率最高的字母；
     * 频率由高到低排序；
     */
    public static void main(String[] args) {
        String longStr = "ioriorioriorioraaaaaaaab";
        Map<Character, Integer> map = new HashMap<>(16);
        Integer one = 1;
        for (int i = 0; i < longStr.length(); i++) {
            Character code = longStr.charAt(i);
            if (null == map.get(code)) {
                map.put(code, one);
            } else {
                map.put(code, map.get(code) + one);
            }
        }
        sortMap(map);
        map.forEach((key, value) -> {
            System.out.println(String.format("key:%s，value:%s", key, value));
        });
    }

    private static void sortMap(Map<Character, Integer> map) {
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                /*如果指定的数与参数相等返回0。
                如果指定的数小于参数返回 -1。
                如果指定的数大于参数返回 1。*/
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("出现次数最多的字符" + list.get(0).getKey() + "==次数为" + list.get(0).getValue());
    }
}
