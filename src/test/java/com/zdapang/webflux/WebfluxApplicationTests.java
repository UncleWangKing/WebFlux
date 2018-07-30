package com.zdapang.webflux;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebfluxApplicationTests {

	@Test
	public void contextLoads() {
		int list[] = {3,1,2,3,55,-1};
		System.out.println(IntStream.of(list).min().getAsInt());
	}

}
