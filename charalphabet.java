package guviprogram;

import java.util.Scanner;

public class charalphabet {
	public static void main(String[] args){
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
	System.out.println("alphabet");
	}
else{
	System.out.println("not alphabet");
}

	
}
}

