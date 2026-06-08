package com.interview.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Reduce function is used to perform a reduction on the elements of a stream, using an associative accumulation function, and returns an Optional describing the reduced value, if any.
 * 
 * The reduce() method takes a BinaryOperator as an argument, which is a functional interface that represents a function that takes two arguments of the same type and returns a result of the same type. The reduce() method applies the BinaryOperator to the elements of the stream in a sequential manner, combining them into a single result.
 * 
 * The reduce() method can be used to perform various operations such as summing numbers, concatenating strings, finding the maximum or minimum value, etc. It is a powerful tool for performing aggregate operations on collections of data.

 * In short, I use reduce() whenever I need to aggregate a stream into a single result such as sum, product, min/max, string concatenation, or a custom business object.
 */
public class Reduce_Function {
	 
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 7, 40, 15);
		Optional<Integer> max = numbers.stream()
		                               .reduce(Integer::max);

		System.out.println(max.get());
	}

}
