import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        //My code starts
        char [] stringA = a.toCharArray();
        char [] stringB = b.toCharArray();

        Arrays.sort(stringA);
        Arrays.sort(stringB);

        int keep = 0;

        int start = 0;
        for (int i=0; i<stringA.length; i++)
        {
            
            for (int j = start; j<stringB.length; j++)
            {
                if (stringA[i] == stringB[j])
                {
                    keep++;
                    start = j+1;
                    break;
                }
                else if (stringA[i] < stringB[j])
                {
                    start = j;
                    break;
                }
            }
        }

        return stringA.length + stringB.length - keep*2;
        //My code ends
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}