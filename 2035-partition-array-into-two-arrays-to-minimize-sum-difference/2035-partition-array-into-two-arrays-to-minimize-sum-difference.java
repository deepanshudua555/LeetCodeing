
class Solution {
    public int minimumDifference(int[] nums) {
        int n = nums.length;
        int t = 0;
        for(int i : nums) t += i;
        HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
        for(int i = 0; i < (1 << (n/2)); i++){
            int sum = 0;
            int cnt = 0;
            int j = i;
            int set = 0;
            while(j > 0){
                if((j & 1) == 1){
                    sum += nums[cnt];
                    set++;
                }
                cnt++;
                j >>= 1;
            }
            if(!map.containsKey(set)) map.put(set, new TreeSet<>());
            map.get(set).add(sum);
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < (1 << (n/2)); i++){
            int sum = 0;
            int cnt = (n/2);
            int j = i;
            int set = 0;
            while(j > 0){
                if((j & 1) == 1){
                    sum += nums[cnt];
                    set++;
                }
                cnt++;
                j >>= 1;
            }
            TreeSet<Integer> searchSpace = map.get((n/2) - set);
            int d = (t/2) - sum;
            Integer left = searchSpace.floor(d);
            if(left != null) res = Math.min(res, Math.abs(t - 2 * (left + sum)));
            Integer right = searchSpace.ceiling(d);
            if(right != null) res = Math.min(res, Math.abs(t - 2 * (right + sum)));
            if(res == 0) return 0;
        }
        return res;
    }
}