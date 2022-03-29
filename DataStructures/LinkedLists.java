// Creation date: Thu Nov  8 22:10:32 EST 2012
// Last modified: Thu Nov  8 22:10:32 EST 2012
// Compiler: javac
//  Author: Rajat Rai
//  Description: Create a link List and add elements to it, also performs traversal

public class LinkedLists {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args)
    {
            LinkedLists llist = new LinkedLists();
            llist.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);

            llist.head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next=null;


        llist.printList();
    
}
}
