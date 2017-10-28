package com.shc.algorithm.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NonDecreasing {

    public static int n;

    public static int m;

    public static int[][] mat;

    public static int[][] result;

    public static boolean meet_constraint(int a, int b) {
        return Math.abs(a - b) > 3;
    }

    public static boolean should_visit(int visited_msk, int new_idx) {
        return ((visited_msk >> new_idx) & 1) == 0;
    }

    public static int dp(int i, int j, int visited_msk) {
// meet_constraint each eight surrounding cells one by one
        int new_idx;

        int result = 0;
        if (j < n - 1 && meet_constraint((mat[i][j]), mat[i][j + 1])) {
            new_idx = i * n + j + 1;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i, j + 1, visited_msk | (1 << new_idx)));
        }

        if (j > 0 && meet_constraint(mat[i][j], mat[i][j - 1])) {
            new_idx = i * n + j - 1;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i, j - 1, visited_msk | (1 << new_idx)));
        }


        if (i > 0 && meet_constraint(mat[i][j], mat[i - 1][j])) {
            new_idx = (i - 1) * n + j;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i - 1, j, visited_msk | (1 << new_idx)));
        }


        if (i < n - 1 && meet_constraint(mat[i][j], mat[i + 1][j])) {
            new_idx = (i + 1) * n + j;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i + 1, j, visited_msk | (1 << new_idx)));
        }


        // diagonals
        if (j < n - 1 && i > 0
                && meet_constraint((mat[i][j]), mat[i - 1][j + 1])) {
            new_idx = (i - 1) * n + j + 1;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i - 1, j + 1, visited_msk | (1 << new_idx)));
        }


        if (j > 0 && i > 0
                && meet_constraint(mat[i][j], mat[i - 1][j - 1])) {
            new_idx = (i - 1) * n + j - 1;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i - 1, j - 1, visited_msk | (1 << new_idx)));
        }


        if (i < n - 1 && j > 0
                && meet_constraint(mat[i][j], mat[i + 1][j - 1])) {
            new_idx = (i + 1) * n + j - 1;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i + 1, j - 1, visited_msk | (1 << new_idx)));
        }


        if (i < n - 1 && j < n - 1
                && meet_constraint(mat[i][j], mat[i + 1][j + 1])) {
            new_idx = (i + 1) * n + j + 1;
            if (should_visit(visited_msk, new_idx))
                result = Math.max(result, 1 + dp(i + 1, j + 1, visited_msk | (1 << new_idx)));
        }

        return result;
    }


    /**
     * Take a rectangular grid of numbers and find the length
     * of the longest sub-sequence.
     *
     * @return the length as an integer.
     */
    public static int longestSequence(int[][] grid) {
        // Initialize result
        int result = 1, visited_msk = 0, new_idx;

        // Compute longest path beginning from all cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                result = Math.max(result, dp(i, j, visited_msk));
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split("\\s+");
        n = Integer.parseInt(firstLine[0]);
        m = Integer.parseInt(firstLine[1]);

        result = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                result[i][j] = 1;

        mat = new int[n][m];

        for (int row = 0; row < n; row++) {
            String[] inputRow = reader.readLine().split("\\s+");

            for (int col = 0; col < m; col++) {
                mat[row][col] = Integer.parseInt(inputRow[col]);
            }
        }
        int length = longestSequence(mat);
        System.out.println(length);
    }
}
