import java.util.InputMismatchException;
import java.util.Scanner;

import Consultas.ConsultasPersona;
import Model.Persona;
import OpcionesMenu.Opciones;

public class BaseDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opciones opciones = new Opciones();
		ConsultasPersona consultaPersona = new ConsultasPersona();
		@SuppressWarnings("resource")
		Scanner sn = new Scanner (System.in);
		boolean salir = false;
		int opc;
		
		while(!salir) {
			System.out.println("1. Insertar persona");
	        System.out.println("2. Consultar personas");
	        System.out.println("3. Consultar persona  ");
	        System.out.println("4. Editar persona");
	        System.out.println("5. Eliminar persona");
	        System.out.println("6. Salir");
	        
	        try {
	        	System.out.print("Escribe una de las opciones; ");
		        opc = sn.nextInt();
	        	switch(opc){
	            case 1:
	            	Persona persona = opciones.getPersona();
	            	consultaPersona.insertarPersona(persona.identification, persona.nombre, persona.edad,
	            			persona.telefono, persona.email);
	            	
	            	System.out.println("");
	                
	                break;
	            case 2:
	                System.out.println("Las personas registras son: ");
	                consultaPersona.consultarPersonas();
	                System.out.println("");
	                break;
	             case 3:
	                consultaPersona.consultarPersona(opciones.getIndentificacion());
	                System.out.println("");
	                break;
	             case 4:
		                boolean ban = consultaPersona.update(opciones.update());
		                if(ban)
		                	System.out.print("El registro se actualizo exitosamente");
		                else
		                	System.out.print("El registro no se actualizo ");
		                
		                System.out.println("");
		                break;
	             case 5:
	            	 	boolean del = consultaPersona.delete(opciones.delete());
		                if(del)
		                	System.out.print("El registro se elimino exitosamente");
		                else
		                	System.out.print("El registro no se elimino ");
		                
		                System.out.println("");
		                break;
	             case 6:
	                salir=true;
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
