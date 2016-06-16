/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlists;

/**
 *
 * @author suraj
 */
public class MergeSortedLinkedLists {
    // This is a "method-only" submission. 
    // You only need to complete this method 

    class Node {
       int data;
       Node next;
    }

    /*
    Merge two linked lists 
    head pointer input could be NULL as well for empty list
    Node is defined as
    */

    Node MergeLists(Node headA, Node headB) {
        Node newHead = new Node();
        Node currentNodeA = headA;
        Node currentNodeB = headB;
        
        Node currentNewNode = new Node();
        if(currentNodeA == null && currentNodeB == null) {
            return null;
        }
        
        while(true) {
            if(currentNodeA == null) {
                //copy all data of list B
                while(currentNodeB != null) {
                    Node newNode = new Node();
                    newNode.data = currentNodeB.data;
                    currentNewNode = newNode;
                    currentNodeB = currentNodeB.next;
                }
                break;
            } else if(currentNodeB == null) {
                //copy all data of list A
                while(currentNodeA != null) {
                    Node newNode = new Node();
                    newNode.data = currentNodeA.data;
                    currentNewNode = newNode;
                    currentNodeA = currentNodeA.next;
                }
                break;
            
            } else {
                Node newNode = new Node();
                   
                if(currentNodeA.data > currentNodeB.data) {
                    newNode.data = currentNodeB.data;
                    currentNodeB = currentNodeB.next;
                    
                } else {
                    newNode.data = currentNodeA.data;
                    currentNodeA = currentNodeA.next;
                }

            }
        }

        while(true) {
            if(currentNodeA == null && currentNodeB == null) {
                break;
            }
        }
        
        return newHead;
    }
}
