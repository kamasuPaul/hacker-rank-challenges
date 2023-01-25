# Question: Maximum perimeter triangle (non-degenerate triangle)
Given an array of stick lengths, use 3 of them to construct a non-degenerate triangle with the maximum possible perimeter. Return an array of the lengths of its sides as  integers in non-decreasing order.

If there are several valid triangles having the maximum perimeter:

1.Choose the one with the longest maximum side.
2.If more than one has that maximum, choose from them the one with the longest minimum side.
3.If more than one has that maximum as well, print any one them.
4.If no non-degenerate triangle exists, return [-1]

# Solution to Maximum perimeter triangle in java
> A non degenerate triangle is one where the sum of two sides is greathan that the size of one side. ie if a triangle has 3 sides a,b and c. then The triangle is non-degenerate if a+b > c and a+c > b and b+c > a.

# Solution in java
- Sort the list of sides from smallest to largest
```
Integer [] sides = new Integer [3];
sticks.sort(Comparator.naturalOrder());
```
- Loop through the sides of the triangle starting with the largest to smallest, when you find 3 items that satify the condition `a+b>c` break out the loop, you have the items that form the largest perimeter.
- Add the found items to the array of sides
```
int size = sticks.size()-3;
for(int i=size;i>=0;i--){
    int a = sticks.get(i);
    int b = sticks.get(i+1);
    int c = sticks.get(i+2);

    if((a+b)>c){
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
        break;
        }
}
```
- If the first element in the array is empty after the loop, the triangle is not non degenerate, return a list containing -1
```
if(sides[0]==null){
    return new ArrayList<Integer>(Arrays.asList(-1));
}
```
- Else return a list containing the 3 sides
```
return Arrays.asList(sides);
```
