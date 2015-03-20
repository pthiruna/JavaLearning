package com.prakash.interview.cat.linkedlist;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;

public class ReverseLinkedList {
	
	public static NodeSL reversedNode = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeSL objSL = TestDataGenerator.generateSingleLinkedList(0);
		Utilities.printSingleLinkedList(objSL, "Input :");
		reverseLinkedListRecursive(objSL,null);
		

	}

	public static NodeSL reverseLinkedList(NodeSL node) {
		
		reverseLinkedListRecursive(node,null);
		return reversedNode;
	}
	
	public static void reverseLinkedListRecursive(NodeSL curNode, NodeSL prevNode) {
		
		if (curNode==null ) {
			Utilities.printSingleLinkedList(prevNode, "Output :");
			reversedNode =prevNode;
			return;
		}
	
		NodeSL nxtNode = curNode.getNodeSL();
		curNode.setNodeSL(prevNode);	
	
		reverseLinkedListRecursive(nxtNode,curNode);
		
		
		
	}
}
