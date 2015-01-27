package com.prakash.algo.fwk.util;

import com.prakash.algo.fwk.bean.Node;

public class Utilities {

	public static Node generateSampleTree () {
		Node rootNode = new Node();
		rootNode.setValue(1);
		
		Node lftNode1 = new Node();
		lftNode1.setValue(2);
		rootNode.setLeftNode(lftNode1);
		
		Node lftNode1lft = new Node();
		lftNode1lft.setValue(3);
		lftNode1.setLeftNode(lftNode1lft);
			
			Node lftNode1lftlft = new Node();
			lftNode1lftlft.setValue(3);
			lftNode1lft.setLeftNode(lftNode1lftlft);
			
			Node lftNode1lftRt = new Node();
			lftNode1lftRt.setValue(3);
			lftNode1lft.setRightNode(lftNode1lftRt);
			
		
		Node lftNode1Rt = new Node();
		lftNode1Rt.setValue(55);
		lftNode1.setRightNode(lftNode1Rt);
		
			Node lftNode1Rtlft = new Node();
			lftNode1Rtlft.setValue(55);
			lftNode1Rt.setLeftNode(lftNode1Rtlft);
			
			Node lftNode1RtRt = new Node();
			lftNode1RtRt.setValue(55);
			lftNode1Rt.setRightNode(lftNode1RtRt);
		
		Node rtNode1 = new Node();
		rtNode1.setValue(1);
		rootNode.setRightNode(rtNode1);
		
		Node rtNode1lft = new Node();
		rtNode1lft.setValue(34);
		rtNode1.setLeftNode(rtNode1lft);
			
			Node rtNode1lftlft = new Node();
			rtNode1lftlft.setValue(34);
			rtNode1lft.setLeftNode(rtNode1lftlft);
			
			Node rtNode1lftRt = new Node();
			rtNode1lftRt.setValue(34);
			rtNode1lft.setRightNode(rtNode1lftRt);
		
		Node rtNode1lRt = new Node();
		rtNode1lRt.setValue(24);
		rtNode1.setRightNode(rtNode1lRt);
		
			Node rtNode1lRtLft = new Node();
			rtNode1lRtLft.setValue(24);
			rtNode1lRt.setLeftNode(rtNode1lRtLft);
			
			Node rtNode1lRtRt = new Node();
			rtNode1lRtRt.setValue(24);
			rtNode1lRt.setRightNode(rtNode1lRtRt);
		
		return rootNode;
	}
}
