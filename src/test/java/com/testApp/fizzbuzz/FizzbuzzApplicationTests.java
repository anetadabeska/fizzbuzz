package com.testApp.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
public class FizzbuzzApplicationTests {

	@Autowired
	private FizzbuzService fizzbuzService;

	@Test
	void testFizzBuzzOneResult() {
		System.out.println("Begin test");
		assertEquals("fizz", fizzbuzService.getResult(3));
		System.out.printf(" Entry number: '%s', Result value: %s ", 3, fizzbuzService.getResult(3));
		assertEquals("4", fizzbuzService.getResult(4));
		System.out.printf(" Entry number: '%s', Result value: %s ", 4, fizzbuzService.getResult(4));

		assertEquals("buzz", fizzbuzService.getResult(5));
		System.out.printf(" Entry number: '%s', Result value: %s ", 5, fizzbuzService.getResult(5));

		assertEquals("fizzbuzz", fizzbuzService.getResult(15));
		System.out.printf(" Entry number: '%s', Result value: %s ", 15, fizzbuzService.getResult(15));

		assertEquals("34", fizzbuzService.getResult(34));
		System.out.printf(" Entry number: '%s', Result value: %s ", 34, fizzbuzService.getResult(34));

		assertEquals("BuzzBazz", fizzbuzService.getResult(35));
		System.out.printf(" Entry number: '%s', Result value: %s ", 35, fizzbuzService.getResult(35));

		assertEquals("FizzBazz", fizzbuzService.getResult(21));
		System.out.printf(" Entry number: '%s', Result value: %s ", 21, fizzbuzService.getResult(21));

		assertEquals("FizzBuzzBazz", fizzbuzService.getResult(105));
		System.out.printf(" Entry number: '%s', Result value: %s ", 105, fizzbuzService.getResult(105));

		System.out.println("End");
	}

	@Test
	void testFizzBuzzResultsList() {
		System.out.println("Begin test");
		List<String> list1 = Arrays.asList("1","2","fizz","4","buzz","fizz","Bazz","8","fizz","buzz","11","fizz","13","Bazz","fizzbuzz","16","17","fizz","19","buzz","FizzBazz","22","23","fizz","buzz","26","fizz","Bazz","29","fizzbuzz","31","32","fizz","34","BuzzBazz","fizz","37","38","fizz","buzz","41","FizzBazz","43","44","fizzbuzz","46","47","fizz","Bazz","buzz","fizz","52","53","fizz","buzz","Bazz","fizz","58","59","fizzbuzz","61","62","FizzBazz","64","buzz","fizz","67","68","fizz","BuzzBazz","71","fizz","73","74","fizzbuzz","76","Bazz","fizz","79","buzz","fizz","82","83","FizzBazz","buzz","86","fizz","88","89","fizzbuzz","Bazz","92","fizz","94","buzz","fizz","97","Bazz","fizz","buzz");
		List<String> list2 = Arrays.asList("1","2","fizz","4","buzz","fizz","Bazz","8","fizz","buzz","11","fizz","13","Bazz","fizzbuzz","16","17","fizz","19","buzz","FizzBazz","22","23","fizz","buzz","26","fizz","Bazz","29","fizzbuzz","31","32","fizz","34","BuzzBazz","fizz","37","38","fizz","buzz","41","FizzBazz","43","44","fizzbuzz","46","47","fizz","Bazz","buzz","fizz","52","53","fizz","buzz","Bazz","fizz","58","59","fizzbuzz","61","62","FizzBazz","64","buzz","fizz","67","68","fizz","BuzzBazz","71","fizz","73","74","fizzbuzz","76","Bazz","fizz","79","buzz","fizz","82","83","FizzBazz","buzz","86","fizz","88","89","fizzbuzz","Bazz","92","fizz","94","buzz","fizz","97","Bazz","fizz","buzz");
		assertEquals(list1, list2 );
		System.out.printf(" First list: '%s', Second list: %s ", list1, list2);
		assertEquals(list1.size(), list2.size());
		System.out.printf(" First list size: '%s', Second list size: %s ", list1.size(), list2.size());
		System.out.println("End");
	}

}