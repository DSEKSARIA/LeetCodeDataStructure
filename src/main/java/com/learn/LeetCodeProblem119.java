package com.learn;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeProblem119 {
    public static void main(String[] args) {
        LeetCodeProblem119 l118 = new LeetCodeProblem119();
        System.out.println(l118.getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        ArrayList<Integer> r1 = new ArrayList<>();
        r1.add(1);
        ArrayList<Integer> r2 = new ArrayList<>();
        r2.add(1);
        r2.add(1);
        if (rowIndex == 0) {
            return null;
        } else if (rowIndex == 1) {
            return r1;
        } else if (rowIndex == 2) {
            return r2;
        } else {
            List<List<Integer>> finalList = new ArrayList<>();
            finalList.add(r1);
            finalList.add(r2);

            for (int i = 2; i < rowIndex; i++) {
                ArrayList<Integer> rows = new ArrayList<>();
                rows.add(1);
                for (int j = 1; j < i; j++) {
                    rows.add(finalList.get(i - 1).get(j) + finalList.get(i - 1).get(j - 1));
                }
                rows.add(1);
                finalList.add(rows);
            }
            return finalList.get(rowIndex-1);

        }
    }
}
