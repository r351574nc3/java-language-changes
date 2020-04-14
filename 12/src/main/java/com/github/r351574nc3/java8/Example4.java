package com.github.r351574nc3.java8;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Example4 {
	
	public Example4() {
	}

	class Test2 implements Polymorphable {
		public void process() {
			System.out.println("Test2");
		}
		
		public void preProcess() {	
			System.out.println("Before test");
		}
	}
	
	class Test1 implements Polymorphable, java.io.Serializable {
		public void process() {
			System.out.println("Test1");
		}
	}

	interface Polymorphable {

		default void preProcess() {
			// Do stuff
		}
		
		default void defaultProcess() {
			preProcess();
			process();
			postProcess();
		}

		void process();

		default void postProcess() {
			// Do more stuff
		}
		
	}

	public static void main(final String ... args) {
		String t2 = new String();
		// new Test2().defaultProcess();
		// new Test2().defaultProcess();
	}
}
