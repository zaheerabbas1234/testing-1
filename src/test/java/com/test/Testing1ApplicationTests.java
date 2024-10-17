package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Testing1ApplicationTests {

@Test
public void additiontest()
{
	assertEquals(20,Calculator.add(10,10));
}

}
