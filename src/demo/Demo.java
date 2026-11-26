/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author ASUS ROG
 */
import java.util.regex.*;
class Demo{
	public static void main(String args[]){
		String source="abc0X12bcjtg0x456bcrty0x12a&g0xhjd0123bcgh";
		Pattern p=Pattern.compile("0[Xx][a-fA-F0-9]+");
		Matcher m=p.matcher(source);
		while(m.find()){
			String str=m.group();
			System.out.println(str);
		}
	}
}





