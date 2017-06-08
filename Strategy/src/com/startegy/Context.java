package com.startegy;

public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void operate() {
		strategy.operate();
	}
}
