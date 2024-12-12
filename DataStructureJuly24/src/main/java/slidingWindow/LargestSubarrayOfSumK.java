package slidingWindow;

public class LargestSubarrayOfSumK {

    public static void getLargestSubArray(int[] input, int k){
        int n = input.length;
        int startIndex=0, endIndex=0;
        int i=0,j=0;
        int sum = 0;
        while(j<n && i<n){
            sum += input[j];
            if(sum < k){
                j++;
            }
            else if(sum == k){
                if((j-i+1) > (endIndex-startIndex+1)){
                    startIndex = i;
                    endIndex = j;
                }
                j++;
            }
            else if(sum > k){
                sum = sum - input[i];
                i++;
                j++;
            }
        }
        System.out.println("StartIndex "+startIndex+ " EndIndex "+endIndex);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,1,2,5,0};
        getLargestSubArray(arr,5);
    }
}
