package com.strings;

public class Demo {
	public static void main(String[] args) {
		String str1 = "Java";
		
//		char[] charArray = str1.toCharArray();
//		System.out.println(charArray);
//		System.out.println(Arrays.toString(charArray));
		
		
		String str2 = new String("java").intern();
		
		System.out.println("-------------");
		System.out.println(str1 == str2);
		
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String str3 = str1.concat(" - Awesome"); // new String();
		System.out.println(str3);
		
		str2.concat(" is awesome");
		System.out.println(str2);
		
		StringBuilder str5 = new StringBuilder("java");
		System.out.println(str5);
		
		str5.append(" is awesome");
		
		System.out.println(str5);
		
		
		String str7 = "java";
		String str8 = new String("java");
		
		System.out.println(str7 == str8.intern());
		
		
		StringBuffer buffer = new StringBuffer(); 
		buffer.append("java").append(" is ").append(" awesome ");
		
		System.out.println(buffer.reverse().toString().trim());
		
		String str = "madam"; // find palindrome or not
		
		System.out.println(new StringBuilder(str).reverse().equals(str));
		
		StringBuilder stb1 = new StringBuilder("java");
		StringBuilder stb2 = new StringBuilder("java");
		
		System.out.println(stb1 == stb2); // address
		System.out.println(stb1.equals(stb2)); // address
		
		String str11 = "java";
		
		System.out.println(str11.toCharArray()[0] == 'j');
		System.out.println(str11.startsWith("j"));
		
		System.out.println(str11.toCharArray()[str11.length() - 1] == 'a');
		System.out.println(str11.endsWith("va"));
		
		System.out.println(str11.charAt(0));
		System.out.println(str11.contains("ja"));
		
		String str15 = "Name@12345";
		// (?=.*[a-z])(?=.*[A-Z])(?=.*[\d])(?=.*[!@#$%^&]).{8 , }
		// String validator -> 
		// 1 caps , 1 small , 1 symbol , 1 digit and length should be greater 8
	}
}
