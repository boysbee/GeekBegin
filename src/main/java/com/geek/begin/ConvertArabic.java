package com.geek.begin;

import java.util.HashMap;
import java.util.Map;

/**<><//**<>
 * Created by boysbee on 6/28/15.
 */
public class ConvertArabic {
    public String toWord(int arabic) {
        Map mapNumricWord = new HashMap<Integer,String>();
        mapNumricWord.put(0, "zero");
        mapNumricWord.put(1, "one");
        mapNumricWord.put(2, "two");
        mapNumricWord.put(3, "three");
        mapNumricWord.put(4, "four");
        mapNumricWord.put(5, "five");
        mapNumricWord.put(6, "six");
        mapNumricWord.put(7, "seven");
        mapNumricWord.put(8, "eight");
        mapNumricWord.put(9, "nine");
        mapNumricWord.put(10, "ten");
        return mapNumricWord.get(arabic).toString();
    }
}
