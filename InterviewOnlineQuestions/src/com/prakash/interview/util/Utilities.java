package com.prakash.interview.util;

import java.util.Random;

import com.prakash.interview.bean.NodeSL;

public class Utilities {
	
	public static int getRandomNumber(int min, int max) {
	
		Random rn = new Random();		
		return rn.nextInt((max - min) + 1) + min;
		
	
	}

	public static void main(String[] args) {
		System.out.println(getRandomNumber(5,10));
	}
	
	public static void printSingleLinkedList(NodeSL node,String comment) {
		
		System.out.println("---Printing Single Linked List---:"+comment)	;
		while (node !=null) {
			System.out.print("("+node.getValue()+")->");
			node = node.getNodeSL();
		}
	}
}
