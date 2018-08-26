package com.javacode.testwithci2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		Charm charm = new Charm();
		System.out.print("Point of face : ");
		int face = in.nextInt();
		boolean bool = charm.isCondition(face);
		while (!bool) {
			System.out.println("Input between 0 - 10 ");
			face = in.nextInt();
			bool = charm.isCondition(face);
		}
		
		//2
		System.out.print("Point of rich : ");
		int rich = in.nextInt();
		bool = charm.isCondition(rich);
		while (!bool) {
			System.out.println("Input between 0 - 10 ");
			rich = in.nextInt();
			bool = charm.isCondition(rich);
		}
		
		//3
		System.out.print("Point of nature :  ");
		int nature = in.nextInt();
		bool = charm.isCondition(nature);
		while (!bool) {
			System.out.println("Input between 0 - 10 ");
			nature = in.nextInt();
			bool = charm.isCondition(nature);
		}
		
		//4
		System.out.print("Point of smile :  ");
		int smile = in.nextInt();
		bool = charm.isCondition(smile);
		while (!bool) {
			System.out.println("Input between 0 - 10 ");
			smile = in.nextInt();
			bool = charm.isCondition(smile);
		}
		
		//5
		System.out.print("Point of speech : ");
		int speech = in.nextInt();
		bool = charm.isCondition(speech);
		while (!bool) {
			System.out.println("Input between 0 - 10 ");
			speech = in.nextInt();
			bool = charm.isCondition(speech);
		}
		
		charm.setFace(face);
		charm.setNature(nature);
		charm.setRich(rich);
		charm.setSmile(smile);
		charm.setSpeech(speech);
		
		double result = charm.process();
		System.out.println("Point of your charm is : "+result);
	}

}
