package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DemoApplicationTests {

	@Test
	public void testAdd() {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		PrintStream outputStream = new PrintStream(byteArrayOutputStream);

		PrintStream previousOut = System.out;

		System.setOut(outputStream);

		DemoApplication.main(null);

		String actual = byteArrayOutputStream.toString();
		String expected = "Hello World!\n";

		outputStream.close();

		System.setOut(previousOut);

		assertEquals(expected, actual);

	}

}
