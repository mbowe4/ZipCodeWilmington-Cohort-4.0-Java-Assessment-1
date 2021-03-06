package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int N = input.length(), ans = 0;
        for (int center = 0; center <= 2 * N-1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && input.charAt(left) == input.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }
}
