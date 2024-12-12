package LinkedList;

public class DesignLinkedList {
    Node root = null;
    int sizeOfLL = 0;

    public void insertNode(int val, int posi){
        if(posi==1){
            Node n = new Node(val);
            n.next = root;
            root = n;
            sizeOfLL++;
        }
        else if(posi >= 1 && posi <= sizeOfLL+1){
            int i = 1;
            Node cnode = root;
            while(i < posi-1){
                cnode = cnode.next;
                i++;
            }
            Node n = new Node(val);
            n.next = cnode.next;
            cnode.next = n;
            sizeOfLL++;
        }
    }

    public void deleteNode(int posi){
        if(posi == 1 ){
            Node n = root;
            root = n.next;
            n.next = null;
            n = null;
            sizeOfLL --;
        }
        else if(posi >= 1 && posi <= sizeOfLL){
            int i = 1;
            Node cnode = root;
            while(i < posi-1){
                cnode = cnode.next;
                i++;
            }
            Node targetNode = cnode.next;
            cnode.next = cnode.next.next;
            targetNode.next = null;
            targetNode = null;
            sizeOfLL --;
        }
    }

    public void printLL(){
        int i = 1;
        Node cnode = root;
        while(i<=sizeOfLL){
            System.out.println(cnode.value);
            cnode = cnode.next;
            i++;
        }
    }

}
