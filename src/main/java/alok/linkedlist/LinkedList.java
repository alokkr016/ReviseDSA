package alok.linkedlist;

import java.security.PublicKey;
import java.util.Scanner;

public class LinkedList {
    public static Node takeInput() {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        Node head = null, tail = null;
        while (value != -1) {
            Node node = new Node(value);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
            value = in.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + "-> ");
            head = head.next;
        }
    }

    public static Node reverseLinkedList(Node head) {
        if (head.next == null) {
            return head;
        }

        Node reversed = reverseLinkedList(head.next);
        Node temp = reversed;
        while (reversed.next != null) {
            reversed = reversed.next;
        }
        head.next = null;
        reversed.next = head;
        return temp;
    }

    public static Node reverseLinkedListOptimised(Node head) {
        if (head.next == null) {
            return head;
        }

        Node reversed = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }

    public static void main(String[] args) {
        Node head = takeInput();
//        Node head2 = takeInput();
//        Node finalHead = mergeTwoSortedLL(head1, head2);
//        printLinkedList(finalHead);
        head = removerAlternateNode(head);
         printLinkedList(head);
//        System.out.println();
//        head = reverseLinkedListOptimised(head);
//        printLinkedList(head);
    }

    private static Node mergeTwoSortedLL(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node head = null;
        Node tail = head;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                if (head == null) {
                    head = head1;
                    tail = head1;
                } else {
                    tail.next = head1;
                    tail = tail.next;
                }
                head1 = head1.next;
            } else {
                if (head == null) {
                    head = head2;
                    tail = head2;
                } else {
                    tail.next = head2;
                    tail = tail.next;
                }
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            tail.next = head1;
            head1 = head1.next;
            tail = tail.next;
        }

        while (head2 != null) {
            tail.next = head2;
            head2 = head2.next;
            tail = tail.next;
        }

        return head;
    }


    public static Node reverseLLUsingLoop(Node head){
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node removerAlternateNode(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node current = head;
        while (current != null && current.next != null){
            current.next = current.next.next;
            current = current.next;
        }

        return head;
    }

}
