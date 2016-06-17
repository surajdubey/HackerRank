package datastructures.linkedlists;

public class LinkedListOperations {

    class Node {

        int data;
        Node next;
    }

    // This is a "method-only" submission. 
    void Print(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    /*
    Insert Node at the end of a linked list 
    head pointer input could be NULL as well for empty list  
     */
    Node InsertAtTail(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;

        //if head is null, make this node as head and return it
        if (head == null) {
            head = newNode;
            return head;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            //insert it at the end of currentNode
            currentNode.next = newNode;
            return head;
        }
    }

    Node InsertAtHead(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    /*
    Insert Node at a given position in a linked list 
    head can be NULL 
    First element in the linked list is at position 0
    Node is defined as 
     */
    Node InsertNth(Node head, int data, int position) {
        int nextPosition = 1;
        Node newNode = new Node();
        newNode.data = data;
        Node currentNode = head;

        if (position == 0) {
            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
        } else {
            while (nextPosition < position) {
                currentNode = currentNode.next;
                nextPosition++;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        return head;
    }

    Node Delete(Node head, int position) {
        if (position == 0) {
            if (head != null) {
                head = head.next;
            }
        } else {
            Node currentNode = head;
            int nextPosition = 1;

            //visit node previous to node at current position
            while (nextPosition < position) {
                currentNode = currentNode.next;
                nextPosition++;
            }

            Node nodeToDelete = currentNode.next;
            currentNode.next = nodeToDelete.next;
        }
        return head;
    }

    void ReversePrint(Node head) {
        java.util.Stack<Node> stack = new java.util.Stack<>();

        if (head != null) {
            Node currentNode = head;

            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.next;
            }

            while (!stack.isEmpty()) {
                System.out.println((stack.pop()).data);
            }
        }
    }

    /**
     * return 1 if 2 linked lists are equal otherwise return 0
     */
    int CompareLists(Node headA, Node headB) {
        int EQUAL = 1, NOT_EQUAL = 0;

        if (headA == null && headB == null) {
            return EQUAL;
        }

        Node currentNodeA = headA;
        Node currentNodeB = headB;
        while (currentNodeA != null) {
            if (currentNodeB == null) {
                return NOT_EQUAL;
            }

            if (currentNodeA.data != currentNodeB.data) {
                return NOT_EQUAL;
            }

            currentNodeA = currentNodeA.next;
            currentNodeB = currentNodeB.next;
        }

        if (currentNodeB != null) {
            return NOT_EQUAL;
        }

        return EQUAL;
    }
    
    Node RemoveDuplicate(Node head) {
        Node currentNode = head;
        if(head != null) {
            while(currentNode != null) {
                Node nextNode = currentNode.next;
                if(nextNode != null && nextNode.data == currentNode.data) {
                    //remove nextNode
                    currentNode.next = nextNode.next;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }
        
        return head;
    }
    
    /*
    Reverse a linked list and return pointer to the head
    The input list will have at least one element  
    */
    Node newHead;
    Node Reverse(Node head) {
        
        if(head == null) {
            return null;
        }
        
        Reverse(head.next);
        
        if(newHead == null) {
            newHead = new Node();
            newHead.data = head.data;
        } else {
            Node newNode = new Node();
            newNode.data = head.data;
            
            Node currentNode = newHead;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
 
        return newHead;
    } 
    
    /*
    Get Nth element from the end in a linked list of integers
    Number of elements in the list will always be greater than N.
    */
    int GetNode(Node head, int n) {
        Node pointer = head;        
        int pointerPosition = 0;

        while (head.next != null){
            head = head.next;
            if (pointerPosition < n){
                pointerPosition++;
            }else {
                pointer = pointer.next;
            }
        }

        return pointer.data;
    }
    /*
    Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
    */
    
    boolean hasCycle(Node head) {
        
        if(head == null) {
            return false;
        }

        Node slowPointer = head;
        Node fastPointer = head.next;

        while(slowPointer != null && fastPointer != null) {
            if(slowPointer == fastPointer) {
                return true;
            }

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
            if(fastPointer != null) {
                fastPointer = fastPointer.next;
            }

        } 
        
        return false;
    }
}
