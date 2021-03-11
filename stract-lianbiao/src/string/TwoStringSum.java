package string;

public class TwoStringSum {
	public static void main(String[] args) {
		String s1 = "123";
		String s2 = "977000";
		String result = sumString(s1, s2);
		System.out.println(result);
	}

	public static String sumString(String num1, String num2) {
		int sum ,div;
		StringBuilder stringBuilder = new StringBuilder();
		int index = 0;
		for (int i = num1.length() - 1, j = num2.length() - 1; i > -1 || j > -1; i--, j--) {
			int s1 = i > -1 ? num1.charAt(i) - '0' : 0;
			int s2 = j > -1 ? num2.charAt(j) - '0' : 0;
			sum = s1 + s2 + index;
			index = sum / 10;
			div = sum % 10;
			stringBuilder.append(div);
		}
		if (index != 0)
			stringBuilder.append(index);
		return stringBuilder.reverse().toString();
	}
}
