//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        // 1 method  (tle error )
        // int n=l+1;
        // while(n<=r){
        //     l=l^n;
        //     n++;
        // }
        //  return l;
        
        // 2 method (same tle)
        // int result = 0;
        // for (int i = l; i <= r; i++) {
        //     result =result^ i;  // XOR each number in the range with the result
        // }
        // return result;
        
        int result=xorupto(r) ^ xorupto(l - 1);
        return result;
        
    }
    public static int xorupto(int n){
        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else{
            return 0;
        }
    }
}