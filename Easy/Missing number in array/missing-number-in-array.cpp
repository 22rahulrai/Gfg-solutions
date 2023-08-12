//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;




// } Driver Code Ends
// User function template for C++

class Solution{
  public:
    int missingNumber(vector<int>& arr, int n) {
        // Your code goes here
        sort(arr.begin(),arr.end());
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[j]<arr[i]){
        //             swap(arr[i],arr[j]);
        //         }
        //     }
      
        // while(i<n){
        //     if(arr[i]!=n-(n-(i+1))){
        //         i++;
        //         return i;
        //     }
        // }
        // }
        int i=0;
        while(i<n){
            if(i+1!=arr[i]){
                return i+1;
                
            }
            i++;
        }
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;

        vector<int> array(n - 1);
        for (int i = 0; i < n - 1; ++i) cin >> array[i];
        Solution obj;
        cout << obj.missingNumber(array, n) << "\n";
    }
    return 0;
}
// } Driver Code Ends