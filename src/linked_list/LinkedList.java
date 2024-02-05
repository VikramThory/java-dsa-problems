package linked_list;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.length++;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.length++;
            return;
        }

        Node temp = this.head;
        this.head = newNode;
        this.head.next = temp;
        this.length++;
    }

    public void removeFirst() {
        if (this.length == 0) return;

        Node tempNode = this.head.next;
        this.head = null;
        this.head = tempNode;
        this.length--;
    }

    public void removeLast() {
        if (this.length == 0) return;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
            return;
        }

        Node temp = this.head;
        Node pre = this.head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        this.length--;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int getHead() {
        return this.head.value;
    }

    public int getTail() {
        return this.tail.value;
    }

    public int getSize() {
        return this.length;
    }
}
