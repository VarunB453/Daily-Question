1550. Three Consecutive Odds | Java Solution

  


---

🧩 Problem Statement

Given an integer array arr, return true if there are three consecutive odd numbers. Otherwise, return false.


---

🧠 Examples

Example 1

Explanation:
No three consecutive odd numbers exist in the array.


---

Example 2

Explanation:
The subarray [5,7,23] contains three consecutive odd numbers.


---

✅ Constraints

1 <= arr.length <= 1000

1 <= arr[i] <= 1000



---

💡 Approach

🔄 Simple Linear Scan

1. Iterate through the array while keeping a counter for consecutive odd numbers.


2. If a number is odd, increment the counter.


3. If it’s even, reset the counter to zero.


4. If the counter reaches 3, return true.



> This approach is efficient due to the linear nature of the scan and constant space usage.




---

📚 Topics & Hint

Topics: Array

Hint:

> Use a counter to track how many odd numbers appear consecutively.
