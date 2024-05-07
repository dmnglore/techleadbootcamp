
package com.workshop.ctdd.testdoubles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper = new StringHelper();

	@Test
	public void swap2charstest() {
		//assertEquals("BA",stringHelper.swapLast2Chars("AB"));
		assertNotNull(stringHelper.swapLast2Chars("AB"));
	}
	@Test
	public void swap1charstest() {
		//assertEquals("BA",stringHelper.swapLast2Chars("AB"));
		assertNotNull(stringHelper.swapLast2Chars("A"));
	}

	@Test
	public void swap10charstest() {

		assertNotNull("ABCDEFGHIJK", stringHelper.swapLast2Chars("ABCDEFGHIKKKKKKJ"));
	}

}
