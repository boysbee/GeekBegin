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
    @Test
    public void put_2_should_return_two(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "two";
        String actual = convertor.toWord(2);
        assertEquals(expected, actual);
    }
    @Test
    public void put_3_should_return_three(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "three";
        String actual = convertor.toWord(3);
        assertEquals(expected, actual);
    }
    @Test
    public void put_4_should_return_four(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "four";
        String actual = convertor.toWord(4);
        assertEquals(expected, actual);
    }
    @Test
    public void put_5_should_return_five(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "five";
        String actual = convertor.toWord(5);
        assertEquals(expected, actual);
    }
    @Test
    public void put_6_should_return_six(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "six";
        String actual = convertor.toWord(6);
        assertEquals(expected, actual);
    }
    @Test
    public void put_7_should_return_seven(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "seven";
        String actual = convertor.toWord(7);
        assertEquals(expected, actual);
    }
    @Test
    public void put_8_should_return_eight(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "eight";
        String actual = convertor.toWord(8);
        assertEquals(expected, actual);
    }
    @Test
    public void put_9_should_return_nine(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "nine";
        String actual = convertor.toWord(9);
        assertEquals(expected, actual);
    }
    @Test
    public void put_10_should_return_ten(){
        ConvertArabic convertor = new ConvertArabic();
        String expected = "ten";
        String actual = convertor.toWord(10);
        assertEquals(expected, actual);
    }


}
