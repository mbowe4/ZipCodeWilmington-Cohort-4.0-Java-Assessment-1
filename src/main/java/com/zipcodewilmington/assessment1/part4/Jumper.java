package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int numOfJumps = (int) Math.floor(k / j);
        int remainder = k % j;
        int result = numOfJumps + remainder;
        return result;
    }
}
