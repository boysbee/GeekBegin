package com.geek.begin;

/**
 * Created by boysbee on 6/28/15.
 */
public class ConvertArabic {
    public String toWord(int arabic) {
        String result = null;

        switch (arabic) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            default:
                result = null;
        }



        return result;
    }
}
