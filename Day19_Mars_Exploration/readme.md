# Question: Mars exploration
# Solution to Mars exploration challenge in java
- Inititalize a counter for altered messages
>    int counter =0;
- Loop through the characters of the input string `s` and after every 3 iterations, check the characters starting fromt the current position to the previous 2 positions form the `SOS` message. 
- If the characters in the positions are not matching what is supposed to be their increment the `counter`
>To check after every 3 iterations, get the modulus of the position divided by 3.

``` 
for(int i=0;i<s.length();i++){

    if(((i+1)%3)==0){//check the position
    //check if the character in 3rd position is not S
        if(!(s.charAt(i)=='S'))counter++;
    //check if the character in 2nd postion is not O
        if(!(s.charAt(i-1)=='O'))counter++;
    //check if the character in position 1 is not S
        if(!(s.charAt(i-2)=='S'))counter++;
    }
}
```
- Return the counter of altered positions
```
return counter;
```