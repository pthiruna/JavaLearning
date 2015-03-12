package com.prakash.interview.cat.linkedlist;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;

public class NthNodeFromEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeSL objSL = TestDataGenerator.generateSingleLinkedList(10);
		getNthNodeFromEnd(objSL,11);

	}
	
	
	public static void getNthNodeFromEnd(NodeSL node, int nthNode) {
		
		Utilities.printSingleLinkedList(node, "Input - ");
		NodeSL result= node;
		int ctr=0;
		
		while(node != null) {
			
			node = node.getNodeSL();
			
			if (ctr>=nthNode){
				result =result.getNodeSL();
			}
			ctr++;
			
		}
		
		if (ctr>nthNode) {
			System.out.println ("Error : Input parameter excceds the lenght of the list");
		} else {
			
			System.out.println("result "+ result.getValue());
			System.out.println("counter "+ctr);
		
		}
		
	}

}
