package decisionstat;

import java.util.Scanner;

public class SwitchSecd {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Chocolate ");
		System.out.println("2.lays ");
		System.out.println("3.Juice ");
		System.out.println("4.Cookies ");
		
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice) {
		
 case 1:{
			System.out.println("Are you the employee of this company:");
			System.out.println("press 1 for yes");
			System.out.println("press 2 for no");
			int opt=sc.nextInt();
			
			
			
			switch(opt) {
			case 1:{
				System.out.println("enter the password:");
				int password=sc.nextInt();
				if(password==123) {
					System.out.println("no need to pay");
					
				}
				else {
					System.out.println("Do the payment");
					
				}
			}
			break;
			
			case 2:{
				System.out.println("The amount is 50rupees");
				System.out.println("enter the amoount");
				int amount=sc.nextInt();
				
				if(amount>=50) {
					System.out.println("payment done");
				}
				else { 
					System.out.println("enter the correct amount");
				}
			}
			break;
			}
		}break;
		
case 2:{
			System.out.println("The amount is 50rupees");
			System.out.println("enter the amoount");
			int amount=sc.nextInt();
			
			if(amount>=50) {
				System.out.println("payment done");
			}
			else { 
				System.out.println("enter the correct amount");
			}
		}break;
		}
		
	}

}
