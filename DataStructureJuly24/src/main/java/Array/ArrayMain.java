package Array;

public class ArrayMain {

    public static void main(String[] args) {
        int[] arr = {15,3,15,6,9,14,8,9,10,17};
        int b = 1;
        int ind = solve(arr,b);
        System.out.println(ind);
    }

    /*
    Find the maximum sum of contiguous non-empty subarray within an array A of length N.
     */
    public int maxSubArray(final int[] A) {
        int curr_sum=0;
        int max_sum=A[0];
        for(int i=0;i<A.length;i++){
            curr_sum += A[i];
            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }
            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    /*
    You are given an integer array A of length N.
    You have to find the sum of all subarray sums of A.
    More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting
    zero or more elements from either end of the array.
    A subarray sum denotes the sum of all the elements of that subarray.

    Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
     */

    public long getTotalSubarraySum(int[] A){
        long length = A.length;
        long sum = 0;
        long ele;
        long freq;
        for(int i=0;i<A.length;i++){
            ele = A[i];
            freq = (i+1)*(length-i);
            sum += ele*freq;
        }
        return sum;
    }

    /**
     * Given an array A of size N, find the subarray of size B with the least average.
     * @param A
     * @param B
     * @return
     */
    public static int solve(int[] A, int B) {
        int n = A.length;
        int s,index,minSum=0,windowSum;
        for(int i=0;i<B;i++){
            minSum += A[i];
        }
        s = 0;
        index=0;
        windowSum = minSum;
        System.out.println("minSum "+minSum);
        while(s+B<n){
            windowSum = windowSum - A[s] + A[s+B];
            System.out.println("=================");
            System.out.println("i="+s+" index = "+index);
            System.out.println("tempSum "+windowSum);
            System.out.println("minSum "+minSum);
            System.out.println("=====================");
            if(windowSum < minSum){
                minSum = windowSum;
                index = s+1;
            }
            s++;
        }
        return index;
    }

}
