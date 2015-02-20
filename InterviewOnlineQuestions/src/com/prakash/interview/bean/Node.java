package com.prakash.interview.bean;


public class Node {

	private int value;
	private Node leftNode;
	private Node RightNode;
	

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return RightNode;
	}

	public void setRightNode(Node rightNode) {
		RightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
