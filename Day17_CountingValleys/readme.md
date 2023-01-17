# Question: Couting valleys problem hackerank

# Solution : couting valleys in java
- To count valleys, we introduce two variables,
1. valleys- this counts no of valleys
2. levels - this indicates the current level(sea level) the hicker is at
- So the solution involves counting going uphill(U) as `1` and counting going downhill(D) as `-1`.
> By this logic, for a hicker to be at sealevel they must take an equal of number of uphill(U) and downhill(D) steps, therefore they are at sealevel when levels is `0`
- So the algorithm for solving the counting valleys problems becomes
1. Keep track of the valleys count and the sealevel
``` 
int valleys =0;
int levels =0;
```
2. Loop through each path
``` 
for(int i=0;i<path.length();i++){
```
3. If the user is going up, increment the levels count
```
if(ch=='U'){
    levels++;
}
```
4. If the user is going down, reduce the levels count, but also check if they are at sealevel, if they are count a valley entered
```
if(ch == 'D'){
    //if levels is zero, your at sealevel starting counting valleys
    if(levels==0){
        valleys++;
    }
    levels--;//decerement sealevel count
}
```

