package StackQueue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> primaryStack = new Stack<>();
    Stack<Integer> helperStack = new Stack<>();

    public void enqueue(int val){
        while(!primaryStack.isEmpty()){
            helperStack.push(primaryStack.pop());
        }
        primaryStack.push(val);
        while(!helperStack.isEmpty()){
            primaryStack.push(helperStack.pop());
        }
    }

    public int dequeue(){
        if(!primaryStack.isEmpty()){
            return primaryStack.pop();
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        QueueUsingStack st = new QueueUsingStack();
        st.enqueue(21);
        st.enqueue(100);
        st.enqueue(98);
        st.enqueue(24);
        st.enqueue(20);
        st.enqueue(32);
        st.enqueue(1);
        System.out.println(st.dequeue());
        System.out.println(st.dequeue());
        System.out.println(st.dequeue());
        System.out.println(st.dequeue());
        System.out.println(st.dequeue());

    }
}
