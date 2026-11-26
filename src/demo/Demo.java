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
		String source="S0001,Nimal,67,76";
		String[] rowData=source.split(",");
		for(String str : rowData){
			System.out.println(str);
		}
	}
}







