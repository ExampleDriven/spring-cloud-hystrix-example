package org.exampledriven.hystrixexample;

import org.exampledriven.hystrixeample.HystrixExampleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HystrixExampleApplication.class)
public class HystrixExampleApplicationTests {

	@Test
	public void contextLoads() {
	}

}
