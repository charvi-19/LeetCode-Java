# LeetCode 26 - Remove Duplicates from Sorted Array

## Problem
Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once.

LeetCode Link:
https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach
- Since the array is sorted, duplicate elements are adjacent.
- Use the Two Pointer technique.
- Pointer `i` keeps track of the last unique element.
- Pointer `j` scans the array.
- Whenever a new unique element is found, increment `i` and copy the element.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Java Solution

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
```