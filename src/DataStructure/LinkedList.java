package DataStructure;

public class LinkedList {
    public static void main(String[] args) {

        // arr = { 2, 6, 8, 12, 45 }
        // adding and removing is tedious

        Node Head = new Node(2); // (2)
        Node Node1 = new Node(6);  // (2)  (6)
        Head.setNext(Node1); // (2)->(6)

        Node Node2 = new Node(8); // (2)->(6)   (8)
        Node1.setNext(Node2);  // (2)->(6)->(8)

        printLL(Head);  // (2)->(6)->(8)

        int val = 12;
        addVal(Head, val);

        printLL(Head); // (2)->(6)->(8)->(12)
    }

    private static void addVal(Node head, int val) {
        Node newNode = new Node(val);

    }

    private static void printLL(Node head) {
        System.out.print("The linked list: (" + head.getValue()+")"); // (2)
        Node currentNode = head; // (2)
        while(currentNode.getNext()!=null){ // (6), (8), null
            System.out.print("->("+currentNode.getNext().getValue()+")"); // ->(6)->(8)
            currentNode = currentNode.getNext(); // (6), (8)
        }
        System.out.println();
    }
}
