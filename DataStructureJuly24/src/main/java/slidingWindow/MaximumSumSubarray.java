package slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumSumSubarray {



    public static List<Integer> getMaximumOfSubArray(int[] input, int k){
        int i,j;
        List<Integer> result = new ArrayList<>();
        i=0;
        j=0;
        int n = input.length;
        int windowMax = Integer.MIN_VALUE;
        Queue<Integer> maxQueue = new LinkedList<>();
        while(j<n){
            if(maxQueue.isEmpty()){
                maxQueue.add(input[j]);
            }
            else if(maxQueue.peek() < input[j]){
                while(!maxQueue.isEmpty() && maxQueue.peek()<input[j]){
                    maxQueue.remove();
                }
                maxQueue.add(input[j]);
            } else if (maxQueue.peek() >= input[j]) {
                maxQueue.add(input[j]);
            }
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                result.add(maxQueue.peek());
                if(maxQueue.peek() == input[i]){
                    maxQueue.remove();
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArr = {1,3,-1,2,0,5,1,6,7};
        List<Integer> result = getMaximumOfSubArray(inputArr,3);
        int i=0;
        while(i<result.size()){
            System.out.println(result.get(i));
            i++;
        }
    }
}
