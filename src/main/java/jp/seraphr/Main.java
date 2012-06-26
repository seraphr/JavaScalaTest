package jp.seraphr;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		B<String> tB = new B<String>();
		B<String> tB2 = tB.m();
		System.out.println(tB2);
	}

}
