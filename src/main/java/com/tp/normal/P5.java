package com.tp.normal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author chenfeifei8090@100.me
 * @program algorithm
 * @date 2020-11-04 11:30
 * @desc
 **/
public class P5 {

    public static void main(String[] args) {

    }

    static class StacksToQueue {

        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public void addToTail(int x) {
            stack1.push(x);
        }

        public int deleteHead() {
            if (pSize() != 0) {
                if (stack2.isEmpty()) {
                    stack1ToStack2();
                }
                return stack2.pop();
            } else {
                System.out.println("队列为空");
                return -1;
            }
        }

        void stack1ToStack2() {
            stack1.forEach(e -> stack2.push(e));
        }

        int pSize() {
            return stack1.size() + stack2.size();
        }

    }


}
