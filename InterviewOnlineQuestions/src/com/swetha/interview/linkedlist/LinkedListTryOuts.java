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
	
	public NodeSL findMidElementOfLinkedList(NodeSL node) throws Exception{
		NodeSL midNode = null;
		if(node == null){
			throw new Exception("Invalid input");
		}
		midNode = node;
		
		
		
		return midNode;
	}

}
