// Complete the insertNodeAtPosition function below.

/*
    * For your reference:
    *
    * SinglyLinkedListNode {
    *     int data;
    *     SinglyLinkedListNode next;
    * }
    *
    */
static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    //My code starts
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    if (position == 0)
    {
        newNode.next = head;
        return newNode;
    }
    SinglyLinkedListNode curr = head;
    for(int i=1; i<position; i++)
    {
        curr = curr.next;
    }
    newNode.next = curr.next;
    curr.next = newNode;
    return head;
    //My code ends
}

