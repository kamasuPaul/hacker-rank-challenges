#About the time conversion challege
#Question
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input

07:05:45PM
Sample Output

19:05:45

#What java aspects practiced in the challenge
- How to split a string using the `string.split("delimeter")` method ie `s.split(":")` splits the string using the `:` giving you an array of strings;
- Get sections of a string using the `string.substring("startIndex")` method

#What was required of the time conversion coding challenge
1. Converting from 12 hour to 24 hours has 3 aspects,
 - looking at the meridian(whatever its called) ie `AM/PM` aspect of a 12 hour time
 - and looking at the `hour` itself
 - So if the  meridian is PM, 
        - you check if the hour is 12,
          and if it is 12 you return the same the hour as `12`
          if its not 12 you add 12 to the hour 
          other aspects of the time are the same, you return the time
- if the meridian is AM
        - you check if the hour is 12,
         and if it is 12 return "00" as the hour
         if the hour is not 12, return time as the same,
         other aspects of the time are the same, you return the time
