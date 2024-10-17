package DSAExam7Oct;

import java.awt.desktop.SystemEventListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class VerticalTreeSum {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(12);
        TreeNode node3 = new TreeNode(32);
        TreeNode node4 = new TreeNode(10);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(67);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(20);
        TreeNode node9 = new TreeNode(54);
        node1.leftNode= node2;
        node1.rightNode= node3;
        node2.leftNode= node4;
        node2.rightNode= node5;
        node3.leftNode= node6;
        node3.rightNode= node7;
        node4.leftNode= node8;
        node4.rightNode= node9;
        int[] result = getVerticalSumOfTree(node1);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] getVerticalSumOfTree(TreeNode rootNode){
        Queue<TreeNodeData> treeQueue = new LinkedList<>();
        treeQueue.add(new TreeNodeData(rootNode,0));
        Map<Integer,Integer> verticalSumMap = new HashMap<>();
        int maxVertical=0;
        int minVertical=0;
        while(!treeQueue.isEmpty()){
            TreeNodeData temp = treeQueue.poll();
            maxVertical = temp.vertical > maxVertical ? temp.vertical : maxVertical;
            minVertical = temp.vertical < minVertical ? temp.vertical : minVertical;
            if(verticalSumMap.get(temp.vertical) == null){
                verticalSumMap.put(temp.vertical,temp.node.val);
            }
            else{
                verticalSumMap.put(temp.vertical,verticalSumMap.get(temp.vertical)+temp.node.val);
            }
            if(temp.node.leftNode != null){
                treeQueue.add(new TreeNodeData(temp.node.leftNode,temp.vertical-1));
            }
            if(temp.node.rightNode != null){
                treeQueue.add(new TreeNodeData(temp.node.rightNode,temp.vertical+1));
            }
        }
        int[] result = new int[maxVertical - minVertical + 1];
        int i =0;
        int index = minVertical;
        while(i<result.length){
            result[i] = verticalSumMap.get(index);
            i++;
            index++;
        }
        return result;
    }



    static class TreeNodeData{
        TreeNode node;
        int vertical;
        TreeNodeData(TreeNode node, int vertical){
            this.node = node;
            this.vertical = vertical;
        }
    }


    static class TreeNode{

        int val;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int val){
            this.val = val;
        }
    }
}
