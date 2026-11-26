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
		String fs=String.format("%2$25f",100,12345600.3435);
		System.out.println(fs); //
		fs=String.format("%2$,25f",100,12345600.3435);
		System.out.println(fs); //
		fs=String.format("%2$,+25f",100,12345600.3435);
		System.out.println(fs); //
		fs=String.format("%2$,+025f",100,12345600.3435);
		System.out.println(fs); //
		fs=String.format("%2$(,+025f",100,-12345600.3435);
		System.out.println(fs); //
		
		fs=String.format("%2$-(,+25f",100,-12345600.3435);
		System.out.println(fs); //
	}
}



