import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Conexion.Conexion;
import Consultas.ConsultasPersona;
import Model.Estudiante;

public class ClassMain {
	public static void main(String[] argumentos){
		Estudiante estudiente = new Estudiante("111","Carlos Hurtado",2,"111","carlos@gmail.com","4-1","M");
		ConsultasPersona c = new ConsultasPersona();
		c.insertarPersona("999", "Jose Calpa", 24, "12312", "email");
		@SuppressWarnings("resource")
		Scanner sn = new Scanner (System.in);
		boolean salir = false;
		int opc;
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Digite primer numero");
		numero1 = sn.nextInt();
		System.out.println("Digite segundo numero");
		numero2 = sn.nextInt();
		
		while(!salir) {
			System.out.println("1. Sumar");
	        System.out.println("2. Restar");
	        System.out.println("3. Dividir ");
	        System.out.println("4. Multiplicar");
	        System.out.println("5. Ingresar numeros de nuevo");
	        System.out.println("6. Salir");
	        System.out.println("7. Edad estudiante");
	        
	        try {
	        	System.out.println("Escribe una de las opciones");
		        opc = sn.nextInt();
	        	switch(opc){
	            case 1:
	                System.out.println("El resultado de la suma es: " + (numero1 + numero2));
	                break;
	            case 2:
	                System.out.println("El resultado de la resta es: " + (numero1 - numero2));
	                break;
	             case 3:
	                System.out.println("El resultado de la divición es: " + (numero1 / numero2));
	                break;
	             case 4:
		                System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
		                break;
	             case 5:
	            	 	System.out.println("Digite primer numero");
	            	 	numero1 = sn.nextInt();
	            	 	System.out.println("Digite segundo numero");
	            	 	numero2 = sn.nextInt();
		                break;
	             case 6:
	                salir=true;
	                break;
	             case 7:
	            	 	estudiente.cambiarEdad(18);
		                System.out.println("La edad del estudiante es: "+estudiente.getEdad());
		                System.out.println("La edad del estudiante es: "+estudiente.validarEdad());
		                System.out.println(estudiente.validarEdadEstudiante());
		                break;
	             default:
	                System.out.println("Solo números entre 1 y 6");
	        	}
	        }
	        catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
	        }
	        
		}
	}
}
