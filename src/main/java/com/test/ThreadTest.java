package com.test;

import java.util.Arrays;

public class ThreadTest {

    public static void main(String... args) {
        int[] i1 = {1, 2, 3, 4};
        int[] i2 = {1, 6 ,5, 2, 3, 4,5};
        int[] fial = new int[i1.length + i2.length];
        int i = 0, j = 0;
        int k = 0;
        for (k = 0; k < fial.length; k++) {
            if ((i < i1.length && j < i2.length)) {
                if (i1[i] > i2[j]) {
                    fial[k] = i2[j];
                    j++;
                } else {
                    fial[k] = i1[i];
                    i++;
                }
            } else {
                break;
            }
        }
        while (i < i1.length || j < i2.length) {
            if (i < i1.length) {
                fial[k] = i1[i];
                i++;
            } else if (j < i2.length) {
                fial[k] = i2[j];
                j++;
            }
            k++;
        }

        System.out.println("New Array ");
        for (k = 0; k < fial.length; k++) {
            System.out.print(fial[k] + " ");
        }
    }
}
