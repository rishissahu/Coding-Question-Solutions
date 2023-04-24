You are given an array of integers stones where stones[i] is the weight of the ith stone.
We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.

Example 1:
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

Example 2:
Input: stones = [1]
Output: 1

_____________________

Intuition
The intuition behind this approach is to simulate the process of smashing stones together until there are no more stones left to smash. The basic idea is to keep track of the two largest stones in the array, smash them together to get a new stone, and then repeat the process until there are no more stones left.

Approach
To implement this, we first check the length of the array. If the length is 1, we simply return the only element of the array. If the length is 2, we subtract the smaller stone from the larger stone and return the result.

If the length of the array is greater than 2, we start a loop that runs until there are no more stones left to smash. In each iteration of the loop, we find the two largest stones in the array and smash them together to get a new stone. We store this new stone in the second largest position of the array and set the largest position to 0. We then sort the array to bring the remaining stones to the beginning of the array and repeat the process until there are no more stones left.

Finally, we return the last remaining stone in the array as the result.

Complexity
Time complexity: O(n log n)
Space complexity: O(1)