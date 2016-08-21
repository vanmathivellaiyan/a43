package guviprogram;

import java.util.Scanner;

public class diffalphabetNum {
	public static void main(String[] args){
	String str="";
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	int sto = 0;
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++){
		if(Character.isAlphabetic(ch[i])){
			sto=sto+1;
		}
	}
	System.out.println(sto);

}
}
