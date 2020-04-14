package com.github.r351574nc3.java8;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example1 {
	static <T> T invoke(Callable<T> c) {
		try {
			return c.call();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	// f(x, y) -> f(x)(y)
	public static void main(final String ... args) {
		final Callable<String> callablething = () -> "Blah";
		final Predicate<String> predicateThing = (v) -> v != "Foo";
		// System.out.println(blah);
s	}
}
