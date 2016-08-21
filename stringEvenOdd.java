package guviprogram;

import java.util.Scanner;

public class stringEvenOdd {
	public static void main(String args[]){
		String str="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String st ="";
		String sto="";
		for(int i=0;i<str.length();i++){
			if(i%2==0){
				st=st+""+str.charAt(i);
				//System.out.println(st+"");
			}
			else{
				sto=sto+str.charAt(i);
				//System.out.println(sto);
			}
		}
		System.out.println(st+"");
		System.out.println(sto);
	}

}
