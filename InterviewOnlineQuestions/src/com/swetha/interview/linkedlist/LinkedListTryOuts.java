/**
 * 
 */
package com.swetha.interview.linkedlist;

import com.prakash.interview.bean.NodeSL;

/**
 * @author swvijaya
 *
 */
public class LinkedListTryOuts {

	/**
	 *  Write a function to get Nth node in a Linked List
	 * @param linkedList
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public NodeSL findNthNodeInLinkedList(NodeSL linkedList, int n) throws Exception{
		NodeSL nthNode = null;
		if(linkedList == null || n <= 0){
			throw new Exception("Invalid input");
		}
		
		while(linkedList != null && n >0){
			n = n-1;
			if(n == 0){
				nthNode = linkedList;
				break;
			}
			linkedList = linkedList.next();
			
		}
		if(n != 0 ){
			throw new Exception("index greater than size of linked list");
		}
		
		
		
		
		return nthNode;
	}
	
	/**
	 *  Print the middle of a given linked list
	 * @param node
	 * @return
	 * @throws Exception
	 */
	public NodeSL findMidElementOfLinkedList(NodeSL node) throws Exception{
		NodeSL midNode = null;
		if(node == null){
			throw new Exception("Invalid input");
		}
		midNode = node;
		int ticker = 0;
		while(node != null){
			
			if(ticker == 2){
				midNode = midNode.next();
				ticker = 0;
			}
			ticker++;
			node = node.next();
		}
		
		
		return midNode;
	}
	
	public NodeSL findNthElementFromEndOfLinkedList(NodeSL node, int n) throws Exception{
		NodeSL midNode = null;
		if(node == null || n == 0){
			throw new Exception("Invalid input");
		}
		midNode = node;
		
		while(node != null){
			
			if(n == 0){
				midNode = midNode.next();
				
			}else{
				n--;
			}
			
			node = node.next();
		}
		if(n != 0 || midNode == null){
			throw new Exception("n is bigger than size of the linked list");
		}
		
		
		return midNode;
	}
}
