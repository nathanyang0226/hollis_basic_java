package com.justdojava.javabasic.hollis_basic_java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HollisBasicJavaApplicationTests {

	@Test
	public void contextLoads() {
		String str = "world";
		switch (str) {
			case "hello":
				System.out.println("hello");
				break;
			case "world":
				System.out.println("world");
				break;
			default:
				break;
		}
	}

}
