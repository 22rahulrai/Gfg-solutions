//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.sumOfDivisors(N);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        // code here
         int totalSum = 0; // Store the total sum

        // Loop through each number from 1 to n
        for (int k = 1; k <= n; k++) {
            totalSum += k * (n / k); // Add k * number of multiples of k
        }

        return totalSum;
    }
}