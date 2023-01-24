# Question: Migrating birds
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

# Solution to migrating birds in java
- Initialize the birdcount id and the maximum count variable
```
int smallestBirdId = 0;
int maxCount = 0;
HashMap<Integer, Integer> map = new HashMap<>();
```
- Loop through the list of bird ids and for each bird id, add it to the hashmap, incrementing its count. 
If two birdids have the same count, the first will be returned
```
for (int i = 0; i < arr.size(); i++) {
    int key = arr.get(i);
    int value = map.getOrDefault(key, 0);
    map.put(key, value + 1);
}
```
- The loop through the hashmap and find the key, with the biggest count
```
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();
    if (value > maxCount) {
        smallestBirdId = key;
        maxCount = value;
    }
}
```
- return the bird with the maximum count found.
>           return smallestBirdId;