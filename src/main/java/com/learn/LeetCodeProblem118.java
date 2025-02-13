package com.learn;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeProblem118 {
    public static void main(String[] args) {
        LeetCodeProblem118 l118 = new LeetCodeProblem118();
        System.out.println(l118.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        ArrayList<Integer> r1 = new ArrayList<>();
        r1.add(1);
        ArrayList<Integer> r2 = new ArrayList<>();
        r2.add(1);
        r2.add(1);
        if (numRows == 1) {
            finalList.add(r1);
            return finalList;
        } else if (numRows == 2) {
            finalList.add(r1);
            finalList.add(r2);
            return finalList;
        } else {
            finalList.add(r1);
            finalList.add(r2);

            for (int i = 2; i < numRows; i++) {
                ArrayList<Integer> rows = new ArrayList<>();
                rows.add(1);
                for (int j = 1; j < i; j++) {
                    rows.add(finalList.get(i - 1).get(j) + finalList.get(i - 1).get(j - 1));
                }
                rows.add(1);
                finalList.add(rows);
            }
            return finalList;

        }
    }
}
