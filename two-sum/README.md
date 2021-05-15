This is a solution for two sum problem on leet code.
https://leetcode.com/problems/two-sum/

It contains 3 working solutions
1) Solution 1 - Brute force using 2 arrays. Time complexity of O(n * n)
2) Solution 2 - Failed attempt, tried solving using array sorting but array sort alters the index of elements and this problems requires to return the index of the solution.
3) Solution 3 - Using hash map in 2 phases, ine phase 1 inserted all elements and it's index as value into the hash map. In phase 2 iterated over the array to search for the compliment of the element.
4) Solution 4 - using hash map in 1 phase. First we calculate the compliment and check if the compliment is already present in the array. If it's not present we add the element and it's index into the hash map and move to next index.