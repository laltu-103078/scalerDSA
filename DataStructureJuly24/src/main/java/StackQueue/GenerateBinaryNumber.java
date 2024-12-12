package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {

    public static void main(String[] args) {
    printBinary(4);
    }

    public static void printBinary(int n){
        int i=1;
        Queue<String> binaryQueue = new LinkedList<>();
        binaryQueue.add("1");
        while(i<=n){
            String top = binaryQueue.remove();
            System.out.println(top);
            binaryQueue.add(top+"0");
            binaryQueue.add(top+"1");
            i++;
        }

    }
}
