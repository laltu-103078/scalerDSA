package DSAExam7Oct;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        try{
            System.out.println(removeAdjacentDuplicate("abbaca"));
        }catch (Exception err){
            System.out.print("StackTrace :: "+err.getStackTrace()+" message "+err.getMessage());
        }
    }

    public static String removeAdjacentDuplicate(String input){
        int n = input.length();
        Stack<Character> chStack = new Stack<>();
        int i = 0;
        while(i < n){
            if(chStack.isEmpty() || input.charAt(i) != chStack.peek()){
                chStack.push(input.charAt(i));
            }
            else{
                chStack.pop();
            }
            i++;
        }

        String result = "";
        while(!chStack.isEmpty()){
            result = chStack.pop() + result;
        }
        return result;
    }
}
