class Solution {
    public int singleNumber(int A[]) {
        int n = A.length;
    int result = 0;
    for (int i = 0; i<n; i++)
    {
		result ^=A[i];
    }
	return result;
}
}