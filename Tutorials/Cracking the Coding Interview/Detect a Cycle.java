/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    //My code starts
    if (head == null)
    {
        return false;
    }
    Node front = head.next;
    while (head != front)
    {
        if (front == null || front.next == null)
        {
            return false;
        }
        
        head = head.next;
        front = front.next.next;
    }
    return true;
    //My code ends
}