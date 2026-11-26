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
class Demo{
	public static void main(String args[]){
		String source="S0001 Nimal\t67\n76";
		StringTokenizer st=new StringTokenizer(source);
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			System.out.println(token);
		}
	}
}
//Default delimiter->Space, newline, tab






