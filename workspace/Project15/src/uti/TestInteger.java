package uti;

public class TestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger x = new MyInteger(89);
		int a = 30;
		String b  = "12";
		char[] array = {1, 3, 5, 7};
		//MyInteger y = new MyInteger();
		System.out.println(x.isEven());
		System.out.println(x.isOdd());
		System.out.println(x.isPrime());
		System.out.println(x.isEven(a));
		System.out.println(x.isOdd(a));
		System.out.println(x.isPrime(a));
		System.out.println(MyInteger.isEven(x));
		System.out.println(MyInteger.isOdd(x));
		System.out.println(MyInteger.isPrime(x));
		System.out.println(x.equals(a));
		System.out.println(x.equals(x));
		System.out.println(MyInteger.parseInt(array));
		System.out.println(MyInteger.parseInt(b));
	}

}
