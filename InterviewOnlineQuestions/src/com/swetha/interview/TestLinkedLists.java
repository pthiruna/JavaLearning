package com.swetha.interview;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;
import com.swetha.interview.linkedlist.LinkedListTryOuts;

public class TestLinkedLists {

	public static void main(String[] args) {
		//*******************************testNthNodeInLinkedList*********************************//
		/*
		 * NodeSL node = TestDataGenerator.generateSingleLinkedList(20); 
		 * TestLinkedLists test = new TestLinkedLists(); 
		 * test.testNthNodeInLinkedList(node);
		 */
		
		
		//*******************************testMidNodeNodeInLinkedList*********************************//
		/*
		 * TestLinkedLists test = new TestLinkedLists(); 
		 * NodeSL nodeEven = TestDataGenerator.generateSingleLinkedList(20);
		 * System.out.println(nodeEven);
		 * test.testMidNodeNodeInLinkedList(nodeEven); 
		 * NodeSL nodeOdd = TestDataGenerator.generateSingleLinkedList(21);
		 * System.out.println(nodeOdd);
		 * test.testMidNodeNodeInLinkedList(nodeOdd);
		 */
		

		// *******************************testNthNodeFromEndInLinkedList*********************************//
		/*
		 * NodeSL node = TestDataGenerator.generateSingleLinkedList(20);
		 * System.out.println(node); 
		 * TestLinkedLists test = new TestLinkedLists();
		 * test.testNthNodeFromEndInLinkedList(node);
		 */
		

		// *******************************testReverseLinkedList*********************************//
		/*
		 * NodeSL node = TestDataGenerator.generateSingleLinkedList(20);
		 * System.out.println(node); 
		 * TestLinkedLists test = new TestLinkedLists();
		 * test.testReverseLinkedList(node);
		 */
		
		
		// *******************************testDetectLoopInLinkedList*********************************//
				
				/* 
				 * NodeSL nodeLooped = TestDataGenerator.generateSingleLinkedListLooped(5, 2);
				 * Utilities.printSingleLinkedListUpto(nodeLooped, "Test Input", 5);
				 * TestLinkedLists test = new TestLinkedLists();
				 *  test.testDetectLoopInLinkedList(nodeLooped);
				 */


		// *******************************testReverseLinkedList*********************************//
				 NodeSL node = TestDataGenerator.generateSingleLinkedList(20);
				 System.out.println(node); 
				 TestLinkedLists test = new TestLinkedLists();
				 test.testRecursivePrintLinkedList(node);
				 
				
	}

	public void testDetectLoopInLinkedList(NodeSL node) {
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try {

			boolean loopDetected =  llTryOuts.detectLoopInLinkedList(node);
			System.out.println(loopDetected);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			boolean loopDetected =  llTryOuts.detectLoopInLinkedList(null);
			System.out.println(loopDetected);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		
		try {

			boolean loopDetected =  llTryOuts.detectLoopInLinkedList(TestDataGenerator.generateSingleLinkedList(15));
			System.out.println(loopDetected);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public void testReverseLinkedList(NodeSL node) {
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try {

			NodeSL outputNode = llTryOuts.reverseLinkedList(node);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.reverseLinkedList(null);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
	
	public void testRecursivePrintLinkedList(NodeSL node) {
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try {

			 llTryOuts.recursivePrintNode(node);;
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			llTryOuts.reverseLinkedList(null);
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public void testNthNodeFromEndInLinkedList(NodeSL node) {
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try {

			NodeSL outputNode = llTryOuts.findNthElementFromEndOfLinkedList(
					node, 20);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthElementFromEndOfLinkedList(
					null, 10);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthElementFromEndOfLinkedList(
					node, 25);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthElementFromEndOfLinkedList(
					node, 0);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthElementFromEndOfLinkedList(
					node, 1);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}

	public void testMidNodeNodeInLinkedList(NodeSL node) {
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try {

			NodeSL outputNode = llTryOuts.findMidElementOfLinkedList(node);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findMidElementOfLinkedList(null);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public void testNthNodeInLinkedList(NodeSL node) {
		LinkedListTryOuts llTryOuts = new LinkedListTryOuts();
		try {

			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 8);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(null, 15);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 25);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 0);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		try {

			NodeSL outputNode = llTryOuts.findNthNodeInLinkedList(node, 20);
			System.out.println(outputNode);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}
	
	

}
