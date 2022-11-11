/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.ground;

/**
* Name: warren Buwan
* Section: IT Dept
* Year: 4th Year
*/
import java.util.Scanner;

import java.util.Scanner;

public class waren {
    

    public static Scanner input = new Scanner(System.in);
public static double quantity,total,pay,choose,price,ftotal;	
	public static void order(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Smallshoporder");
		System.out.println();

		
		while(true){
			System.out.println("To order FoodsItem, Enter 1");
			System.out.println("To order SnacksItem, Enter 2");
			System.out.println("To order BeveragesItem, Enter 3");
			System.out.println("To Exit, Enter 4");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Welcome to FoodsItem");
			FoodsItem();
			break;
			case 2: System.out.println("Welcome to SnacksItem");
			SnacksItem();
			break;
			case 3: System.out.println("Welcome to BeveragesItem");
			BeveragesItem();
			break;
			case 4: System.out.println("Thanks for ordering from Smallshoporder");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

	public static void FoodsItem(){
	
            System.out.println("You get:");
		System.out.println("1: Chicken = 50 php");
		System.out.println("2: Ramen = 60 php");
		System.out.println("3: Hamburgers = 80 php");
               int yourOrder =input.nextInt();
                if(yourOrder == 1){
                    price = 50;
                    
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                    
                    
                }
                else if(yourOrder == 1){
                    price = 60;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                    total = price * quantity;
                    ftotal += total;
                }
                else if(yourOrder == 1){
                    price = 80;
                    total += price;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                }
                else{
                    System.out.println("Out of option");
                }
               
            System.out.println("Enter a payment ");
    pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{

double change = pay - ftotal;
System.out.println("Total price is " + change);
	}
        }

	public static void SnacksItem(){
		System.out.println("You get:");
		System.out.println("Crispy patata = 15 php");
		System.out.println("Korniks ni Mang Juan = 20 php");
                System.out.println("Goodie-Goodie = 30 php");
                int yourOrder =input.nextInt();
                if(yourOrder == 1){
                    price = 15;
                    total += price;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                }
                else if(yourOrder == 2){
                    price = 20;
                    total += price;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                }
                else if(yourOrder == 3){
                    price = 30;
                    total += price;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                }
                else{
                    System.out.println("Out of option");
                }
                
      System.out.println("Enter a payment ");
    pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{

double change = pay - ftotal;
System.out.println("Total price is " + change);
	}
        }

	public static void BeveragesItem(){
		System.out.println("You get:");
		System.out.println("Kulafu = 80");
		System.out.println("Tang = 25");
		System.out.println("Ice = 4");
                int yourOrder =input.nextInt();
                if(yourOrder == 1){
                    price = 80;
                    total += price;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                }
                else if(yourOrder == 2){
                    price = 25;
                    total += price;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                }
                else if(yourOrder == 3){
                    price = 4;
                    total += price;
                    System.out.print("Enter the quantity of your order: ");
                    quantity = input.nextInt();
                }
                else{
                    System.out.println("Out of option");
                }
                
      

    System.out.println("Enter a payment ");
    pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{

double change = pay - ftotal;
System.out.println("Total price is " + change);
	}

if(choose==4) {
             System.exit(0); //close program
}else{
         System.out.println("Choose 1 to 4 only!");
order();
}
        
}
public static void main(String[] args) {
order();
	
}
}