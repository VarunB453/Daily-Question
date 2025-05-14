# 3337 - Length of String After Transformations

Problem Summary

You are given:

A lowercase string s

An integer t, the number of transformation steps

A list nums of 26 integers, where nums[i] indicates how many forward cyclic shifts character 'a' + i can transform into in a single step


Each transformation allows a character 'a' + i to transform into the next nums[i] letters (modulo 26). This transformation is applied t times.

Goal: After t rounds of transformation, return the total number of resulting characters (modulo 10⁹ + 7).


---

Solution Overview

This solution uses matrix exponentiation to model repeated transformations efficiently.

Steps:

1. Character Frequency: Count occurrences of each character in the original string s.


2. Transition Matrix: Build a 26×26 matrix where matrix[i][j] = 1 if 'a' + i can transform into 'a' + j in one step.


3. Matrix Exponentiation: Raise this matrix to the power t to simulate t rounds of transformations.


4. Vector-Matrix Multiplication: Multiply the character frequency vector by the matrix to compute the final distribution of characters.


5. Result Aggregation: Sum all the values in the final vector to get the total number of characters after all transformations.


---


Time & Space Complexity

Time Complexity:

Matrix exponentiation: O(26^3 * log t)

Vector-matrix multiplication: O(26^2)


Space Complexity: O(26^2) for matrices



---

Example

Input:
s = "abc"
t = 2
nums = [1, 1, ..., 1] // each character can move forward 1 step per transformation

Output:
Total characters after transformations modulo 1e9+7


