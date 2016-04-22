package com.erin;

/**
 * @author Peter on 2016-04-22.
 */
public class ChapterOne {

    /***
     * 1.1 Implement an algorithm to determine if a string has all unique characters.
     * <p>
     * What if you cannot use additional data structure?
     */
    public boolean isUniqueCharacter(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i);

            if (char_set[val]) return false;
            else char_set[val] = true;
        }
        return true;
    }
}
