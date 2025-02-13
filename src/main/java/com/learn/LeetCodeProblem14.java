package com.learn;

public class LeetCodeProblem14 {
    public static void main(String[] args) {
        LeetCodeProblem14 l14 = new LeetCodeProblem14();
        //String[] str = new String[]{"flower", "flow", "flight"};
        String[] str = new String[]{"a"};
        System.out.println(l14.longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        String test = "";
        if (strs.length > 0) {
            for (int i = 0; i < strs[0].length(); i++) {
                if (strs[0].length() > 0) {
                    test = strs[0].substring(0, i + 1);
                    boolean flag = true;
                    for (String str : strs) {
                        if (!str.startsWith(test)) {
                            flag = false;
                            break;
                        }

                    }
                    if (!flag) {
                        test = test.substring(0, test.length() - 1);
                        break;
                    }
                }
            }
        }
        return test;
    }
}
