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

class Solution{
    static int longestSubstrDistinctChars(String s){
        int n = s.length();
        int max = 0;
        
        for(int i=0; i<n; i++){
            int[] arr = new int[255];
            String r = "";
            int c = 0;
            for(int j=i; j<n; j++){
                if(arr[s.charAt(j)]==1){
                    break;
                }
                r += s.charAt(j);
                c = j-i+1;
                max=Math.max(c, max);
                arr[s.charAt(j)] = 1;
            }
        }
        return max;
    }
}