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
		File f1=new File("E:/ICD125/IO/Demo.java");//Abolute path
		System.out.println("f1 : "+f1.exists());;
		
		File f2=new File("../ICD125/IO/Demo.java"); //Relative Path
		System.out.println("f2 : "+f2.exists());;
		
	}
}















