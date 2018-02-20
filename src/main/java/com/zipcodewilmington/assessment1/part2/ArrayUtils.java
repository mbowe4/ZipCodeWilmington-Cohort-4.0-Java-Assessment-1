package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;


    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        int duplicateCount = getNumberOfOccurrences(objectArray, objectToRemove);

        Object[] noDuplicates = new Integer[objectArray.length - duplicateCount];
        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                noDuplicates[count] = objectArray[i];
                count++;
            }
        }

        return noDuplicates;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        int currentCount = 1;
        int mostCommonCount;

        Object mostCommon = objectArray[0];
        Object tempCount = 0;

        for (int i = 0; i < (objectArray.length - 1); i++) {
            tempCount = objectArray[i];
            mostCommonCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (tempCount == objectArray[j])
                    mostCommonCount++;
            }
            if (mostCommonCount > currentCount) {
                mostCommon = tempCount;
                currentCount = mostCommonCount;
            }
        }
        return mostCommon;

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Integer[] objectArray) {


        int currentCount = 1;
        int leastCommonCount;

        Object leastCommon = objectArray[0];
        Object temp = 0;

        for (int i = 0; i < (objectArray.length - 1); i++) {
            temp = objectArray[i];
            leastCommonCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (temp == objectArray[j])
                    leastCommonCount++;
            }
            if (leastCommonCount < currentCount) {
                leastCommon = temp;
                currentCount = leastCommonCount;
            }
        }
        return leastCommon;

    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Object[] newArr = new Integer[objectArray.length + objectArrayToAdd.length];

        int currCount = 0;
        for (int i = 0; i < objectArray.length; i++) {
            newArr[currCount] = objectArray[i];
            currCount++;
        }

        int count = objectArray.length;
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            newArr[count] = objectArrayToAdd[i];
            count++;
        }

        System.out.println(Arrays.toString(newArr));
        return newArr;


    }
}
