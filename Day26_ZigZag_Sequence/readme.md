# Question: Zig zag sequence
Given an array of n distinct integers, transform the array into a zig zag sequence by permuting the array elements. A sequence will be called a zig zag sequence if the first  k elements in the sequence are in increasing order and the last k  elements are in decreasing order, where k = (n+1)/2 . You need to find the lexicographically smallest zig zag sequence of the given array.

# Solution to zig zag sequence in java
- Get the index of the mid element of the array by dividing the size by 2
- Swap the mid element with last element
- Loop through the elements from the element after the midle element ie `mid+1` element, to the second last element ie `n-2` element
- Increment the first counter, and decrement the second counter
- if the first counter is greathan or equal to the second counter terminate the loop