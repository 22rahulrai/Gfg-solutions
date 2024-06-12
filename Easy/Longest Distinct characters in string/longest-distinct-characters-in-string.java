//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
// this code is written by me its output is wrong

// class Solution{
//     static int longestSubstrDistinctChars(String s){
//         // code here
//         int n=s.length();
//         int c=0;
//         int max=0;
//         String r="";
//         int []arr=new int[255];
        
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 if(arr[s.charAt(j)]==1){
//                     break;
//                 }
//                 r=r+s.charAt(j);
//                 c=j-i+1;
//                 max=Math.max(c,max);
//                 arr[s.charAt(j)]=1;
//             }
//         }
//         return max;
//     }
// }


// this code is corrected by chatgpt
// this is basic approach
// for this code to work right we need to declare array inside for loop so that it can get updated 
// class Solution{
//     static int longestSubstrDistinctChars(String s){
//         int n = s.length();
//         int max = 0;
        
//         for(int i=0; i<n; i++){
//             int[] arr = new int[255];
//             String r = "";
//             int c = 0;
//             for(int j=i; j<n; j++){
//                 if(arr[s.charAt(j)]==1){
//                     break;
//                 }
//                 r += s.charAt(j);
//                 c = j-i+1;
//                 max=Math.max(c, max);
//                 arr[s.charAt(j)] = 1;
//             }
//         }
//         return max;
//     }
// }

// I have initialized the max variable correctly, also I have placed the array and string initialization 
// inside the first for-loop so that they get cleared for each new substring. And I have corrected the
// syntax in the line where you increment the array element.



// this is siliding window approach
// class Solution{
//     static int longestSubstrDistinctChars(String s){
//         int n = s.length();
//         int max = 0;
//         int start = 0;
        
//         HashMap<Character, Integer> map = new HashMap<>();
        
//         for(int i=0; i<n; i++){
//             if(map.containsKey(s.charAt(i))){
//                 start = Math.max(start, map.get(s.charAt(i)) + 1);
//             }
//             map.put(s.charAt(i), i);
//             max = Math.max(max, i - start + 1);
//         }
//         return max;
//     }
// }




// this two-pointer approach

class Solution {
    static int longestSubstrDistinctChars(String s) {
        // code here
        int n = s.length();
        if (n == 0) return 0; // If string is empty, return 0

        int maxLen = 0; // Max length of substring with all distinct characters
        HashMap<Character, Integer> map = new HashMap<>(); // Map to store the last index of each character
        int left = 0; // Left boundary of the sliding window

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            // If the character is already present in the map and its index is within the current window
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1; // Move the left boundary to the right of the last occurrence of the character
            }

            map.put(ch, right); // Update the last occurrence of the character
            maxLen = Math.max(maxLen, right - left + 1); // Calculate the window size
        }

        return maxLen; // Return the maximum window size found
    }
}

// Explanation of the changes and the approach:

//     Use of HashMap: Instead of an array, a HashMap is used to keep track of the most recent index of each character. This allows for efficiently checking and updating the position of characters that need to be considered for the sliding window.
//     Sliding Window Technique: The sliding window is maintained using two pointers (left and right), which represent the boundaries of the window. The right pointer expands the window by moving forward in the loop, and the left pointer adjusts to skip over duplicate characters efficiently.
//     Efficiency: The approach ensures that each character is processed once, making the time complexity O(n), where n is the length of the string. This is more efficient than the nested loop approach, which could potentially lead to O(n^2) time complexity in the worst case.
// This approach optimally finds the length of the longest substring with all distinct characters in a given string.
