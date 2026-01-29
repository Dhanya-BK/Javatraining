package decisionstat;
import java.util.Scanner;

public class Restaurants {

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
		
		if(curry==1) {
			System.out.println("You opted for Chatni");
			System.out.println("Thank You For Your Order...");
		}
		else {
			System.out.println("You opted for Sambar");
			System.out.println("Thank You For Your Order...");
		}
		}break;
		
		
	  case 2:{
			System.out.println("you opted for Rice,what do you want with it:");
			System.out.println("1.Chatni");
			System.out.println("2.Sambar");
			System.out.println("enter you choice:");
			int curry=sc.nextInt();
			
			if(curry==1) {
				System.out.println("You opted for Chatni");
				System.out.println("Thank You For Your Order...");
			}
			else {
				System.out.println("You opted for Sambar");
				System.out.println("Thank You For Your Order...");
			}
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

                if(curry==1) {
	                System.out.println("You opted for Chatni");
	                System.out.println("Thank You For Your Order...");
                }
                else {
	                System.out.println("You opted for Sambar");
	                System.out.println("Thank You For Your Order...");
                }
            }break;
          case 2:{
        	  System.out.println("you opted for Dosa,what do you want with it:");
              System.out.println("1.Chatni");
              System.out.println("2.Sambar");
              System.out.println("enter you choice:");
              int curry=sc.nextInt();

                if(curry==1) {
	                System.out.println("You opted for Chatni");
	                System.out.println("Thank You For Your Order...");
                }
                else {
	                System.out.println("You opted for Sambar");
	                System.out.println("Thank You For Your Order...");
                }
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
				System.out.println("You choose non-vegetarian food,we have:");
				System.out.println("1.North Indian food");
				System.out.println("2.South Indian food");
				System.out.println("Enter your choice:");
				int option=sc.nextInt();
				
	   switch(option) {
	   case 1:{
			System.out.println("you opted for North Indian");
			System.out.println("you have different varieties of items:");
			System.out.println("1.chicken butter masala");
			System.out.println("2.chicken biriyani");
			System.out.println("Your choice please:");
			int items=sc.nextInt();
			
		  switch(items) {
		  case 1:{
			System.out.println("you opted for chicken butter masala,what do you want with it:");
			System.out.println("1.rice");
			System.out.println("2.roti");
			System.out.println("enter you choice:");
			int curry=sc.nextInt();
			
			if(curry==1) {
				System.out.println("You opted for rice");
				System.out.println("Thank You For Your Order...");
			}
			else
			{
				System.out.println("You opted for roti");
				System.out.println("Thank You For Your Order...");
			}
			}break;
			
			
		  case 2:{
				System.out.println("you opted for chickrn biriyani,what do you want with it:");
				System.out.println("1.salad");
				System.out.println("2.curd");
				System.out.println("enter you choice:");
				int curry=sc.nextInt();
				
				if(curry==1) {
					System.out.println("You opted for salad");
					System.out.println("Thank You For Your Order...");
				}
				else {
					System.out.println("You opted for curd");
					System.out.println("Thank You For Your Order...");
				}
				}break;
			default:{
				System.out.println("Enter proper number");
			}
	
		  }
					
				}break;
				
		case 2:{
	        System.out.println("you opted for south Indian");
	        System.out.println("you have different varieties of items:");
	        System.out.println("1.chicken pepper");
	        System.out.println("2.chilli chicken");
	        System.out.println("Your choice please:");
	        int items=sc.nextInt();

	        switch(items) {
	          case 1:{
	              System.out.println("you opted for chicken pepper,what do you want with it:");
	              System.out.println("1.rice");
	              System.out.println("2.chapathi");
	              System.out.println("enter you choice:");
	              int curry=sc.nextInt();

	                if(curry==1) {
	                
	               
		                System.out.println("You opted for rice");
		                System.out.println("Thank You For Your Order...");}
	                else {
		                System.out.println("You opted for chapathi");
		                System.out.println("Thank You For Your Order...");
	                }
	            }break;
	          case 2:{
	        	  System.out.println("you opted for chilli chicken,what do you want with it:");
	              System.out.println("1.rice");
	              System.out.println("2.chapathi");
	              System.out.println("enter you choice:");
	              int curry=sc.nextInt();

	                if(curry==1) {
		                System.out.println("You opted for rice");
		                System.out.println("Thank You For Your Order...");
	                }
	                else {
		                System.out.println("You opted for chapathi");
		                System.out.println("Thank You For Your Order...");}
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
		
default: System.out.println("Enter proper number");
	
}


	}
	
	
}

	





