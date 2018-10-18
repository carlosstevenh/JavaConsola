package Model;

public class Estudiante extends Persona{

	protected String curso;
	protected String genero;
	public Estudiante(String ide, String nom, int edad, String tel, String email, String curso, String genero) {
		super(ide, nom, edad, tel, email);
		this.curso = curso;
		this.genero = genero;
		// TODO Auto-generated constructor stub
	}
	
	public int getEdad() {
		return super.edad;
	}
	public String validarEdadEstudiante() {
		String validar = "";
		boolean ban = super.validarEdad();
		if(ban)
			validar = "El estudiante  es mayor de edad";
		else
			validar = "El estudiante no es mayor de edad";
		return validar;
	}

}
