package com.prakash.algo.fwk;

import java.util.ArrayList;

import com.prakash.algo.fwk.bean.Node;
import com.prakash.algo.fwk.bean.Tree;

public class VisualTreeRenderer {
	
	private ArrayList<Tree> trees = new ArrayList<Tree>();
	
	public void takeSnapShot(Node node,String title) {
		Tree objTree = new Tree();
		objTree.setRootNode(node);
		objTree.setTitle(title);
		trees.add(objTree);
		
	}

	public ArrayList<Tree> getTrees() {
		return trees;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
