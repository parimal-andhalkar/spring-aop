package com.aop.service;

// this is target class

public class Operation {

	public void msg() {
		System.out.println("msg method invoked");
	}

	public int m() {
		System.out.println("m method invoked");
		return 2;
	}

	public int k() {
		System.out.println("k method invoked");
		return 3;
	}

}