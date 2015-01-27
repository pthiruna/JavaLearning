package com.prakash.algo.client;

import java.util.ArrayList;

import com.prakash.algo.fwk.VisualTreeRenderer;
import com.prakash.algo.fwk.bean.Node;
import com.prakash.algo.fwk.bean.ResponseBean;
import com.prakash.algo.fwk.bean.Tree;
import com.prakash.algo.fwk.util.Utilities;
import com.prakash.algo.tmp.Test;



public class Index {

	public  VisualTreeRenderer doBinaryTree() {
		
		System.out.println("in doBinary Tree");
		
		Test objTest = new Test();
		return objTest.testMethod();
		
		
	}
	
	
	public ResponseBean doInorderTraversal() {
		System.out.println("in doInorderTraversal");
		return new ResponseBean();
	}

	public ResponseBean showBinaryTree() {
		System.out.println("in showBinaryTree");
		
		return new ResponseBean();
	}

	
	public ResponseBean doHeap() {
		System.out.println("in doHeap");
		
		return new ResponseBean();
	}
	
	
	
	
	

}
