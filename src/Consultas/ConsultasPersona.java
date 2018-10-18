package Consultas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Conexion.Conexion;

public class ConsultasPersona {
	
	protected Connection con;
	protected Statement consulta;
	
	public ConsultasPersona() {
		try {
			this.con = Conexion.crearConexion();
			consulta= con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insertarPersona(String ide, String nom, int edad, String tel, String email) {
		String sql = "insert into persona (ide,nom,edad,tel,email) "
				+ "values ('"+ide+"','"+nom+ "'," +edad+",'"+tel+ "','"+ email+"');"; 
		try {
			consulta.executeUpdate(sql);
			System.out.println("Registro exitoso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void consultarPersonas() {
		String sql = "SELECT * FROM PERSONA";
		try {
			ResultSet rs = consulta.executeQuery(sql);
			while(rs.next()) {
				System.out.print("Identificacion: " + rs.getString(1)+ " - ");
				System.out.print("Nombre: " + rs.getString(2)+ " - ");
				System.out.print("Edad: " + rs.getString(3)+ " - ");
				System.out.print("Telefono: " + rs.getString(4)+ " - ");
				System.out.print("Email: " + rs.getString(5));
				System.out.println("");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void consultarPersona(String ide) {
		String sql = "SELECT * FROM PERSONA WHERE IDE = '"+ ide + "';";
		try {
			ResultSet rs = consulta.executeQuery(sql);
			while(rs.next()) {
				System.out.print("Identificacion: " + rs.getString(1)+ " - ");
				System.out.print("Nombre: " + rs.getString(2)+ " - ");
				System.out.print("Edad: " + rs.getString(3)+ " - ");
				System.out.print("Telefono: " + rs.getString(4)+ " - ");
				System.out.print("Email: " + rs.getString(5));
				System.out.println("");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean update(List<String> list) {
		boolean ban = false;
		String sql = "update persona set nom = '" + list.get(1) + "', tel = '" + list.get(2) +"', email = ' " + list.get(3) + "' "
				+ "where ide = '" + list.get(0) +"'";
		try {
			consulta.executeUpdate(sql);
			ban = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ban;
	}
	
	public boolean delete(String ide) {
		boolean ban = false;
		String sql = "delete from persona where ide = '" + ide +"';";
		System.out.println(sql);
		try {
			consulta.executeUpdate(sql);
			ban = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ban;
	}
}
