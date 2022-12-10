class Solution {
    public int subtractProductAndSum(int n) {
        int digits  = 1;
        int sum = 0;
        while(n!=0){
            digits *= n%10; // n % 10  - get last number
            sum += n%10;
            n /= 10; // remove last number from 'n'
        }
        
        return digits-sum;
    }
}