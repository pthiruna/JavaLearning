package com.swetha.interview;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;
import com.swetha.interview.linkedlist.LinkedListTryOuts;

public class Test {

	public static void main(String[] args) {

		/*
		 * NodeSL node = TestDataGenerator.generateSingleLinkedList(20); Test
		 * test = new Test(); test.testNthNodeInLinkedList(node);
		 */

		/*
		 * Test test = new Test(); NodeSL nodeEven =
		 * TestDataGenerator.generateSingleLinkedList(20);
		 * System.out.println(nodeEven);
		 * test.testMidNodeNodeInLinkedList(nodeEven); NodeSL nodeOdd =
		 * TestDataGenerator.generateSingleLinkedList(21);
		 * System.out.println(nodeOdd);
		 * test.testMidNodeNodeInLinkedList(nodeOdd);
		 */

		/*NodeSL node = TestDataGenerator.generateSingleLinkedList(20);
		System.out.println(node);
		Test test = new Test();
		test.testNthNodeFromEndInLinkedList(node);*/
		
		NodeSL node = TestDataGenerator.generateSingleLinkedList(20);
		System.out.println(node);
		Test test = new Test();
		test.testReverseLinkedList(node);

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
