package nonstatic;

import java.util.Scanner;

public class PrintEven {
	
	public void even(int start,int end) {
		for(int i=start;i<=end;i++) {
			
			if((i&1)==0) {
				if(i==end || i==end-1)
				System.out.print(i+".");
				else
					System.out.print(i+",");
				
					
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int start=sc.nextInt();
			int end=sc.nextInt();
			PrintEven pe=new PrintEven();
			pe.even(start,end);
			
		}
		

	}


