//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

// class Solution{
//     // Function for finding maximum and value pair
//     public static int lenOfLongSubarr (int arr[], int n, int k) {
//         //Complete the function
        
//         // int maxl=0;
//         // for(int i=0;i<n;i++){
//         //     int sum=0;
//         //     for(int j=i;j<n;j++){
//         //         sum+=arr[j];
//         //         if(sum<=k){
//         //             maxl=Math.max(maxl,j-i+1);
//         //         }
//         //         else if(sum>k){
//         //             break;
//         //         }
//         //     }
//         // }
//         // return maxl;
//     }
// }


class Solution {
    
    // Function for finding maximum and value pair
    public int lenOfLongSubarr(int arr[], int n, int k) {
        // map to store the first occurrence of the prefix sum
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0; // This will store the prefix sum
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            // Check if the current prefix sum is exactly what we need
            if (sum == k) {
                maxLength = i + 1; // entire array from 0 to i has sum k
            }
            
            // If the sum exceeds k, we need to check if there is a prefix that we can subtract
            // and get a sum less than or equal to k
            if (!map.containsKey(sum)) {
                map.put(sum, i); // store first occurrence of this sum
            }
            
            if (map.containsKey(sum - k)) {
                // find the length of the current subarray with sum = k
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
        }
        
        return maxLength;
    }
}


// Explanation:

//     Prefix Sum: Accumulate the sum of elements as you iterate through the array.
//     HashMap: Store the first occurrence of each prefix sum. This helps in quickly finding out where a given sum occurred for the first time.
//     Check for sum == k: If at any point the cumulative sum equals k, update maxLength as this might be the longest subarray from the start.
//     Check for sum - k in Map: This checks if there's a prefix sum that, when subtracted from the current sum, equals k. This means the subarray between that prefix sum and the current index sums to k.

// This approach ensures that each element is processed once, making the time complexity ( O(n) ), and uses ( O(n) ) extra space for the hashmap.

