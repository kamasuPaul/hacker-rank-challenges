# Question : Diagonal difference
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

# Solution in java
 - Use a loop to go through the each row, and 
 - for each row get the value of the column
 - Sum the leftDiagonal and rightDiagonal as you iterate through the array

## Time complexity
 Time complexity is O(n)