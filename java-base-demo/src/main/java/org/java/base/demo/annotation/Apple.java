package org.java.base.demo.annotation;

public class Apple implements Fruit {
	@FruitName("哈哈")
	private String name;

	public void getName() {
		System.out.println(name);

	}

}
