// Complete the sortedInsert function below.

/*
    * For your reference:
    *
    * DoublyLinkedListNode {
    *     int data;
    *     DoublyLinkedListNode next;
    *     DoublyLinkedListNode prev;
    * }
    *
    */
static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
    //My code starts
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

    if (data < head.data)
    {
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    DoublyLinkedListNode curr = head;
    while(curr.next != null && curr.next.data < data)
    {
        curr = curr.next;
    }
    newNode.next = curr.next;
    curr.next = newNode;
    newNode.prev = curr;

    return head;
    //My code ends
}

