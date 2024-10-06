//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        // int sum=0;
        // while(n>=1){
        //     int c=0;
        //     int k=n;
        //     while(k!=0){
        //         k=k&k-1;
        //         c++;
        //     }
        //     n=n-1;
        //     sum=sum+c;
        // }
        // return sum;
        
        int count = 0;  // Variable to store the total count of set bits
        int i = 0;      // This will represent the current bit position (starting from 0)
        
        // Loop over all bit positions until (1 << i) <= n
        while ((1 << i) <= n) {
            // Calculate the total number of complete cycles of length 2^(i+1)
            int completeCycles = (n + 1) / (1 << (i + 1));
            count += completeCycles * (1 << i);
            
            // Calculate the remainder (the numbers left after the complete cycles)
            int remainder = (n + 1) % (1 << (i + 1));
            
            // Add set bits from the remainder (if it exceeds 2^i)
            count += Math.max(0, remainder - (1 << i));
            
            // Move to the next bit position
            i++;
        }
        
        return count;
        
    }
}

//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends