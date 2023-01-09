## Question. Divisible sum pairts
Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .

Example



Three pairs meet the criteria:  and .

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array 
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format

The first line contains  space-separated integers,  and .
The second line contains  space-separated integers, each a value of .

# Solution divisible sum pairs in java
## Algorithm
For each of the numbers (i) in the array,
    Loop through all the numbers(j) that come after that number i should be lessthan j

&emsp;Sum the two numbers i & j 

&emsp;if the remainder of the sum divided by the divisor is zero &emsp;&emsp;incerement the pairs counter
return the pairs counter. 

## Time complexity
 The algoritm takes O(n^2)