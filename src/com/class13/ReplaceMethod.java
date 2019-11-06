package com.class13;

public class ReplaceMethod {

	public static void main(String[] args) {
		//Replace
		/*returns a new string resulting from replacing all occurrence of 
		 * oldChar in the string with newChar
		 * 
		 */
		
		String str="Hello Dear Dan, how are you Dan?";
		String str1="12-22-1990";
		
		System.out.println(str.replace('z', 'e'));
		
		System.out.println(str1.replace('-', '/'));
		
		// replaces only first occurrence of word "Dan"
		System.out.println(str.replaceFirst("Dan", "Mike"));
		
		System.out.println("*******************************************");
		//replaces all occurrence regardles of the capitalization Aa case
		
		
		String str2="Video provides a powerful way to help you prove your point. When you click Online Video, you can paste the embed code for the video";
		
		System.out.println(str2.toLowerCase().replace("video","Audio"));
		
		

	}

}
