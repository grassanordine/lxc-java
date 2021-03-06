package org.lxc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestContainerCreation extends AbstractLxcTest{
	
	
	@Before
	public void setUp() throws LxcException {
		
		lxc = new Lxc(LXC_HOST,LXC_PORT,LXC_USERNAME,LXC_PASSWORD,true);

		lxc.connect();
		
	}
	
	@Test
	public void test() throws LxcException {
		Container container = lxc.container("test100");
		container.create("ubuntu");
	}

	
	@After
	public void tearDown() throws LxcException {
		
		lxc.disconnect();
	}
}
