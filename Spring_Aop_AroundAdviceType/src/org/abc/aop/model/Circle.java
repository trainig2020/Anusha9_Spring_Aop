package org.abc.aop.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle setter is called");
		throw (new RuntimeException());
	}

	public String setNameandReturn(String name) {
		this.name = name;
		System.out.println("Circle setter is called");
		return name;
	}

}
