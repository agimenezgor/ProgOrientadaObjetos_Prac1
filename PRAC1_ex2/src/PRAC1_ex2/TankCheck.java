package PRAC1_ex2;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NullPointerException;
import java.io.IOException;

/**
* Class that allows to check that the Tank class has been created right!!
* This class has several comments that we think that they will be useful for our students. Please, read all the comments (they are in Spanish).
* @author David Garcia Solorzano
* @version 1.0
*/
public class TankCheck{

	public static void main(String[] args){
		Tank tank = null;
		boolean exit = false;
		int operation = 0;
						
		do{
			System.out.println("\n*********Tank test***********");
			System.out.println("\n\t1. Create a default tank.");
			System.out.println("\n\n\t2. Get tank's name.");
			System.out.println("\n\n\t3. Set tank's name.");
			System.out.println("\n\n\t4. Current getter.");
			System.out.println("\n\n\t5. Set tank's length.");
			System.out.println("\n\n\t6. Exit.");
			System.out.println("*****************************");
			Scanner in = new Scanner(System.in);
			try{//Como se van a capturar errores, necesitamos poner el codigo que puede lanzar excepciones dentro de "try" y gestionar los posibles errores dentro de "catch"
				operation = in.nextInt();
			
				switch(operation){
					case 1:
							//Crear tank con los valores por defecto
							tank = new Tank();
							System.out.println(tank + " has been created!");
							break;
					case 2:
							//Obtener el valor del nombre
							System.out.println("Tank's name is " + tank.getName());
							break;
					case 3:
							//Asignar el nombre del tanque
							System.out.println("Please, type the tank's new name:");	
							in.nextLine(); //bug: to capture the "extra enter"							
							String name = in.nextLine();;
							tank.setName(name);						
							break;
					case 4:
							//Cambia getDescription por getImageBackground, getLength, getHeight, getWidth, getTemperature y getPh para probar los diferentes getters 
							System.out.println("tank's description is  " + tank.getDescription());
							break;
					case 5:
							//Asignar la longitud del tanque
							System.out.println("Type the length of the tank");
							double value = in.nextDouble();
							tank.setLength(value);
							System.out.println("The tank's length is "+ tank.getLength());
							break;					
					case 6: 
							//Salir del programa.
							exit = true;
							in.close();
							break;
				}
			}catch(InputMismatchException e1){//Error que se lanza si el valor, en este caso introducido por teclado, no es un nï¿½mero.
				System.err.println("[ERROR] You have to enter a number!!");
			}catch(NullPointerException e2){//Error que se lanza cuando se intenta acceder a un objeto que no ha sido instanciado (i.e. no se ha hecho previamente "new").
				System.err.println("[ERROR] You have to create a tank first!!");
			}catch(Exception e3){ //Gestión del error lanzado por el constructor de la clase Tank que usa los diferentes setters, los cuales pueden lanzar una excepción (Ejercicio 2)
				System.err.println(e3.getMessage());
				
			}
			
			if(operation!=6){				
				System.out.println("\nPress Enter to continue...");
				try{
					/*
						Como el mï¿½todo "read" puede lanzar una excepciï¿½n (su implementaciï¿½n tiene un "throws IOException" (IOException es un caso particular de Exception), ponemos la lï¿½nea dentro de try
						y gestionamos el error dentro del catch. Si en el catch, en vez de IOException ponemos Exception, tambiï¿½n funcionarï¿½ por el concepto de herencia (lo veremos mï¿½s adelante en los apuntes).
					*/
					System.in.read();
				}catch(IOException enterError){
					System.err.println("[ERROR] Keyboard input throwed an exception!!");
				}			
			}			
			
		}while(!exit);
		System.out.println("Bye!!");		
	}	
}