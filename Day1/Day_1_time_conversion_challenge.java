import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    //Get the AM or PM
    String[] time = s.split(":");
    int hour = Integer.parseInt(time[0]);
    String minutes = (time[1]);
    String secondsString = time[2];
    String meridian = s.substring(s.length()-2).trim();
    String seconds = (secondsString.substring(0,secondsString.length()-2));
    System.out.println(hour);
    System.out.println(minutes);
    System.out.println(seconds);
    System.out.println(meridian);
    
    if(meridian.equals("PM")){
        if(hour==12){
            return "12"+":"+minutes+":"+seconds;
        }
        return String.format("%02d",hour+12)+":"+minutes+":"+seconds;
    }else{//AM
        if(hour==12){
            return "00"+":"+minutes+":"+seconds;
        }
        return String.format("%02d",hour)+":"+minutes+":"+seconds;
    }
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
