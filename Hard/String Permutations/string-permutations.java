//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


// class Solution
// {
//     public ArrayList<String> permutation(String s)
//     {
//         //Your code here
//         Set<String> resultSet = new HashSet<>();
        
//         prem(s, "", resultSet);
//         ArrayList<String> resultList = new ArrayList<>(resultSet);
//         Collections.sort(resultList);
//         return resultList;
//     }
    
//     public static void prem(String s, String current, Set<String> resultSet) {
//         // we are adding element in set because it doesnt contain duplicate element
//         // and then after that we convert that set to list
//         if (s.isEmpty()) {
//             resultSet.add(current);
//             return;
//         }
        
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             String remaining = s.substring(0, i) + s.substring(i + 1);
//             prem(remaining, current + ch, resultSet);
//         }
//     }
	   
// }


class Solution {
    public ArrayList<String> permutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        char[] charArray = S.toCharArray();
        generatePermutations(charArray, 0, result);
        Collections.sort(result);
        return result;
    }

    private void generatePermutations(char[] charArray, int index, ArrayList<String> result) {
        if (index == charArray.length) {
            result.add(new String(charArray));
            return;
        }

        for (int i = index; i < charArray.length; i++) {
            swap(charArray, index, i);
            generatePermutations(charArray, index + 1, result);
            swap(charArray, index, i); 
        }
    }

    private void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}


