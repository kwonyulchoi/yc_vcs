package com.web.app;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void testMainWithEmptyArguments() {
		Application.main(new String[0]);
	}
	
	@Test
	public void testWithFullArguments() {
		Application.main(new String[]{"TestAaa", "TestBbb"});
	}

}
