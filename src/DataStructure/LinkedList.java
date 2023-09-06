package DataStructure;

public class LinkedList {
    private Node Head;

    public LinkedList(){
        Head = null;
    }

    public LinkedList(int val) {
        Node node = new Node(val);
        Head = node;
    }

    public Node getHead() {
        return Head;
    }

    public void setHead(Node head) {
        Head = head;
    }

    public void addValAtLast(int val) {
        Node newNode = new Node(val);
        Node currentNode = Head; // (2)
        while(currentNode.getNext()!=null){ // (6), (8), null
            currentNode = currentNode.getNext(); // (6), (8)
        }

        currentNode.setNext(newNode);
    }

    public void addValSorted(int val) {
        Node newNode = new Node(val);  // 7
        if(val<Head.getValue()){
            Node prevHead = Head;
            Head = newNode;
            Head.setNext(prevHead);
            return;
        }
        Node currentNode = Head; // (2)
        Node prevNode = null;
        while(currentNode.getValue()<val){ // 2->3->7
            if(currentNode.getNext()==null){
                currentNode.setNext(newNode);
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        prevNode.setNext(newNode);
        newNode.setNext(currentNode);
    }

    public void printLL() {
        System.out.print("The linked list: (" + Head.getValue()+")"); // (2)
        Node currentNode = Head; // (2)
        while(currentNode.getNext()!=null){ // (6), (8), null
            System.out.print("->("+currentNode.getNext().getValue()+")"); // ->(6)->(8)
            currentNode = currentNode.getNext(); // (6), (8)
        }
        System.out.println();
    }
}
