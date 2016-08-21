package guviprogram;

import java.util.Scanner;

public class mathrandom {
public static void main(String[] args){
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	num=(int)(Math.random()*num);
	System.out.println(num);
}
}
