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
        Node newNodeToMerge = new Node();
        Node newHead = null;
        Node currentNodeA = headA;
        Node currentNodeB = headB;
        
        //set up head node of merged list
        if(currentNodeA == null) {
            if(currentNodeB == null) {
                return null;
            } else {
                newHead = new Node();
                newHead.data = currentNodeB.data;
                currentNodeB = currentNodeB.next;
                newNodeToMerge = newHead;
            }
        } else if(currentNodeB == null) {
            newHead = new Node();
            newHead.data = currentNodeA.data;
            currentNodeA = currentNodeA.next;
            newNodeToMerge = newHead;
        }
        

        //set the head
        while(true) {

            if(currentNodeA == null) {
                while(currentNodeB != null) {
                    Node newNode = new Node();                    
                    newNode.data = currentNodeB.data;
                    currentNodeB = currentNodeB.next;
                    if(newHead == null) {
                        newHead = newNode;
                        newNodeToMerge = newNode;
                    } else {
                        newNodeToMerge.next = newNode;                    
                    }
                    newNodeToMerge = newNodeToMerge.next;
                }
                break;
            }
            
            if(currentNodeB == null) {
                while(currentNodeA != null) {
                    Node newNode = new Node();                    
                    newNode.data = currentNodeA.data;
                    currentNodeA = currentNodeA.next;
                    if(newHead == null) {
                        newHead = newNode;
                        newNodeToMerge = newNode;
                    } else {
                        newNodeToMerge.next = newNode;
                    
                    }
                    newNodeToMerge = newNodeToMerge.next;
                }
                break;
            }
            
            Node newNode = new Node();
            if(currentNodeA.data > currentNodeB.data) {
                
                newNode.data = currentNodeB.data;
                currentNodeB = currentNodeB.next;
                
            } else {
                newNode.data = currentNodeA.data;
                currentNodeA = currentNodeA.next;
            }
            
            if(newHead == null) {
                newHead = newNode;
                        newNodeToMerge = newNode;
            }
            else {
                newNodeToMerge.next = newNode;
            }
            newNodeToMerge = newNodeToMerge.next;

        }
        
        return newHead;
    }
}
