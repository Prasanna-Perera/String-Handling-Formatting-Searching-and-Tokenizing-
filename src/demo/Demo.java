/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author ASUS ROG
 */
import java.io.*;
class Demo{
	public static void main(String args[]){
		File f1=new File("Demo.java");
		File f2=new File("icet");
		
		System.out.println("f1 : "+f1.exists());;
		System.out.println("f2 : "+f2.exists());;
		
		System.out.println("f1 is a directory : "+f1.isDirectory());;
		System.out.println("f1 is a file : "+f1.isFile());;
		
		System.out.println("f2 is a directory : "+f2.isDirectory());;
		System.out.println("f2 is a file : "+f2.isFile());;
		
	}
}














