package com.swetha.interview;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;
import com.swetha.interview.linkedlist.LinkedListTryOuts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NodeSL node = TestDataGenerator.generateSingleLinkedList(20);
		System.out.println(node);
		
		Test test = new Test();
		test.testNthNodeInLinkedList(node);
		
		
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
