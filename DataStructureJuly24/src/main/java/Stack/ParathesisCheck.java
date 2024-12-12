package Stack;

import java.util.Stack;

public class ParathesisCheck {

    public static void main(String[] args) {
        System.out.println(checkParathesis("{{{[[[((()))]]]}}}"));
    }

    public static boolean checkParathesis(String input){
        Stack<Character> tstack = new Stack<>();
        char ch = '{';
        char ch1 = '}';
        char ch2 = '[';
        char ch3 = ']';
        char ch4 = '(';
        char ch5 = ')';
        for(Character c : input.toCharArray()){
            if(tstack.isEmpty()){
                tstack.push(c);
            }
            else{
                char curr = tstack.peek();
                if(c == ch || c == ch2 || c == ch4){
                    tstack.push(c);
                }
                else if(c == ch1 && curr == ch){
                    tstack.pop();
                }
                else if(c == ch3 && curr == ch2){
                    tstack.pop();
                }
                else if(c == ch5 && curr == ch4){
                    tstack.pop();
                }
                else{
                    return false;
                }

            }
        }
        return tstack.isEmpty();
    }
}
