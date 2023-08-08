# Leetcode-in-Java

## Journal

### 7.31 Length of Last Word
- [Problem](https://leetcode.com/problems/length-of-last-word/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/lengthOfLastWord.java)
- Comment: I believe I came up with an elegant structure to fix the whole thing!

### 7.31 Search Insert
- [Problem]()
- [Code]()
- Comment: A classical problem that requires binary search to solve. Needs some modifications (i.e., M = (L + R + 1) / 2, L = M + 1, something like these) after you have the basic structure.

7.31 strStr
- [Problem]()
- [Code]()
- Comment: 
It's weird the equivalence of two String instances cannot be judged with '=' but with a built-in method called "equals()".

7.30 Remove Elements
- [Problem]()
- [Code]()
- Comment: 
Similar to "Remove Duplicates".

7.30 Remove Duplicates
- [Problem]()
- [Code]()
- Comment: 
A classical problem that asks you to solve it with an in-place programming fashion.

7.30 Merge Sorted Lists


Had some trouble figuring out the syntax for listnode. The java syntax (curNode.next = l1 == null? l2 : l1;) is very useful.

7.29 Max Profit
- [Problem]()
- [Code]()
- Comment: 
https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/maxProfit.java

My professor taught me about this in Data Structures LOL. Still I noticed there's a different solution on Leetcode. The two methods are basically equivalent yet the second one is somehow slightly faster.

7.29 Valid Parentheses
- [Problem]()
- [Code]()
- Comment: 
https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/valid_parentheses.java

A classic problem that introduces the stack data structure. Here I learnt the syntax of stack in Java. Furthermore, I learnt the difference between ":" and "->" in switch structure and achieved better time and space efficiency with the latter. 

### 7.28 Longest Prefix
- [Problem](https://leetcode.com/problems/longest-common-prefix/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/longest_prefix.java
)
- Comment: Arrays.sort() can be used to sort the string list by alphabet order, which makes the first and the last element quite different from each other. Yet this method occupies more memory than my first method.

- [Problem]()
- [Code]()
- Comment: 

### 7.28 - Roman2Int
- [Problem](https://leetcode.com/problems/roman-to-integer/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/Rome2Int.java)
- Comment: Initially used a map to store the correlation between letters and number, and compared consecutive characters to determine whether to add or subtract.
Later turned to the "switch" structure in Java. Also used if (num * 4 < ans){} to determine whether to add or not. Much faster than before.

### 7.27 - Palindrome
- [Problem](https://leetcode.com/problems/palindrome-number/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/Palindrome.java)
- Comment: Encountered problems of "10" and "0" cases. Add a if statement to address the issue.

### 7.27 - Two Sum
- [Problem](https://leetcode.com/problems/two-sum/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/Two_Sum.java)
- Comment: Encountered a problem of return type. Eventually added a "return new int[]{}" statement to guarantee an int[] object is returned, which fixed the problem.
