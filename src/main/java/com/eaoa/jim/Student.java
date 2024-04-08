package com.eaoa.jim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

    public List<Integer> ints;

    public String name;
    public Student(String name) {
        this.name = name;
    }
    public void sayName() {
        System.out.println("student's name is "+ name);
    }

    public int[] randomNoSame(int min, int max, int n) {
        if ( n > (max- min +1) || max < min ) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while (count < n) {
            int num = (int) (Math.random() * (max -min)) + min;
            boolean flag = true;
            for (int j =0; j < n; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count ++;
            }
        }
        return result;
    }

    public void genInt() throws InterruptedException {
        this.ints = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            int[] is = this.randomNoSame(100, 200, 10);
            for (int k : is) {
                this.ints.add(k);
                System.out.println(k);
            }
            Thread.sleep(1000);
        }

    }
}
