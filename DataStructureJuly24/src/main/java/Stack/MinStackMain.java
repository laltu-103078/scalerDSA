package Stack;

public class MinStackMain {

    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(10);
        System.out.println("MIN = "+min.getMin());
        min.push(20);
        min.push(30);
        min.push(5);
        min.push(23);
        min.push(2);
        System.out.println("MIN = "+min.getMin());
        min.pop();
        min.pop();
        System.out.println("MIN = "+min.getMin());
        min.pop();
        min.pop();
        System.out.println("MIN = "+min.getMin());


    }
}
