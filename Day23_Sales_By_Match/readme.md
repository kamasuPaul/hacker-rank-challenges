# Question: Sales By Match
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
# Solution to Sales By Match challenge in java
- initialize a variable to keep track of pairs
>int pairsCount = 0;
- initialize a hash map to store count of each sock found, the key is the sock color and the value is the count of how many sock have been found
>HashMap<Integer, Integer> items = new HashMap<>();
- Iterate through all the socks, keeping track of count of each sock color        
```        
    for (int i = 0; i < ar.size(); i++) {
        int key = ar.get(i);
        int value = items.getOrDefault(key, 0);//get the already store value, 0 otherwise
        items.put(key, value + 1);//increment the count
    }
```
- Loop through the different sock colors, and for each color, divide the count by 2 to get the number of pairs
```
        for (Map.Entry<Integer, Integer> entry : items.entrySet()) {
            int value = entry.getValue();
            int sum = (value / 2);
            pairsCount = pairsCount + sum; // increment the pairs count
        }
```
- Return the pairs count
> return pairsCount;
