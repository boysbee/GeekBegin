package com.geek.begin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boysbee on 6/28/15.
 */
public class ConvertArabicTest {
    @Test
    public void put_1_should_return_one(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "one";
        String actual = convertor.toWord(1);
        assertEquals(expected, actual);
    }
}
