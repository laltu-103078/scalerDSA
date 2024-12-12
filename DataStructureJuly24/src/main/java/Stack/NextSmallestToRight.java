package Stack;

import java.util.Map;
import java.util.Stack;

public class NextSmallestToRight {

    public static void main(String[] args) {
        int[] input = new int[]{12,20,8,2,6,90};
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+",");
        }
        System.out.println();
        System.out.println("=========================");
        int[] result = getNextSmallestToRight(input);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
        System.out.println();
        System.out.println("=========================");
        result = getNextSmallestToLeft(input);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }

        System.out.println();
        System.out.println("=========================");
        result = getNextSmallestToRightIndex(input);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
    }

    public static int[] getNextSmallestToRight(int[] input){
        int n = input.length;
        int i = n-1;
        Stack<Integer> minStack = new Stack<>();
        int[] result = new int[n];
        while(i>=0){
            while(!minStack.isEmpty() && minStack.peek() >= input[i]){
                minStack.pop();
            }
            result[i] = minStack.isEmpty() ? -1 : minStack.peek();
            minStack.push(input[i]);
            i--;
        }
        return result;
    }

    public static int[] getNextSmallestToLeft(int[] input){
        int n = input.length;
        int i = 0;
        Stack<Integer> minStack = new Stack<>();
        int[] result = new int[n];
        while(i<n){
            while(!minStack.isEmpty() && minStack.peek() >= input[i]){
                minStack.pop();
            }
            result[i] = minStack.isEmpty() ? -1 : minStack.peek();
            minStack.push(input[i]);
            i++;
        }
        return result;
    }

    public static int[] getNextSmallestToRightIndex(int[] input){
        int n = input.length;
        Stack<Integer> nsrStack = new Stack<>();
        int i = n-1;
        int[] result = new int[n];
        while(i>=0){
            while(!nsrStack.isEmpty() && input[nsrStack.peek()] > input[i]){
                nsrStack.pop();
            }
            if(nsrStack.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = nsrStack.peek();
            }
            nsrStack.push(i);
            i--;
        }
        return result;
    }

}
