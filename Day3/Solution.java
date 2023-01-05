import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            if(line.isEmpty()){
                
                break; // if an input is empty, break
            }
            processString(line.trim());
        }
        bufferedReader.close();
    }
    public static void processString(String input){
        String [] parts = input.split(";");
        String operation = parts[0].trim();
        String identifier = parts[1].trim();
        String  variableName = parts[2].trim();
        // System.out.println(operation);
        // System.out.println(identifier);
        // System.out.println(variableName);
        //brute force.. loop through the 
        if(operation.equals("S")){
            //switch btn the identifer
            if(identifier.equals("M")){
                    for(String word: splitWordIntoWords(variableName.substring(0,variableName.length()-2).trim())){
                        System.out.print(word+" ");
                    }
                    System.out.println();
            }    
            if(identifier.equals("C")){
                    for(String word: splitWordIntoWords(variableName.trim())){
                        System.out.print(word+" ");
                    }
                    System.out.println();

            }
            if(identifier.equals("V")){
                    ArrayList<String> words = splitWordIntoWords(variableName.trim());
                    for(String word: words){
                        System.out.print(word+" ");
                    }
                    System.out.println();
            }
        }
        if(operation.equals("C")){
            if(identifier.equals("M")){
                String[] words = variableName.trim().split(" ");
                System.out.print(words[0].toLowerCase());
                
                for(int i=1;i<words.length;i++){
                    String word = words[i];
                    System.out.print(Character.toUpperCase(word.charAt(0)));
                    System.out.print(word.substring(1).toLowerCase());
                }
                System.out.print("()");
                System.out.println();
            }
            if(identifier.equals("C")){
                String[] words = variableName.trim().split(" ");
                // System.out.print(words[0]);
                for(int i=0;i<words.length;i++){
                    String word = words[i];
                    System.out.print(Character.toUpperCase(word.charAt(0)));
                    System.out.print(word.substring(1).toLowerCase());
                }
                                System.out.println();

            }
            if(identifier.equals("V")){
                                String[] words = variableName.trim().split(" ");
                System.out.print(words[0].toLowerCase());
                for(int i=1;i<words.length;i++){
                    String word = words[i];
                    System.out.print(Character.toUpperCase(word.charAt(0)));
                    System.out.print(word.substring(1).toLowerCase());
                }
                                System.out.println();

                
            }            
            
        }
    }
    public static ArrayList<String> splitWordIntoWords(String input){
        String inputWord = input.trim();
        // System.out.println(inputWord);
        ArrayList<String> words = new ArrayList<String>();
        //brute for, look at each character of the word
        //Use string builder , its faster
        StringBuilder builder = new StringBuilder();
        builder.append(Character.toLowerCase(inputWord.charAt(0)));
        for(int i = 1;i<inputWord.length();i++){
            Character character = inputWord.charAt(i);
            if(Character.isUpperCase(character)){
                String word = builder.toString();
                // System.out.println(word.length());
                words.add(word);
                builder.setLength(0);
            }
                builder.append(Character.toLowerCase(character));
                // System.out.println(character);
                // System.out.println(builder.length());

        }
        words.add(builder.toString());
        // System.out.println(words.size());
        return words;
    }
    
}