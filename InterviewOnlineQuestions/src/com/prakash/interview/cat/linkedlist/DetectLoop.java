package com.prakash.interview.cat.linkedlist;

import com.prakash.interview.bean.NodeSL;
import com.prakash.interview.util.TestDataGenerator;
import com.prakash.interview.util.Utilities;

public class DetectLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSL node = TestDataGenerator.generateSingleLinkedListLooped(6, 2);
		Utilities.printSingleLinkedListUpto(node, "Input list :", 26);
		
		//NodeSL node = TestDataGenerator.generateSingleLinkedList(15);
		//Utilities.printSingleLinkedList(node, "Input list :");
		detectLoopInLinkedList(node);

	}
	
	public static void detectLoopInLinkedList(NodeSL node) {
		NodeSL slowNodePtr=node;
		NodeSL fastNodePtr=node.getNodeSL();
		boolean toggle=false;
		boolean detectedLoop=false;
		

		
		while(slowNodePtr != null) {
			slowNodePtr = slowNodePtr.getNodeSL();
			if (fastNodePtr.getNodeSL()!=null) {
				fastNodePtr = fastNodePtr.getNodeSL().getNodeSL();
			}else {
				break;
			}
			if (slowNodePtr==fastNodePtr) {
				detectedLoop = true;
				break;
			}
		}
		
		System.out.println ("Loop Detected : "+detectedLoop);
		if (detectedLoop) {
			System.out.println ("Loop Detected  at :"+slowNodePtr.getValue());
		}
	}

}
