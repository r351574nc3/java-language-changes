package com.github.r351574nc3.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example2 {
	
	public static void main(String[] args) {
		
		String[] array = {"a", "b", "c", "d", "e"};
		
		//Arrays.stream
		final List<String> str = new ArrayList<>();
		Stream<String> stream1 = Arrays.stream(array);
		//stream1.map(v -> String::charAt).collect();
		
		
		//Stream.of
		Stream<String> stream2 = Stream.of(array);
		stream2.forEach(x -> System.out.println(x));
	}

}
