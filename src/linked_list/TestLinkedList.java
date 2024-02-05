package linked_list;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(3);
        myLinkedList.prepend(2);
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getSize());
        myLinkedList.removeLast();
        myLinkedList.printList();
    }
}
