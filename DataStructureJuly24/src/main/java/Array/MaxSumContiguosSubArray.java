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

    public static void main(String[] args) {
        int[] input = new int[]{0,0,-1,0};
        System.out.println(maxSubArray(input));
        int[] output = getMaxSubArray(input);
        System.out.println("==============");
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
        System.out.println("==============");
    }

    public static int maxSubArray(final int[] A) {
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

    public static int[] getMaxSubArray(final int[] A) {
        int curr_st_idx = 0;
        int curr_end_idx = 0;
        int max_st_idx = 0;
        int max_end_idx = 0;
        int max_sum = A[0];
        int n = A.length;
        //max_sum = A[0];
        int curr_max = 0;
        System.out.println("max_st_idx = "+ max_st_idx+" max_end_idx = "+max_end_idx);
        for(int i=0;i<n;i++){
            System.out.println(" i = "+i);
            System.out.println("max_st_idx = "+ max_st_idx+" max_end_idx = "+max_end_idx);
            curr_max += A[i];
            curr_end_idx = i;
            if(curr_max >= max_sum){
                max_sum = curr_max;
                max_st_idx = curr_st_idx;
                max_end_idx = curr_end_idx;
            }
            if(curr_max < 0){
                curr_max = 0;
                curr_st_idx = i+1;
            }
        }
        int[] result = new int[max_end_idx-max_st_idx+1];
        System.out.println("result +"+result.length);
        int i =0;
        while(i<result.length){
            System.out.println("i ="+i+" max_st_idx+i = "+ max_st_idx+i);
            result[i] = A[max_st_idx+i];
            i++;
        }
        return result;
    }
}
