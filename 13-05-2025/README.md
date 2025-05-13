# 3335. Length After Transformations

  


---

🧩 Problem Statement

You are given a string s consisting of lowercase English letters and an integer t. You perform t operations on s as follows:

In one operation, every character in s is transformed simultaneously.

'a' → 'b'

'b' → 'c'

...

'y' → 'z'

'z' → 'a' + 'b'



Return the length of the final string after t operations. Since the answer can be large, return it modulo 10⁹ + 7.


---

🧠 Examples

Example 1

Explanation:

'a' → 'b'

'b' → 'c'

'z' → 'a' + 'b' (adds 2 characters)
Final string: "bcab" (length = 4)



---

Example 2

Explanation:

After 1st op: "bcd"

After 2nd op: "cde"
Length remains 3.



---

✅ Constraints

1 <= s.length <= 1000

1 <= t <= 1000

s consists only of lowercase English letters.



---

💡 Approach

🧮 Frequency Count with Simulation

1. Track frequency of each letter from 'a' to 'z'.


2. For each operation:

Letters 'a' to 'y' shift right (count[i + 1] += count[i])

'z' becomes 'a' + 'b', so increment both accordingly.



3. Repeat the transformation t times.


4. Return the sum of all letter counts modulo 10⁹ + 7.




---

🔍 Complexity Analysis


---

🧪 Quick Test

public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.lengthAfterTransformations("abz", 1));  // 4
    System.out.println(sol.lengthAfterTransformations("abc", 2)); // 3
    System.out.println(sol.lengthAfterTransformations("z", 3));   // 8
}


---

📚 Topics

Topics: String • Simulation • Counting • Frequency Table


---

💡 Hints

1. Count characters instead of manipulating the full string.


2. Track how 'z' expands the string length by producing 'a' and 'b'.


3. Use modulo 10⁹ + 7 to avoid overflow.




