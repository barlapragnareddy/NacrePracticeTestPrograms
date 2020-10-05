package com.nacre.assignments.exceptionday1;

//autocloasable interface example by using try with resource
public class myAutoclosable implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Close from myAutoclosable resource");
	}

	public void display(String str) {
		if (str == null) {
			throw new RuntimeException();
		} else {
			System.out.println("yeah!!! I dont have exception ");
		}
	}

	public static void main(String[] args) throws Exception {
//		myAutoclosable m;
//		try {
//			m = new myAutoclosable();
//			String s = null;
//			m.display(s);
//		} catch (RuntimeException r) {
//			r.printStackTrace();
//			System.out.println("run time exception occured");
//		}
		try (myAutoclosable m = new myAutoclosable()) {
			String s = "Welcome to the Nacre Institute";
			m.display(s);
		} catch (RuntimeException r) {
			r.printStackTrace();
			System.out.println("runtime exception occured");

		}

	}

}
