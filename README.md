# Leetcode-in-Java

Journal

7.29 Max Profit

My professor taught me about this in Data Structures LOL. Still I noticed there's a different solution on Leetcode. The two methods are basically equivalent yet the second one is somehow slightly faster.

7.29 Valid Parentheses

A classic problem that introduces the stack data structure. Here I learnt the syntax of stack in Java. Furthermore, I learnt the difference between ":" and "->" in switch structure and achieved better time and space efficiency with the latter. 

7.28 Longest Prefix

Arrays.sort() can be used to sort the string list by alphabet order, which makes the first and the last element quite different from each other. Yet this method occupies more memory than my first method.

7.28 - Roman2Int

Initially used a map to store the correlation between letters and number, and compared consecutive characters to determine whether to add or subtract.
Later turned to the "switch" structure in Java. Also used if (num * 4 < ans){} to determine whether to add or not. Much faster than before.

7.27 - Palindrome

Encountered problems of "10" and "0" cases. Add a if statement to address the issue.

7.27 - Two Sum

Encountered a problem of return type. Eventually added a "return new int[]{}" statement to guarantee an int[] object is returned, which fixed the problem.
