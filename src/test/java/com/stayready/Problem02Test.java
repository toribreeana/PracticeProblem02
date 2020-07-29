package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem02Test {

    @Before
    public void setUp() {

    }

    @Test
    public void input01() {
        //Given
        int array[] = {10, 12, 11};
        Problem02 problem02 = new Problem02();

        //When
        String expected = "Length of the longest contiguous subarray is 3";
        String actual = problem02.biggestBoss(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void input02() {
        //Given
        int array[] = {14, 12, 11, 20};
        Problem02 problem02 = new Problem02();
        //When
        String expected = "Length of the longest contiguous subarray is 2";
        String actual = problem02.biggestBoss(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void input03() {
        //Given
        int array[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        Problem02 problem02 = new Problem02();

        //When
        String expected = "Length of the longest contiguous subarray is 5";
        String actual = problem02.biggestBoss(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

}