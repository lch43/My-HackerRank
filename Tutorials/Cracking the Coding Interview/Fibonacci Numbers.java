import java.util.*;

public class Solution {

    private static int[] fibMemo = new int[31];

    public static int fibonacci(int n) {
        //My code starts
        if (n == 1 || n == 2)
        {
            return 1;
        }
        else if (fibMemo[n] != 0)
        {
            return fibMemo[n];
        }
        else
        {
            fibMemo[n] = fibonacci(n-1) + fibonacci(n-2);
            return fibMemo[n];
        }
        //My code ends
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
