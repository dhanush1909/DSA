This is a solution for two sum problem on leet code.
https://leetcode.com/problems/longest-substring-without-repeating-characters/

It contains 1 working solutions:
1) Using has map to store last known location/index of a character.

the basic idea is, keep a hashmap which stores the characters in string as keys and their positions as values, and keep two pointers which define the max substring. move the right pointer to scan through the string , and meanwhile update the hashmap. If the character is already in the hashmap, then move the left pointer to the right of the same character last found. Note that the two pointers can only move forward.
