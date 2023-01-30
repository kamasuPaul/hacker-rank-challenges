# Question: Left rotation
A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.

# Solution to the left rotation hacker rank problem in java
- Initialize another list to use to rotate elements
```
List<Integer> arr2 = new ArrayList<>();
```
- Get the rotation point as d
> Note: This doesnt handle the case when the number of rotations is greathan the size of the array.
```
int size  = arr.size();
int rotation = d;
```
- Starting at the rotation point, populate a second array until the end of the array
```
for(int i=rotation;i<arr.size();i++){
    arr2.add(arr.get(i));
}
```
- Then populate the array with remaining elements
```
for(int j=0;j<d;j++){
    arr2.add(arr.get(j));       
}
```
- Return new array
```
return arr2;
```
## Algorithm complexity
The algorithm has a time of complexity of `O(n)` and a space complexity of `O(n)`

>Special note: I think their exists away of doing the rotation in place