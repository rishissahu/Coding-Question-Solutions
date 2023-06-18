Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

-> Time Complexity: O(n)
1. Iterating over the array: The outer loop in the reverseInGroups function runs n/k times, where n is the size of the array. Since the loop runs in increments of k, the complexity of this loop is O(n/k).

2. Reversing sub-arrays: The inner loop, controlled by the while statement, reverses the sub-array of size k. The maximum number of iterations for this loop is k/2 since left increments by 1 and right decrements by 1 in each iteration. Thus, the complexity of this loop is O(k).

    Overall, the time complexity of the reverseInGroups function is O(n/k * k), which simplifies to O(n). The function has a linear time complexity with respect to the size of the array.

-> Space Complexity: O(1)
The space complexity of the given code is O(1) since it doesn't use any additional data structures that grow with the input size.
