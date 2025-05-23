package com.interviwe;

import java.util.Arrays;
import java.util.List;

public class Testing {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 17, 19, 21, 119, 118);

		number.stream().map(String::valueOf).filter(s -> s.startsWith("1")).map(Integer::valueOf)
		
				.forEach(System.out::println);

	}

}
