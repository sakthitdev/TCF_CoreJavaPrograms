package day1;

public class TypeConvertionDemo {

	public static void main(String[] args) {
		// byte can't be in int 
		byte num1 = 2;
		int num2 = num1;
		
		int num3 = 200;
		byte num4 = (byte)num3;
		
		System.out.println(num4);

	}

}
