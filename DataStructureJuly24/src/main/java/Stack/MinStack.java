package Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> minSt = new Stack<>();
    int min_ele = Integer.MAX_VALUE;

    public void push(int ele){
        if(minSt.isEmpty()){
            minSt.push(ele);
            min_ele = ele;
        }
        else if(ele >= min_ele){
            minSt.push(ele);
        }
        else{
            int flag = 2*ele - min_ele;
            minSt.push(flag);
            min_ele = ele;
        }
    }

    public int pop(){
        int currTop = minSt.pop();
        if(currTop < min_ele){
            int prevMin = min_ele;
            min_ele = 2*min_ele-currTop;
            return prevMin;
        }
        return currTop;
    }

    public int top(){
        int currTop = minSt.peek();
        if(currTop < min_ele){
            return min_ele;
        }
        return currTop;
    }

    public int getMin(){
        if(minSt.isEmpty()){
            return -1;
        }
        return min_ele;
    }

}
