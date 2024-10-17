package Stack;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        int[] result = getStockSpan(new int[]{100,90,80,120,140,20,30,40});
        int i = 0;
        while(i< result.length){
            System.out.println(result[i]);
            i++;
        }
    }

    public static int[] getStockSpan(int[] dayWiseSharePrice){
        int n = dayWiseSharePrice.length;
        Stack<Integer> maxStack = new Stack<>();
        int[] result = new int[n];
        int i = 0;
        while (i<n){
            while( !maxStack.isEmpty() && dayWiseSharePrice[maxStack.peek()] < dayWiseSharePrice[i]){
                maxStack.pop();
            }
            result[i] = maxStack.isEmpty() ? i+1 : i-maxStack.peek();
            maxStack.push(i);
            i++;
        }
        System.out.println("result = "+result.length);
        return result;
    }
}
