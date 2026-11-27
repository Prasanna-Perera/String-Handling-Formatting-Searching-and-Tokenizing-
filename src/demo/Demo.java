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
		int x=100;
		Integer iob=x; //Legal, since JDK5 (Auto boxing)
		System.out.println(x+" : "+iob);//100 100
		
		int y;
		y=iob; //Legal, since JDK5 (Auto unboxing)
		System.out.println(y+" : "+iob);//100 100
	}
}







