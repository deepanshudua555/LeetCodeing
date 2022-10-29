class Solution {
public:
    
    int destroyTargets(vector<int>& nums, int space) {
        sort(nums.begin(),nums.end());
         map<int,int>map;
        int max=-1;
        set<int>ans;   
        int min = INT_MAX;
        for(int i=0;i<nums.size();i++)
            {
                    int x = nums[i]/space;
                    x = nums[i]-x*space;
                    if(x==0) x=space;
                    map[x]++;                
            }
        
            for(auto i: map)
            {
                    if(i.second>max)
                            max = i.second;
            }
           
            for(auto i : map)
            {
                    if(i.second==max)
                            ans.insert(i.first);
            }
            
             for(int i=0;i<nums.size();i++)
            {
                    int Findd = nums[i]/space;
                    Findd = nums[i]-Findd*space;
                    if(Findd==0) Findd=space;
                   
                    if(ans.find(Findd)!=ans.end())
                    {
                            if(min>nums[i])
                                    min =nums[i];
                    }
                   
            }
            
            return(min);            
                    
            
        
    }
};