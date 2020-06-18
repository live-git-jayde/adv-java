package annotations;

public class OverrideAnno {
	public static void main(String[] args) {

	}
}

class Parent {
	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}
}

class Child extends Parent {
	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}
}