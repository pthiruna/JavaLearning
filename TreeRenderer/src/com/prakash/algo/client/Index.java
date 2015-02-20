package com.prakash.algo.client;

import java.util.ArrayList;

import com.prakash.algo.fwk.VisualTreeRenderer;
import com.prakash.algo.fwk.bean.Node;
import com.prakash.algo.fwk.bean.ResponseBean;
import com.prakash.algo.fwk.bean.Tree;
import com.prakash.algo.fwk.util.Utilities;
import com.prakash.algo.tmp.Test;


/* Add your methods here that you would like to be displayed on the Index page. The method should follow the below convention
 * 1. The method should be public
 * 2. The method should not take any argurments
 * 3. The method should return Object of Type VisualTreeRenderer 
 *  
 */

public class Index {

	
	/* 
	 * This is a sample function which generates a binary tree
	 */
	public  VisualTreeRenderer doBinaryTree() {
		
		System.out.println("Sample function");
		
		Test objTest = new Test();
		return objTest.testMethod();
		
		
	}
	
	

}
