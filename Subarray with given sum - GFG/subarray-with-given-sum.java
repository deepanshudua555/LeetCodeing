//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        ArrayList<Integer>list = new ArrayList<>();
        int start = 0;
        int cs = arr[0];
        for(int i=1;i<=n;i++){
            //if currSum exceed sum
            while(cs>sum && start<i-1){
                cs=cs-arr[start];
                start++;
            }
            
            if(cs==sum){
                list.add(start+1);
                list.add(i);
                return list;
            }
            if(i<n){
                cs= cs+arr[i];
            }
        }
        list.add(-1);
        return list;
    }
}

// //{1,2,3,7,5}
// //1 
// 12 = 3 
// 123 = 6
// 1237 =13
// 12375 =18
// 2 =2
// 23
// 237
// 2375
// 3....


// .
// .
// .
// .
// ..