package ControlFlow;

import java.util.Scanner;
public class TshirtTest{
  public static void main(String[] args){
    try (Scanner scanner = new Scanner(System.in)) {
		int[] prices={200, 250, 300};
		int[] discounts={0, 10, 20};
		int[] cart=new int[3];
		System.out.println("Enter the number of round_neck t-shirts:");
		cart[0]=scanner.nextInt();
		System.out.println("Enter the number of collared t-shirts:");
		cart[1]=scanner.nextInt();
		System.out.println("Enter the number of hooded t-shirts:");
		cart[2]=scanner.nextInt();
		int totalCost=0;
		for (int i=0;i < 3;i++){
		  totalCost+=cart[i]*prices[i];
		}
		int Shirts=cart[0]+cart[1]+cart[2];
		int discountIndex=Shirts<5?0:Shirts<=10?1:2;
		int discount=discounts[discountIndex];
		int finalAmount=totalCost-(totalCost*discount/100);
		System.out.println(" The Final Amount for all T-Shirts are: "+finalAmount);
	}
  }
}