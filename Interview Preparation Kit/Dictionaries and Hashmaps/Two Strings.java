import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        //My code starts
        Hashtable<String, Integer> letters = new Hashtable<String, Integer>();
        String smaller = s2;
        String other = s1;
        if (s1.length() < s2.length())
        {
            smaller = s1;
            other = s2;
        }

        for (int i=0; i<smaller.length(); i++)
        {
            letters.put(""+smaller.charAt(i), 1);
        }

        for (int i=0; i<other.length(); i++)
        {
            if (letters.get(""+other.charAt(i)) != null)
            {
                return "YES";
            }
        }
        return "NO";
        //My code ends
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
