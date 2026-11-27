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
		double d=1.0;
		int x=200;
				
		Double dob=d;
		Integer iob=x;
		dob=x; //Illegal
		
		d=iob; //Legal->auto unbox iob->int, wider conversion int to double
	}
}











