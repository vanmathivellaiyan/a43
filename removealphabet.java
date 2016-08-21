package guviprogram;

import java.util.Scanner;

public class removealphabet {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String str="";
	str=sc.next();
	String count = "";
	char ch[]={'0','1','2','3','4','5','6','7','8','9'};
	for(int i=0;i<str.length();i++){
		for(int j=0;j<10;j++){
			if(str.charAt(i)==ch[j]){
				count+=str.charAt(i);
			}
		}
	}
	System.out.println(count);
	sc.close();
}
}
