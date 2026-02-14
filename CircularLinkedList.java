package Linked_List;

public class CircularLinkedList {
    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            newNode.next = newNode;
        }
        else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            newNode.next = newNode;
        }
        else{
            tail.next = newNode;
            newNode.next = head;
            tail=newNode;
        }
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
        } else if (head.next == null) {
            head =tail= null;
        }
        else{
            Node temp = head;
            head = head.next;
            tail.next = head;
            temp.next = null;
        }
    }
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
        } else if (head.next == null) {
            head =tail= null;
        }
        else{
            Node temp = head;
            while(temp.next!=tail){
                temp= temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }
    public void printList(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        while (temp.next!=head);
        System.out.print(head.data);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cc = new CircularLinkedList();
        cc.addFirst(1);
        cc.addFirst(0);
        cc.addLast(2);
        cc.addLast(3);
        cc.printList();
        cc.removeLast();
        cc.removeFirst();
        cc.printList();
    }
}
