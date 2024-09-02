/*Minimum Window Substring
Write a Java function to find the minimum window in a string S which contains all characters from another string T.Sample Input:S = "ADOBECODEBANC", T = "ABC"      Sample Output:"BANC"

*/
package com.chaninsys.SkillMatrics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubString {

    public static String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }
                Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }
        
        int requiredCount = t.length(); // Number of unique characters in T to match
        int left = 0, right = 0; // Pointers for the sliding window
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        
        int formed = 0;
        Map<Character, Integer> windowMap = new HashMap<>();
        
        while (right < s.length()) {
            char c = s.charAt(right);
            
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            
            if (targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }
            
            while (left <= right && formed == requiredCount) {
                int currentLen = right - left + 1;
                
                if (currentLen < minLen) {
                    minLen = currentLen;
                    minStart = left;
                }
                
                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                
                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar).intValue() < targetMap.get(leftChar).intValue()) {
                    formed--;
                }
                
                left++;
            }
            
            right++;
        }
        
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        
        return s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter string T: ");
        String t = scanner.nextLine();
        
        String result = minWindow(s, t);
        System.out.println("Minimum window substring: " + result);
    }
}


	 
	 
	 


