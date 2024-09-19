package alok.linkedlist;

import java.util.Scanner;

public class LinkedList {
    public static  Node takeInput(){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        Node head = null,tail = null;
        while (value != -1){
            Node node = new Node(value);
            if(head == null){
                head = node;
                tail = node;
            }else {
                tail.next = node;
                tail = tail.next;
            }
            value = in.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node head){
        while (head != null){
            System.out.print(head.data + "-> ");
            head = head.next;
        }
    }

    public static Node reverseLinkedList(Node head){
        if (head.next == null){
            return head;
        }

        Node reversed = reverseLinkedList(head.next);
        Node temp = reversed;
        while (reversed.next != null){
            reversed = reversed.next;
        }
        head.next = null;
        reversed.next = head;
        return temp;
    }

    public static void main(String[] args) {
        Node head = takeInput();
        printLinkedList(head);
        System.out.println();
        head = reverseLinkedList(head);
        printLinkedList(head);
    }
}
