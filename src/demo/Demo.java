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
		d=x; //Legal, wider conversion
		x=(int)d; //Legal, narrow casting
		
		Double dob=null;
		Integer iob=null;
		dob=iob;	//Illegal
		dob=(Double)iob; //Illegal
		iob=dob; //Illegal
		iob=(Integer)dob; //Illegal
		
	}
}











