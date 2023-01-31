# Question: Number line jumps
You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location x1  and moves at a rate of v1  meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

# Solution to the number line jumps hacker rank problem in java
- Get the difference between the jump rates. if the difference is less or equal to zero, the two kangaroo's will never meet since x1 is always lessthan x2. ie x1 starts behind x2 always
```
int diffV = v1-v2;
if(diffV<=0){
    return "NO";
}
```
- Get the difference between x1 and x2. Then divide the difference by the difference between the jump rates ie diff betwween v1 and v2. if the remainder is zero. Then two will meet, otherwise they will never meet.
```
        int diffX = x1-x2;
       return diffX%diffV==0?"YES":"NO";
```
## Complexity
the time complexity is O(1)