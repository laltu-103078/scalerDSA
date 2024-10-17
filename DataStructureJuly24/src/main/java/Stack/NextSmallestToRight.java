package Stack;

import java.util.Stack;

public class NextSmallestToRight {

    public static void main(String[] args) {
        int[] result = getNextSmallestToRight(new int[]{12,20,2,4,6,90});
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        System.out.println("=========================");
        result = getNextSmallestToLeft(new int[]{12,20,2,4,6,90});
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
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
}
