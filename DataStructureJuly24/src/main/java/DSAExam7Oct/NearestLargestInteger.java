package DSAExam7Oct;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Find the nearest largest element in right from left to right.
 */
public class NearestLargestInteger {

    public static void main(String[] args) {
        int[] result = getNearestLargestElement(new int[]{23,21,21,3,4,5,100});
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" , ");
        }
    }
    public static int[] getNearestLargestElement(int[] input){
        int n = input.length;
        int[] result = new int[n];
        Stack<Integer> arrStack = new Stack<>();
        int i=n-1;
        while(i>=0){
            while(!arrStack.isEmpty() && arrStack.peek()<=input[i]){
                if(input[i]>=arrStack.peek()){
                    arrStack.pop();
                }
            }
            result[i] = !arrStack.isEmpty() ? arrStack.peek() : -1;
            arrStack.push(input[i]);
            i--;
        }
        return result;
    }

    /**
    ublic int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        int i = n-1;
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();

        while(i>=0){
            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
            hm.put(nums2[i],i);
            i--;
        }
        int[] result1 = new int[nums1.length];
        for(int j=0; j<nums1.length; j++){
            result1[j] = result[hm.get(nums1[j])];
        }
        return result1;
    }
     */


}
