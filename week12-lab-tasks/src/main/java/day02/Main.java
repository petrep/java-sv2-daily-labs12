package day02;

public class Main {

	public static void main(String[] args) {
		MyGenericClass<String> myObject = new MyGenericClass<>("alma");

		System.out.println(myObject.getElement());
	}
}
