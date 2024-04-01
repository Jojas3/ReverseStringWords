import java.util.*;
public class Main {
    public static void main(String[] args) {
        //could account for periods and exclamation points at a later date.
        String givenString = "Hello World";
        System.out.println(reverseString(givenString));

    }

    private static String reverseString(String givenString) {
        //check if there are spaces. if there aren't then there is nothing to reverse so just return og output.

        if(givenString.contains(" ")) {
            String[] split = givenString.split(" ");
            String newString  ="";
            for(int i = split.length-1; i>=0; i--){
                newString += split[i]+" ";
            }
            return newString;

        }else{
            return givenString;
        }
    }
}