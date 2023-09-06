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
        Node currentNode = Head; // (2)
        while(currentNode.getNext().getValue()<newNode.getValue()){ // 2->6->7   ->8
            currentNode = currentNode.getNext();
        }
        Node nextNode = currentNode.getNext();
        currentNode.setNext(newNode);
        newNode.setNext(nextNode);
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
