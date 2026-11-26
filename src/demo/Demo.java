/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author ASUS ROG
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
		String fs=String.format("%d",100,200,300,400);
		System.out.println(fs); //100
		
		fs=String.format("%2$d",100,200,300,400);
		System.out.println(fs); //200
		
		fs=String.format("%4d,%3d,%2d,%1d",100,200,300,400);
		System.out.println(fs); //400,300,200,100
		
		fs=String.format("%d,%d,%d,%d",100,200,300,400);
		System.out.println(fs); //100,200,300,400
	}
}

