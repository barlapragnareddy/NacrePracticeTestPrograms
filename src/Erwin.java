public class Erwin {

	public static void main(String[] args) {
		String s = "abc.2345.abc.454.567.abc,67";
		String[] arr = s.split("[.]");
//		System.out.println(arr.length);

//		for (int i = 0; i < arr.length; i++)
//			System.out.println(arr[i]);
		String[] str=s.split("[.]",3);
		System.out.println(str.length);
			System.out.println(str[2]);
	}

}
