//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // Count occurrences of each element
        for (int num : arr) {
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i],map.get(arr[i])+1);
            // }
            // else{
            //     map.put(arr[i],1);
            // }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the majority element
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 2) {
                return key;
            }
        }
        // Optional: handle case where no majority element exists
        return -1; // or throw an exception depending on the requirement
    }

}