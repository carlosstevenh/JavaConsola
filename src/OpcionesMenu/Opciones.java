package OpcionesMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Persona;


public class Opciones {
	protected Scanner sn = new Scanner (System.in);
	
	public Opciones() {}
	
	public Persona getPersona() {
		System.out.print("Por favor digite identificación: ");
    	String ide = sn.nextLine();
    	System.out.print("Por favor digite nombre: ");
    	String nom = sn.nextLine();
    	System.out.print("Por favor digite edad: ");
    	String edad = sn.nextLine();
    	System.out.print("Por favor digite telefono: ");
    	String tel = sn.nextLine();
    	System.out.print("Por favor digite Email: ");
    	String email = sn.nextLine();
    	System.out.println("");
    	
    	int e = Integer.parseInt(edad);
    	return new Persona(ide,nom,e,tel,email);
	}
	
	public String getIndentificacion() {
		System.out.print("Digite identificación; ");
		return sn.nextLine();
	}
	
	public List<String> update(){
		List<String> list = new ArrayList<String>();
		System.out.print("Por favor digite identificación: ");
    	list.add(sn.nextLine());
    	System.out.print("Por favor digite nombre: ");
    	list.add(sn.nextLine());
    	System.out.print("Por favor digite telefono: ");
    	list.add(sn.nextLine());
    	System.out.print("Por favor digite Email: ");
    	list.add(sn.nextLine());
    	System.out.println("");
    	
    	return list;
	}
	public String delete(){
		System.out.print("Por favor digite identificación: ");
    	return sn.nextLine();
	}
}
