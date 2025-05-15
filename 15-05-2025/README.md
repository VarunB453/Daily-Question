# 2900: Longest Unequal Adjacent Groups Subsequence

   


---

🧠 The Mystery

You're given a list of words, each tied to a group. Your mission? Build the longest possible subsequence of words such that no two adjacent words belong to the same group.

Think of it like picking team members from different departments for a panel discussion—you want variety, not repetition!


---

🧩 Problem Statement

Given:

An integer n (number of words)

An array words[] of n strings

An array groups[] of n integers


Return the longest subsequence of words such that no two adjacent words are from the same group (i.e., their group IDs must differ).

The result must maintain the original order of words.


---

🔍 Examples

🧪 Example 1

Input: 
words = ["a", "b", "c", "d"], 
groups = [1, 1, 2, 3]

Output: ["a", "c", "d"]

Why?
You skip "b" (same group as "a"). Then "c" and "d" are from different groups.
=> Longest valid subsequence.


---

🧪 Example 2

Input:
words = ["apple", "banana", "carrot", "date", "egg"],
groups = [1, 2, 2, 3, 3]

Output: ["apple", "banana", "date"]

Why?
"banana" and "carrot" are from the same group, so you skip "carrot".
"date" is a new group → keep going!


---

📏 Constraints

1 <= n <= 1000

1 <= words[i].length <= 10

groups[i] is an integer from 0 to 1000



---

⚙️ Approach: Greedy Group Switching

🧠 Idea

We want to maximize the length of a subsequence by including words only if they don't belong to the same group as the previous one.

⚙️ Steps

1. Initialize an empty result list.


2. Keep track of the last selected groupId.


3. Loop through each word:

If its group is not equal to the last one, add it to the result.



4. Return the result.




---

✅ Java Solution

class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int lastGroup = -1;
        for (int i = 0; i < n; ++i) {
            if (groups[i] != lastGroup) {
                result.add(words[i]);
                lastGroup = groups[i];
            }
        }
        return result;
    }
}


---

🧮 Complexity


---

🧰 Related Concepts

Tags: Greedy, Array, Subsequence

Similar Challenges:

198. House Robber

121. Best Time to Buy and Sell Stock

1431. Kids With the Greatest Number of Candies



---

🔚 Final Thought

This problem teaches a key lesson: diversity matters—at least when it comes to building the longest sequence with variety. Sometimes, skipping repetition is the best way forward.


---

