package com.bh.util.st;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = "sanmsung-500-lg-600-google-900-kakao-";

		StringTokenizer st = new StringTokenizer(str, "-");
		
		System.out.println(st.countTokens());
		
		
		while(st.hasMoreTokens()) {
			//parsing
			String token = st.nextToken();
			System.out.println(token);
			
			token = st.nextToken();
		}
	
	}

}
