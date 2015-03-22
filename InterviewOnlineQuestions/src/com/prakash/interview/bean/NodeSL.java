package com.prakash.interview.bean;

public class NodeSL {
	
	@Override
	public String toString() {
		return "(" + value + ")-->" + (nodeSL == null ? "":nodeSL);
	}
	private int value;
	private NodeSL nodeSL =null;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public NodeSL getNodeSL() {
		return nodeSL;
	}
	public void setNodeSL(NodeSL nodeSL) {
		this.nodeSL = nodeSL;
	}
	
	public NodeSL next(){
		return nodeSL;
	}
	

}
