package com.prakash.interview.util;

import com.prakash.interview.bean.NodeDL;
import com.prakash.interview.bean.NodeSL;

public class TestDataGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeSL node =generateSingleLinkedList(10);
		Utilities.printSingleLinkedList(node, "");

	}

	
	public static NodeSL generateSingleLinkedList(int length) {
		if (length<1)  {
			return null;
		}
		NodeSL rootNode = new NodeSL();
		rootNode.setValue(Utilities.getRandomNumber(1, 99));
		NodeSL lastNode=rootNode;
		
		int i=0;
		while (i<length-1) {
			NodeSL nodetmp = new NodeSL();
			nodetmp.setValue(Utilities.getRandomNumber(1, 99));
			//System.out.println(nodetmp.getValue());
			lastNode.setNodeSL(nodetmp);
			lastNode =nodetmp;
			
			i++;
		}
		
		return rootNode;
		
	}
	
	public static NodeSL generateSingleLinkedListLooped(int length,int loopAtIndex) {
		
		if (length<1)  {
			return null;
		}
		
		
		NodeSL rootNode = new NodeSL();
		rootNode.setValue(Utilities.getRandomNumber(1, 99));
		NodeSL lastNode=rootNode;
		NodeSL loopAtNode=null;
		
		int i=0;
		while (i<length-1) {
			NodeSL nodetmp = new NodeSL();
			nodetmp.setValue(Utilities.getRandomNumber(1, 99));
			//System.out.println(nodetmp.getValue());
			lastNode.setNodeSL(nodetmp);
			if (i==loopAtIndex) {
				loopAtNode =lastNode;
			}
			i++;
			lastNode =nodetmp;
			
		}
		
		lastNode.setNodeSL(loopAtNode);
		lastNode.setValue(11111);
		return rootNode;
		
	}
	
	
	
	public static NodeDL generateDoubleLinkedList(int lenght) {
		NodeDL node = new NodeDL();
		
		
		
		return node;
		
	}
}
