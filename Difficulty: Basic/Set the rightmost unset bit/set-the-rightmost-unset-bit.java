//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.setBit(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBit(int n) {
        // code here
        // 8 4 2 1
        // 0 1 1 0 ==6
        // 0 1 0 1 ==5
        // ================or operaiton
        // 0 1 1 1
        
        return n | n+1;
    }
}