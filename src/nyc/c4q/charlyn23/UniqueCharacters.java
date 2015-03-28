package nyc.c4q.charlyn23;

/**
* Created by charlynbuchanan on 3/25/15.
* enter a string and show only its unique characters
* ex: abbcaabcaa --> abc
*/
import java.util.Scanner;
import java.util.ArrayList;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s;
        String uniqueS = "";
        System.out.println("Please enter a lower case string");
        s = input.nextLine();

        //Create an array
        ArrayList<String> uniqueLetters = new ArrayList<String>();

        uniqueLetters.add(s);

        String alphabet = "abcdefghijklmnopqrstuvwxyzv";

        for (int i = 0; i < uniqueLetters.size(); i++) {
            for (i = 0; i < alphabet.length(); i++) {
                if (s.contains(String.valueOf(alphabet.charAt(i)))) {
                    uniqueS += alphabet.charAt(i);
                }
            }
            System.out.println(uniqueS);


             }
        }
    }

