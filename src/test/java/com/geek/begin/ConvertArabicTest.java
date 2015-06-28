package com.geek.begin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boysbee on 6/28/15.
 */
public class ConvertArabicTest {

    ConvertArabic convertor;

    @Before
    public void setup(){
        convertor = new ConvertArabic();
    }


    @Test
    public void put_1_should_return_one(){
        String expected = "one";
        String actual = convertor.toWord(1);
        assertEquals(expected, actual);
    }
    @Test
    public void put_2_should_return_two(){
        String expected = "two";
        String actual = convertor.toWord(2);
        assertEquals(expected, actual);
    }
    @Test
    public void put_3_should_return_three(){
        String expected = "three";
        String actual = convertor.toWord(3);
        assertEquals(expected, actual);
    }
    @Test
    public void put_4_should_return_four(){
        String expected = "four";
        String actual = convertor.toWord(4);
        assertEquals(expected, actual);
    }
    @Test
    public void put_5_should_return_five(){
        String expected = "five";
        String actual = convertor.toWord(5);
        assertEquals(expected, actual);
    }
    @Test
    public void put_6_should_return_six(){
        String expected = "six";
        String actual = convertor.toWord(6);
        assertEquals(expected, actual);
    }
    @Test
    public void put_7_should_return_seven(){
        String expected = "seven";
        String actual = convertor.toWord(7);
        assertEquals(expected, actual);
    }
    @Test
    public void put_8_should_return_eight(){
        String expected = "eight";
        String actual = convertor.toWord(8);
        assertEquals(expected, actual);
    }
    @Test
    public void put_9_should_return_nine(){
        String expected = "nine";
        String actual = convertor.toWord(9);
        assertEquals(expected, actual);
    }
    @Test
    public void put_10_should_return_ten(){
        String expected = "ten";
        String actual = convertor.toWord(10);
        assertEquals(expected, actual);
    }
    @Test
    public void put_0_should_return_zero(){
        String expected = "zero";
        String actual = convertor.toWord(0);
        assertEquals(expected, actual);
    }


}
