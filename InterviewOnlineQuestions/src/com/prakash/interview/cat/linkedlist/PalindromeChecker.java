package com.prakash.interview.cat.linkedlist;

import com.prakash.interview.bean.NodeSL;

public class PalindromeChecker {
	
	private static NodeSL inorderNode = null;
	private static boolean isPalindrome = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public  static void compareNodes(NodeSL inverseNode ) {
		 
		if (inverseNode==null) {
			return;
		}
		
		compareNodes(inverseNode.getNodeSL());
		if (inverseNode.getValue()!=inorderNode.getValue()) {
			isPalindrome = false;
		}
		inorderNode = inorderNode.getNodeSL();
	}

}
