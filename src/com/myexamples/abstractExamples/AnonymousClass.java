package com.myexamples.abstractExamples;

abstract class Bird {
	public abstract void eat();
}

abstract class Pegion extends Bird {
	@Override
	public void eat() {
		System.out.println("Stems");
	}

	public abstract void legs();
}

abstract class Penguin extends Pegion {
	public abstract void color();
}

class Parrot extends Penguin {

	@Override
	public void color() {
		System.out.println("Green");
	}

	@Override
	public void legs() {
		System.out.println(2);
	}

	@Override
	public void eat() {
		System.out.println("Seeds");
	}

}

public class AnonymousClass {

	public static void main(String[] args) {
		Pegion p = new Penguin() {

			@Override
			public void color() {
				System.out.println("Blue");
			}

			@Override
			public void legs() {
				System.out.println("2");
			}

		};
		p.eat();

	}

}
