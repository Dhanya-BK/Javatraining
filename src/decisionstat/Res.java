package decisionstat;


import java.util.Scanner;

public class Res {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("welcome to restaurant:");
		


		System.out.println("1.vegetarian food");
		System.out.println("2.Non vegetarian food:");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
switch(choice){

case 1:{
			System.out.println("You choose vegetarian food,we have:");
			System.out.println("1.North Indian food");
			System.out.println("2.South Indian food");
			System.out.println("Enter your choice:");
			int option=sc.nextInt();
			
   switch(option) {
   case 1:{
		System.out.println("you opted for North Indian");
		System.out.println("you have different varieties of items:");
		System.out.println("1.Parata");
		System.out.println("2.Rice");
		System.out.println("Your choice please:");
		int items=sc.nextInt();
		
	  switch(items) {
	  case 1:{
		System.out.println("you opted for parata,what do you want with it:");
		System.out.println("1.Chatni");
		System.out.println("2.Sambar");
		System.out.println("enter you choice:");
		int curry=sc.nextInt();
		
		if(curry==1)
			System.out.println("You opted for Chatni");
		else
			System.out.println("You opted for Sambar");
		}break;
		
		
	  case 2:{
			System.out.println("you opted for Rice,what do you want with it:");
			System.out.println("1.Chatni");
			System.out.println("2.Sambar");
			System.out.println("enter you choice:");
			int curry=sc.nextInt();
			
			if(curry==1)
				System.out.println("You opted for Chatni");
			else
				System.out.println("You opted for Sambar");
			}break;
		default:{
			System.out.println("Enter proper number");
		}
				
	  }
				
			}break;
			
	case 2:{
        System.out.println("you opted for south Indian");
        System.out.println("you have different varieties of items:");
        System.out.println("1.Idli");
        System.out.println("2.Dosa");
        System.out.println("Your choice please:");
        int items=sc.nextInt();

        switch(items) {
          case 1:{
              System.out.println("you opted for Idli,what do you want with it:");
              System.out.println("1.Chatni");
              System.out.println("2.Sambar");
              System.out.println("enter you choice:");
              int curry=sc.nextInt();

                if(curry==1)
	                System.out.println("You opted for Chatni");
                else
	                System.out.println("You opted for Sambar");
            }break;
          case 2:{
        	  System.out.println("you opted for Dosa,what do you want with it:");
              System.out.println("1.Chatni");
              System.out.println("2.Sambar");
              System.out.println("enter you choice:");
              int curry=sc.nextInt();

                if(curry==1)
	                System.out.println("You opted for Chatni");
                else
	                System.out.println("You opted for Sambar");
            }break;
          default:{
  			System.out.println("Enter proper number");
  		}
        	  
          }
        }break;
	default:{
		System.out.println("Enter proper number");
	}
		
		
	}
	}break;
case 2:{
	    System.out.println("You choose Non-Vegetarian food,we have:");
	    System.out.println("1.Chicken");
	    System.out.println("2.Egg");
	    System.out.println("Enter your choice:");
	    int option=sc.nextInt();
	
        switch(option) {
         case 1:{
            System.out.println("you chose chicken");
            System.out.println("you have different varieties of items:");
            System.out.println("1.Chicken curry");
            System.out.println("2.Chicken Biriyani");
            System.out.println("Your choice please:");
            int items=sc.nextInt();
            if(items==1)
            	System.out.println("you chose chicken curry");
            else
            	System.out.println("you chose for chicken biriyani");
         }break;
         
         case 2:{
             System.out.println("you chose Egg");
             System.out.println("you have different varieties of items:");
             System.out.println("1.Egg curry");
             System.out.println("2.Egg Biriyani");
             System.out.println("Your choice please:");
             int items=sc.nextInt();
             if(items==1)
             	System.out.println("you chose Egg curry");
             else
             	System.out.println("you chose for Egg biriyani");
          }break;
         default:{
 			System.out.println("Enter proper number");
 		}
	
}
	}break;
default:{
	System.out.println("Enter proper number");
}
}
System.out.println("Thank You For Your Order...");
	}
}

	


