//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    
    static int f(int idx, int w, int wt[], int val[],Integer dp[][]){
        
        if(idx==0){
            if(wt[0]<=w){
                return val[0];
            }
            else return 0;
        }
        if(dp[idx][w]!=null)return dp[idx][w];
        int notTake = 0+f(idx-1, w, wt, val,dp);
        
        int take = Integer.MIN_VALUE;
        if(wt[idx]<=w){
            take = val[idx]+f(idx-1, w-wt[idx], wt,val,dp);
        }
        
        return dp[idx][w] = Math.max(take, notTake);
    }
    
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here 
         Integer dp[][] = new Integer[n][w+1];
         return f(n-1, w, wt, val,dp);
    } 
}


