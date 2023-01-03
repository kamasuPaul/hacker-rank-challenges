# Challenge
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game
Returns

int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.
Input Format

The first line contains an integer , the number of games.
The second line contains  space-separated integers describing the respective values of .

Constraints

# Solution explanation
I really didnt understand the problem, however much i tried. All the algorithms i came up with were not leading to the expected answer.It wasnt until i visited this link having the proper problem explanation.
(Breaking records hacker rank problem explanation )[https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem]


# Solution explanation
The solution i came up involves keeping track of 4 variables
- min. Min keeps track of the minimum score. Its initialized with the value of the first item in the list. ie `int min = scores.get(0)`
- max. Max keeps track of the maximum score. Its initialized with the value of the first item in the list as well ie `int min = scores.get(0)`
- minCount. minCount keeps track of how many times the player has broken their minimum record
- maxCount. maxCount keeps track of how many times the player has broken their maximum record.

### How are records broken.
Records are broken whenever a new `min` mininum or `max` maximum value is found.

### The loop
The loop just iterates through all scores comparing the `current` score with the maximum and the minimum. if the its less than the `min`, a new min is found and the `minCount` is incremented. If its greater than the `max` a new `max` is found and the `maxCount` is incremented.

### Complexity
- the time complexity is O(n) because of the loop.