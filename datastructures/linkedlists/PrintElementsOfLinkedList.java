package datastructures.linkedlists;

public class PrintElementsOfLinkedList {
    
    class Node {
        int data;
        Node next;
    }
    
    // This is a "method-only" submission. 
    void Print(Node head) {
       Node currentNode = head;
       while(currentNode != null) {
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
        if(head == null) {
            head = newNode;
            return head;
        }
        else {
            Node currentNode = head;
            while(currentNode.next != null) {
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

        if(head == null) {
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

        if(position == 0) {
            if(head != null) {
                newNode.next = head;
            } 
            head = newNode;
        }
        else {
            while(nextPosition < position) {
                currentNode = currentNode.next;
                nextPosition ++;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        return head;
    }

    Node Delete(Node head, int position) {
        if(position == 0) {
            if(head!=null) {
                head = head.next;
            }
        } else {
            Node currentNode = head;
            int nextPosition = 1;
            
            //visit node previous to node at current position
            while(nextPosition < position) {
                currentNode = currentNode.next;
                nextPosition ++;
            }
            
            Node nodeToDelete = currentNode.next;
            currentNode.next = nodeToDelete.next;
        }
        return head;
    }
    
    void ReversePrint(Node head) {
        java.util.Stack<Node> stack = new java.util.Stack<>();
        
        if(head != null) {
            Node currentNode = head;

            while(currentNode!=null) {
                stack.push(currentNode);
                currentNode = currentNode.next;
            }

            while(!stack.isEmpty()) {
                System.out.println((stack.pop()).data);
            }
        }
    }
    
    /**
     * return 1 if 2 linked lists are equal
     * otherwise return 0
     */
    int CompareLists(Node headA, Node headB) {
        int EQUAL = 1, NOT_EQUAL = 0;
        
        if(headA == null && headB == null) {
            return EQUAL;
        }
        
        Node currentNodeA = headA;
        Node currentNodeB = headB;
        while(currentNodeA != null) {
            if(currentNodeB == null) {
                return NOT_EQUAL;
            }
            
            if(currentNodeA.data != currentNodeB.data) {
                return NOT_EQUAL;
            }
            
            currentNodeA = currentNodeA.next;
            currentNodeB = currentNodeB.next;
        }
        
        if(currentNodeB!=null) {
            return NOT_EQUAL;
        }
        return EQUAL;
    }
}
