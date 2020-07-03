// WAJP which will print the different/Unique characters in a String/Sentence
public class PrintUniqueCharacters {
	public static void main(String[] args) {
		String s = "Better Butter";
		s = s.toUpperCase();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
//			int cnt = 0;
			char ch = s.charAt(i);
			if (res.contains(Character.toString(ch)))
				continue;
			else
				res = res + ch;
		}
//		System.out.println(res);
		
		int arr[] = new int[26];
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if (ch != ' ')
				arr[(int) ch - 65]++;
			else
				continue;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.println((char) (i + 65) + " " + arr[i]);
		}

//		for (int i = 0; i < s.length(); i++) 
//		{
//			char ch = s.charAt(i);
//			int cnt = 0;
//			for (int j = 0; j < s.length(); j++) 
//			{
//				if (ch == s.charAt(j)) 
//					cnt++;
//				else
//					continue;
//			}
//			System.out.println(ch+" is repeated for "+cnt+" times");
//		}

	}
}
