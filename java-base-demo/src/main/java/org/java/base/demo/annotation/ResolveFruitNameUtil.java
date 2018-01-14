package org.java.base.demo.annotation;

import java.lang.reflect.Field;

import org.java.base.demo.App;

public class ResolveFruitNameUtil {
	public static void getFruitName(Class<?> clzz) {
		Field[] field = clzz.getFields();
		for (Field field2 : field) {
			if (field2.isAnnotationPresent(FruitName.class)) {
				FruitName fruitName = (FruitName) field2.getAnnotation(FruitName.class);
				System.out.println(fruitName.value());
			}
		}
	}
	public static void main(String[] args) {
		getFruitName(App.class);
	}
}
