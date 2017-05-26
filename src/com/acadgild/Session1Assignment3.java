package com.acadgild;

import java.util.Scanner;

public class Session1Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a=s.nextInt();
		System.out.print("Enter Second Number: ");
		int b=s.nextInt();
		System.out.print("Result of Bitwise AND is - ");
		System.out.println((a&b));
		
		if(a==b){
			System.out.println("Result of Logical AND is True");
		}
		else{
			System.out.println("Result of Logical AND is False");
		}
			
	}

}
