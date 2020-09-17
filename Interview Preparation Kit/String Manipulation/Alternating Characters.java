import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        //My code starts
        int deletions = 0;
        int stringSize = s.length();

        if (stringSize == 0)
        {
            return 0;
        }

        char prevChar = s.charAt(0);

        for (int i=1; i<stringSize; i++)
        {
            char check = s.charAt(i);
            if (prevChar == check)
            {
                deletions++;
            }
            else
            {
                prevChar = check;
            }
        }
        return deletions;
        //My code ends
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
