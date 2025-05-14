# 3337 - Length After Transformations

Problem Summary

You are given a lowercase string s, an integer t, and a list of 26 integers nums where nums[i] determines how the character 'a' + i can be transformed. Each character can shift forward (circularly) by 1 to nums[i] positions in one transformation. Perform this transformation t times and return the total length of the resulting string after all transformations.

Class: Solution

Method: public int lengthAfterTransformations(String s, int t, List<Integer> nums)

Parameters:

s: A string of lowercase letters.

t: Number of transformation rounds to apply.

nums: A list of 26 integers, where each index i represents how many positions the character 'a' + i can transform forward.


Returns:

The total count of characters (with multiplicity) after applying the transformations t times, modulo 1e9 + 7.



---

Core Logic

The transformations can be modeled using matrix exponentiation. Each character transformation can be thought of as a state transition in a directed graph, represented as an adjacency matrix.

Step-by-Step Breakdown:

1. Count Initial Characters:

cnt[i] holds the count of character 'a' + i in the input string.



2. Build Transformation Matrix:

For each character 'a' + i, it can transform to (i + j) % 26 for j = 1 to nums[i].

This results in a 26x26 matrix matrix where matrix[i][j] = 1 if a transition from i to j is allowed.



3. Matrix Exponentiation:

Raise the transformation matrix to the power t using fast exponentiation to simulate t transformation rounds.



4. Apply Final Transformation:

Multiply the character count vector by the matrix to get the final distribution of characters after t rounds.



5. Sum the Result:

Return the sum of all characters in the final vector modulo 1e9 + 7.





---

Helper Methods

matmul(int[][] a, int[][] b)

Performs matrix multiplication with modulus handling.

matpow(int[][] mat, int power, int m)

Computes matrix exponentiation efficiently using binary exponentiation.

vectorMatrixMultiply(int[] vector, int[][] matrix)

Multiplies a vector by a matrix to simulate one full transformation step.


---

Time and Space Complexity

Time: O(26^3 * log t) due to matrix exponentiation.

Space: O(26^2) for matrix storage.



---

Example

String s = "abc";
int t = 2;
List<Integer> nums = Arrays.asList(1, 2, ..., 1); // length 26

Solution sol = new Solution();
int result = sol.lengthAfterTransformations(s, t, nums);
System.out.println(result);


