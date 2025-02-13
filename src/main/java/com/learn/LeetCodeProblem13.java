package com.learn;

import java.util.HashMap;

public class LeetCodeProblem13 {
    public static void main(String[] args) {
        String s = "III";
        String s1 = "LVIII";
        String s2 = "MCMXCIV";
        LeetCodeProblem13 lt13 = new LeetCodeProblem13();
        System.out.println(lt13.romanToInt(s));
        System.out.println(lt13.romanToInt(s1));
        System.out.println(lt13.romanToInt(s2));
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanSymbol = new HashMap<>();
        romanSymbol.put('I', 1);
        romanSymbol.put('V', 5);
        romanSymbol.put('X', 10);
        romanSymbol.put('L', 50);
        romanSymbol.put('C', 100);
        romanSymbol.put('D', 500);
        romanSymbol.put('M', 1000);
        char[] charArray = s.toCharArray();
        int finalValue = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (i + 1 < charArray.length && (charArray[i] == 'I') && (charArray[i + 1] == 'V' || charArray[i + 1] == 'X')) {
                finalValue = finalValue + (romanSymbol.get(charArray[i + 1]) - romanSymbol.get(charArray[i]));
                i++;

            } else if (i + 1 < charArray.length && (charArray[i] == 'X') && (charArray[i + 1] == 'L' || charArray[i + 1] == 'C')) {
                finalValue = finalValue + (romanSymbol.get(charArray[i + 1]) - romanSymbol.get(charArray[i]));
                i++;

            } else if (i + 1 < charArray.length && (charArray[i] == 'C') && (charArray[i + 1] == 'D' || charArray[i + 1] == 'M')) {
                finalValue = finalValue + (romanSymbol.get(charArray[i + 1]) - romanSymbol.get(charArray[i]));
                i++;

            } else {
                finalValue = finalValue + romanSymbol.get(charArray[i]);
            }
        }

        return finalValue;
    }
}
