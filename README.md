# Leetcode-in-Java

## Journal

###
- [Problem]()
- [Code] ()
- Comment: **

### 8.8 Add Binary
- [Problem](https://leetcode.com/problems/add-binary/)
- [Code] (https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/addBinary.java)
- Comment: This problem is not special, yet I remember binary addition can be addressed completely with bit operation. When we have input as numbers, we can write the following code:
```java
public static int addBinary3(int a, int b){
        int sum = a ^ b, carry = (a & b) << 1;
        while (carry != 0){
            a = sum;
            b = carry;
            sum = a ^ b;
            carry = (a & b) << 1;
        }
        return sum;
    }
```

### 8.8 Plus One
- [Problem](https://leetcode.com/problems/plus-one/)
- [Code] (https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/plusOne.java)
- Comment: Did similar problems before in middle school in C++. A new technique I learnt from this problem is that I can use "new type[n]" to initialize a list of desired size.

### 7.31 Length of Last Word
- [Problem](https://leetcode.com/problems/length-of-last-word/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/lengthOfLastWord.java)
- Comment: I believe I came up with an elegant structure to fix the whole thing!

### 7.31 Search Insert Position
- [Problem](https://leetcode.com/problems/search-insert-position/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/searchInsert.java)
- Comment: A classical problem that requires binary search to solve. Needs some modifications (i.e., M = (L + R + 1) / 2, L = M + 1, something like these) after you have the basic structure.

### 7.31  Find the Index of the First Occurrence in a String
- [Problem](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/strStr.java)
- Comment: It's weird the equivalence of two String instances cannot be judged with '=' but with a built-in method called "equals()".

### 7.30 Remove Elements
- [Problem](https://leetcode.com/problems/remove-element/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/removeElement.java)
- Comment: Similar to "Remove Duplicates".

### 7.30 Remove Duplicates
- [Problem](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/removeDuplicates.java)
- Comment: A classical problem that asks you to solve it with an in-place programming fashion.

### 7.30 Merge Sorted Lists
- [Problem](https://leetcode.com/problems/merge-two-sorted-lists/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/merge_sorted_lists.java)
- Comment: Had some trouble figuring out the syntax for listnode. The java syntax (curNode.next = l1 == null? l2 : l1;) is very useful.

### 7.29 Best time to Buy and Sell a Stock
- [Problem](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/maxProfit.java)
- Comment: My professor taught me about this in Data Structures LOL. Still I noticed there's a different solution on Leetcode. The two methods are basically equivalent yet the second one is somehow slightly faster.

### 7.29 Valid Parentheses
- [Problem](https://leetcode.com/problems/valid-parentheses/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/valid_parentheses.java)
- Comment: A classic problem that introduces the stack data structure. Here I learnt the syntax of stack in Java. Furthermore, I learnt the difference between ":" and "->" in switch structure and achieved better time and space efficiency with the latter. 

### 7.28 Longest Prefix
- [Problem](https://leetcode.com/problems/longest-common-prefix/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/longest_prefix.java
)
- Comment: Arrays.sort() can be used to sort the string list by alphabet order, which makes the first and the last element quite different from each other. Yet this method occupies more memory than my first method.

### 7.28 - Roman2Int
- [Problem](https://leetcode.com/problems/roman-to-integer/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/Rome2Int.java)
- Comment: Initially used a map to store the correlation between letters and number, and compared consecutive characters to determine whether to add or subtract.
Later turned to the "switch" structure in Java. Also used if (num * 4 < ans){} to determine whether to add or not. Much faster than before.

### 7.27 - Palindrome Number
- [Problem](https://leetcode.com/problems/palindrome-number/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/Palindrome.java)
- Comment: Encountered problems of "10" and "0" cases. Add a if statement to address the issue.

### 7.27 - Two Sum
- [Problem](https://leetcode.com/problems/two-sum/)
- [Code](https://github.com/Zephyr271828/Leetcode-in-Java/blob/main/Two_Sum.java)
- Comment: Encountered a problem of return type. Eventually added a "return new int[]{}" statement to guarantee an int[] object is returned, which fixed the problem.
