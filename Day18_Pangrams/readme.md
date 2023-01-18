# Question: Pangrams
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
# Solution to Hacker rank problem pangrams in java
- First convert the input string to lowercase
>s = s.toLowerCase();
- Then declare a string containging all alphabet letters
``` 
String alphabet = "abcdefghijklmnopqrstuvwxyz";
```
-  Then loop through each alphabet character checking if the input string contains that character
```
for(int i=0;i<alphabet.length();i++){
    char letter = alphabet.charAt(i);
    String letterString = Character.toString(letter);
    //if the string this alphabet letter, its not a pangram, return "not pangram"
    if(!s.contains(letterString)){
        return "not pangram";
    }
}
```
- If the input string contains all the letters of the letter of the alphabet, then its a pangram. Return `pangram`
>return "pangram";
