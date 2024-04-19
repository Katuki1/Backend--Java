package org.example;


public class Main {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] A, int K) {
                int N = A.length;
                if (N == 0) {
                    return A;
                }

                // Normalize the rotation count
                K = K % N;

                // If K is 0, no rotation needed
                if (K == 0) {
                    return A;
                }

                // Create a new array to store the rotated elements
                int[] rotatedArray = new int[N];

                // Perform the rotation 'K' times
                for (int i = 0; i < N; i++) {
                    int newIndex = (i + K) % N;
                    rotatedArray[newIndex] = A[i];
                }

                return rotatedArray;
            }
        }

    }
}