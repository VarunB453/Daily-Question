2094: Finding 3-Digit Even Numbers

   


---

🧠 The Mystery

You’ve got a pile of digits — some might be duplicate, some not — and you're asked to form all valid 3-digit even numbers using each digit at most once.

But there’s a catch: No leading zero. And the number must be even.

Find them all. Sorted. No repeats.


---

🧩 Problem Statement

Given: An array digits containing digits 0–9.

Goal: Return all unique 3-digit even numbers that can be formed using each digit at most once.


---

🔍 Examples

🧪 Example 1

Input: digits = [2, 1, 3, 0]
Output: [102, 120, 130, 132, 210, 230, 302, 310, 312, 320]

All valid 3-digit evens.

No leading zero, no repetition beyond digit availability.



---

🧪 Example 2

Input: digits = [2, 2, 8, 8, 2]
Output: [228, 282, 822]

Duplicates respected — e.g., 2 and 8 appear multiple times.

No overuse of digits.



---

🧪 Example 3

Input: digits = [0, 2, 0, 0]
Output: [200]

Only one valid number: 200.



---

📏 Constraints

3 <= digits.length <= 100

0 <= digits[i] <= 9



---

⚙️ Approach: Brute-Force With Smart Filtering

Try all 3-digit combinations — there are only 1000 of them.

✅ Steps

1. Loop from 100 to 999.


2. Check if the number is even.


3. Build a frequency count of the number’s digits.


4. Ensure that frequency doesn’t exceed that in the digits array.


5. If valid, add to result.




---

🧮 Complexity

Where D is the number of digits (≤ 100), and 900 is the number of 3-digit numbers.


---

🧰 Related Concepts

Tags: Array, Hash Table, Simulation, Counting

Similar Challenges:

40. Combination Sum II

90. Subsets II

996. Number of Squareful Arrays



---

🔚 Final Thought

You’re not just picking numbers — you're building order out of chaos with strict rules. Think of it as a number puzzle, where logic filters out the fluff, and the answer clicks.


