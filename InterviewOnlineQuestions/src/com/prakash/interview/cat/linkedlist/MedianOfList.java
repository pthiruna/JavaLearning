package com.prakash.interview.cat.linkedlist;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;

public class MedianOfList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSL objSL = TestDataGenerator.generateSingleLinkedList(10);
		medianOfList(objSL);

	}
	
	public static void medianOfList(NodeSL node) {
		Utilities.printSingleLinkedList(node, "Input:");
		NodeSL result= node;
		boolean shift = false;
		
		while(node!=null) {
			if (shift) {
				result = result.getNodeSL();
				shift=false;
			}else {
				shift=true;
			}
		
		node = node.getNodeSL();
			
			
		}
		System.out.println(" The value at the median is :"+result.getValue());
		
	}

}
