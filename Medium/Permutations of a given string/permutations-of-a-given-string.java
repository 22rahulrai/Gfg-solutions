//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


// class Solution {
//     public List<String> find_permutation(String s) {
//         // Code here
//         // prem(s,"");
//         List<String> res=new ArrayList<>();
//         prem(s,res,"");
//         Collections.sort(res);
//         return res;
//     }
//     public static void prem(String s,List<String> res,String ans){
        
//         ArrayList<String> st=new ArrayList<>();
//         if(s.length()==0){
//             res.add(ans);
//             return;
//         }
        
//         for(int i=0;i<n;i++){
//             char curr=s.charAt(i);
//             String newst=s.substring(0,i)+s.substring(i+1);
//             prem(newst,res,ans+curr);
//         }
//     }
// }

// A Set is used to store the permutations to ensure uniqueness. This prevents adding duplicate permutations,
// which can happen if the input string contains repeating characters.

// Converting the Set to a List and then sorting it ensures the output is in lexicographical order.

class Solution {
    public List<String> find_permutation(String s) {
    
        Set<String> resultSet = new HashSet<>();
        generatePermutations(s, "", resultSet);
        List<String> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        return resultList;
    }

    public static void generatePermutations(String s, String current, Set<String> resultSet) {
        // we are adding element in set because it doesnt contain duplicate element
        // and then after that we convert that set to list
        if (s.isEmpty()) {
            resultSet.add(current);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            generatePermutations(remaining, current + ch, resultSet);
        }
    }
}