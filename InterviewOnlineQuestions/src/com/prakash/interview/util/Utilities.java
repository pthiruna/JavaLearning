package com.prakash.interview.util;

import java.util.Random;

import com.prakash.interview.bean.NodeSL;

public class Utilities {
	
	public static int getRandomNumber(int min, int max) {
	
		Random rn = new Random();		
		return rn.nextInt((max - min) + 1) + min;
		
	
	}

	public static void main(String[] args) {
		//System.out.println(getRandomNumber(5,10));
		NodeSL tmpObj = TestDataGenerator.generateSingleLinkedListLooped(10, 3);
		Utilities.printSingleLinkedListUpto(tmpObj, "output", 15);
		
		
	}
	
	public static void printSingleLinkedList(NodeSL node,String comment) {
		
		System.out.print(comment)	;
		while (node !=null) {
			System.out.print("("+node.getValue()+")->");
			node = node.getNodeSL();
		}
		System.out.println("");
	}
	
	public static void printSingleLinkedListUpto(NodeSL node,String comment,int index) {
		
		System.out.print(comment)	;
		int i=0;
		while (i<index) {
			System.out.print("("+node.getValue()+")->");
			node = node.getNodeSL();
			i++;
		}
		System.out.println("");
	}
}
