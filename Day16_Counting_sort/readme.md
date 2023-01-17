# Question: Counting sort

# Solution to the counting sort problem
- Initialize the frequency an array of 100 items since arr[i] is always lessthan 100
    > Integer[] myarray = new Integer [100];
- Fill the frequency array with initial zeros
   > Arrays.fill(myarray, 0);
- Foreach item in the input array count as u updat the frequency array
    ``` 
    for(int i=0;i<arr.size();i++){
        int item = arr.get(i);
        myarray[item] = myarray[item]+1;
    }
    ```
- return the frequency array
    >return Arrays.asList(myarray);

