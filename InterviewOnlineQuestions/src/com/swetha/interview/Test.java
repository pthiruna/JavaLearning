package com.swetha.interview;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;
import com.swetha.interview.linkedlist.LinkedListTryOuts;

public class Test {

	public static void main(String[] args) {
		
		/*NodeSL node = TestDataGenerator.generateSingleLinkedList(20);
		Test test = new Test();
		test.testNthNodeInLinkedList(node);*/
		
		
		
		Test test = new Test();
		NodeSL nodeEven = TestDataGenerator.generateSingleLinkedList(20);
		System.out.println(nodeEven);
		test.testMidNodeNodeInLinkedList(nodeEven);
		NodeSL nodeOdd = TestDataGenerator.generateSingleLinkedList(21);
		System.out.println(nodeOdd);
		test.testMidNodeNodeInLinkedList(nodeOdd);
		
		
	}
	public void testMidNodeNodeInLinkedList(NodeSL node){
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try{
		// Write a function to get Nth node in a Linked List
		NodeSL outputNode = llTryOuts.findMidElementOfLinkedList(node);
		System.out.println(outputNode);
		}catch(Exception exp){
			exp.printStackTrace();
		}
		
		try{
			// Write a function to get Nth node in a Linked List
			NodeSL outputNode = llTryOuts.findMidElementOfLinkedList(null);
			System.out.println(outputNode);
			}catch(Exception exp){
				exp.printStackTrace();
			}
	}
	
	public void testNthNodeInLinkedList(NodeSL node){
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try{
		// Write a function to get Nth node in a Linked List
		NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 8);
		System.out.println(outputNode);
		}catch(Exception exp){
			exp.printStackTrace();
		}
			
		
		try{
			// Write a function to get Nth node in a Linked List
			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(null, 15);
			System.out.println(outputNode);
			}catch(Exception exp){
				exp.printStackTrace();
			}
		
		try{
			// Write a function to get Nth node in a Linked List
			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 25);
			System.out.println(outputNode);
			}catch(Exception exp){
				exp.printStackTrace();
			}
		
		try{
			// Write a function to get Nth node in a Linked List
			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 0);
			System.out.println(outputNode);
			}catch(Exception exp){
				exp.printStackTrace();
			}
		
		try{
			// Write a function to get Nth node in a Linked List
			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 20);
			System.out.println(outputNode);
			}catch(Exception exp){
				exp.printStackTrace();
			}
				
	}

}
