package jp.seraphr;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void test() {
		B<String> tB = new B<String>();
		B<String> tB2 = tB.m();
		assertEquals(tB, tB2);
	}

}
