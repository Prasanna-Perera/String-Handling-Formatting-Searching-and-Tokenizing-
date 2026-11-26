/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author ASUS ROG
 */
import java.util.*;
import java.util.regex.*;
class Demo{
	public static void main(String args[]){
		String source="S0001&Nimal*67%76";
		Scanner input=new Scanner(source);
		Pattern p=Pattern.compile("[\\W]");
		input.useDelimiter(p);
		while(input.hasNext()){
			System.out.println(input.next());
		}
	}
}







