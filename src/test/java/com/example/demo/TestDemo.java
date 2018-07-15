package com.example.demo;

public class TestDemo {
    public static final float MAX_VALUE = 0x1.fffffeP+127f; // 3.4028235e+38f

	public static void main(String[] args) {
		
		int a = 123456789;
		float a1 = a;
		//Float
		System.out.println(a1);
		final float POSITIVE_INFINITY = 1.0f / 0.0f;
		System.out.println(POSITIVE_INFINITY);
		System.out.println(MAX_VALUE);
	}
}
