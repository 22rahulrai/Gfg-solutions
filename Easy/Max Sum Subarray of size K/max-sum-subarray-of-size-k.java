//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
// class Solution {
//     static long maximumSumSubarray(int k, ArrayList<Integer> arr, int n) {
//         // Initialize variables
//         int maxSum = 0;
//         int currentSum = 0;

//         // Calculate the sum of the first subarray of size k
//         for (int i = 0; i < k; i++) {
//             currentSum += arr.get(i);
//         }

//         // Set the initial maximum sum as the sum of the first subarray
//         maxSum = currentSum;

//         // Slide the window and update the maximum sum
//         for (int i = k; i < n; i++) {
//             // Subtract the element going out of the window
//             currentSum -= arr.get(i - k);
//             // Add the current element to the window
//             currentSum += arr.get(i);
//             // Update the maximum sum if the current sum is greater
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         return maxSum;
//     }
// }



class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        int l=0;
        int r=k-1;
        long maxsum=0;
        long currsum = 0;
        for(int i=l;i<=r;i++){
            currsum += arr.get(i);
        }
        maxsum = currsum;
        
        while(r<n-1){
            currsum = currsum - arr.get(l);
            currsum=currsum + arr.get(r+1);
            maxsum = Math.max(maxsum, currsum);
            l++;
            r++;
        }
        return maxsum;
    }
}