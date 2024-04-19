package org.example;

public class Solution {

    public static int solution(int[] A) {
        int multiplications = 0;

        for (var i = 0; i < A.length; i++) {
            final var index = i;
            var value = A[i];

            if (index % 4 == 0 && value <= 0) { // For indices 0, 4, 8, ..., the element should be positive
                if (value == 0) { // If the element is 0, return -1 as it cannot be made negative
                    return -1;
                }
                multiplications++;
            } else if (index % 4 == 2 && value >= 0) { // For indices 2, 6, 10, ..., the element should be negative
                if (value == 0) { // If the element is 0, return -1 as it cannot be made negative
                    return -1;
                }
                multiplications++;
            } else if (index % 2 == 1 && value != 0) { // For indices 1, 3, 5, ..., the element should be zero
                multiplications++;
            }
        }

        return multiplications;
    }

}
