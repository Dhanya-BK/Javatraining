package decisionstat;
import java.util.Scanner;

public class DecisionSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.withdrawal");
		System.out.println("2.Deposit");
		System.out.println("3.Check Amount");
		System.out.println("4.Exit");
		
		System.out.println("Enter the choice:");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("The amount for the withdraw");
			break;
		}
		case 2:{
			System.out.println("The amount for the deposit");
			break;
		}
		case 3:{
			System.out.println("check for the amount");
			break;
		}
		case 4:{
			System.out.println("exit.....");
			break;
		}
		default:{
			System.out.println("Wrong input");
		}
		
		}
		
		}

	}


