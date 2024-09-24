package Array;

/**
 * Find the maximum sum of contiguous non-empty subarray within an array A of length N.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 1e6
 * -1000 <= A[i] <= 1000
 *
 *
 *
 * Input Format
 * The first and the only argument contains an integer array, A.
 *
 *
 *
 * Output Format
 * Return an integer representing the maximum possible sum of the contiguous subarray.
 */
public class MaxSumContiguosSubArray {

    public int maxSubArray(final int[] A) {
        int max_sum = A[0];
        int n = A.length;
        //max_sum = A[0];
        int curr_max = 0;
        for(int i=0;i<n;i++){
            curr_max += A[i];
            if(curr_max > max_sum){
                max_sum = curr_max;
            }
            if(curr_max < 0){
                curr_max = 0;
            }
        }
        return max_sum;
    }
}
