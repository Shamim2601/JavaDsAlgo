package DataStructure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");

        LinkedList LL1 = new LinkedList(3);
        LL1.addValSorted(7);
        LL1.addValSorted(5);  // 3->5->7
        LL1.addValSorted(2); // 2->3->5->7
        LL1.addValSorted(10); // 2->3->5->7->10
        LL1.printLL();



//        Node n1 = new Node(2);
//        Node n2 = new Node(9);
//        n2.setNext(n1);
//        n1.setNext(n2);
    }
}
