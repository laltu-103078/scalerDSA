package DSAExam7Oct;

import java.util.Stack;

public class NextLargestToLeft {

    public static void main(String[] args) {
        int[] result = getNearestLargestElement(new int[]{12,23,2,1,10,4});
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" , ");
        }
    }

    public static int[] getNearestLargestElement(int[] input){
        int n = input.length;
        int[] result = new int[n];
        Stack<Integer> arrStack = new Stack<>();
        int i=0;
        while(i<n){
            while(!arrStack.isEmpty() && arrStack.peek()<=input[i]){
                if(input[i]>=arrStack.peek()){
                    arrStack.pop();
                }
            }
            result[i] = !arrStack.isEmpty() ? arrStack.peek() : -1;
            arrStack.push(input[i]);
            i++;
        }
        return result;
    }
}
