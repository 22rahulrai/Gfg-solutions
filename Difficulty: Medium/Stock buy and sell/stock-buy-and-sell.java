//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    // int stockBuySell(int arr[]) {
    //     // code here
    //     int max=arr[0];
    //     int min=arr[0];
    //     int res=0;
    //     int n=arr.length;
        
    //     int i=0;
    //     while(i<n-1){
            
    //         // find min
    //         while(i<n-1 && arr[i]>=arr[i+1]){
    //             i++;
    //         }
    //         min=arr[i];
            
    //         // find max
    //         while(i<n-1 && arr[i]<=arr[i+1]){
    //             i++;
    //         }
    //         max=arr[i];
            
    //         res+=(max-min);
    //     }
    //     return res;
    // }
    
    int stockBuySell(int arr[]){
          int profit=0;
        int n=arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                profit=profit+arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.stockBuySell(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends