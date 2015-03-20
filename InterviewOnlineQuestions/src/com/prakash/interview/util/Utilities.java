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
	//	NodeSL tmpObj = TestDataGenerator.generateSingleLinkedListLooped(10, 3);
		//Utilities.printSingleLinkedListUpto(tmpObj, "output", 15);
		
		NodeSL node = TestDataGenerator.generateSingleLinkedList(8);
		Utilities.printSingleLinkedList(node, "Input");
		System.out.println(node);
		NodeSL nodeCopy = Utilities.copySingleLinkedlist(node);
		Utilities.printSingleLinkedList(nodeCopy, "Output");
		System.out.println(nodeCopy);
		
		
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
	
	public static NodeSL getLastNode(NodeSL node) {
		if (node== null) {
			return null;
		}
		while(node.getNodeSL()!= null) {
			node = node.getNodeSL();
		}
		return node;
	}
	
	public static NodeSL copySingleLinkedlist(NodeSL node) {
		NodeSL nodeCopy =null;
		boolean isRootNode = true;
		NodeSL prevNewNode = null;
		NodeSL curOldNode = null;
		
		
		
		do {
			
			NodeSL newNode= new NodeSL();
			newNode.setValue(node.getValue());
		
			if (isRootNode){
				isRootNode = false;
				nodeCopy = newNode;
			}else {
				prevNewNode.setNodeSL(newNode);
			}
			prevNewNode=newNode;
			
			node= node.getNodeSL();
			
			
		}while(node!=null);
		
		return nodeCopy;
		
		
	}
}
