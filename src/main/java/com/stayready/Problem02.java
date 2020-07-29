package com.stayready;

import java.util.Arrays;

public class Problem02 {

    public String biggestBoss(int[] array) {
        String result = "Length of the longest contiguous subarray is ";
        Arrays.sort(array);
        int count = 1;
        int maxCount = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == array[i] + 1) {
                count += 1;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                    count = 1;
                }
            }
        }
       // maxCount = (maxCount < count)?count:maxCount;
        if(maxCount < count){
            maxCount = count;
        }
        return result + maxCount;
    }
}
