package com.prakash.algo.tmp;

import com.prakash.algo.fwk.VisualTreeRenderer;
import com.prakash.algo.fwk.bean.Node;
import com.prakash.algo.fwk.util.Utilities;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	VisualTreeRenderer objVTR = new VisualTreeRenderer();
	
	public VisualTreeRenderer testMethod() {
		Node node =Utilities.generateSampleTree();
		objVTR.takeSnapShot(node,"Before Operating");
		//do you code -
		
		Node node2 =Utilities.generateSampleTree();
		node2.setValue(124);
		node2.setLeftNode(null);
		objVTR.takeSnapShot(node2,"After Operating");
		
		objVTR.takeSnapShot(node2, "testing");
		return objVTR;
	}

}
