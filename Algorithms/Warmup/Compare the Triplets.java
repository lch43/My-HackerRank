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

public class Solution {


    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        //My code starts
        List<Integer> returnable = new ArrayList<Integer>();
        if (a.get(0) > b.get(0))
        {
            returnable.add(1);
            returnable.add(0);
        } else if (a.get(0) < b.get(0))
        {
            returnable.add(0);
            returnable.add(1);
        }
        else
        {
            returnable.add(0);
            returnable.add(0);
        }
        if (a.get(1) > b.get(1))
        {
            returnable.set(0, returnable.get(0) + 1);
        } else if (a.get(1) < b.get(1))
        {
            returnable.set(1, returnable.get(1) + 1);
        }

        if (a.get(2) > b.get(2))
        {
            returnable.set(0, returnable.get(0) + 1);
        } else if (a.get(2) < b.get(2))
        {
            returnable.set(1, returnable.get(1) + 1);
        }
        return returnable;
        //My code ends
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
