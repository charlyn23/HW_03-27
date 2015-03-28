package nyc.c4q.charlyn23;

/**
 * Created by charlynbuchanan on 3/25/15.
 */
import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string to encode");
//
//        String input = sc.nextLine();
//        String encoded = CaesarCipher.encode(input, 25);
//        System.out.println(encoded);
//
//        String decoded = CaesarCipher.decode(encoded, 25);
//        System.out.println(decoded);
//
//        boolean theSame = true;
//        int offset;
//        String word1;
//        String word2;
//
//
//        System.out.println("Enter a string to encode");
//        word1 = sc.nextLine();
//        System.out.println("Enter a second string to encode");
//        word2 = sc.nextLine();


        codeBreaker("hello", "ifmmp");
        //Enter words here  ^^
    }

//    Write a function called codeBreaker, which accepts two cipher strings
// and returns a boolean value which tells us whether they are actually the
// same input message encoded using two different offsets.


    //First, try running every possible offset permutation. one of the
    //if any of the strings match, it should return true
    public static boolean codeBreaker(String word1, String word2) {



        for (int i = 0; i < 26; i++) {
            //System.out.println("W1: " + word1);
            //System.out.println("W2: " + encode(word2, i));
            if (word1.equals((encode(word2, i)))) {
                System.out.println("True");
                return true;
            }

        }
        System.out.println("false");
        return false;
    }
}
