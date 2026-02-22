package com.springcore;

interface Dependencies{
	void someCode();
}

class JDBC implements Dependencies{
	@Override
	public void someCode() {
		System.out.println("JDBC version 1.0");
	}
}

class JDBC2 implements Dependencies{
	@Override
	public void someCode() {
		System.out.println("JDBC version 2.0");
	}
}

public class Application {
	private static Dependencies dependecies;

	public Application(Dependencies dependecies){
		this.dependecies = dependecies;
	}
	
	public static void main(String[] args) {
		
	}
}
