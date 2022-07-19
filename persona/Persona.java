//importaciones y paquetes
package persona;

//Persona.java
//Clase Padre o superclase
public class Persona {
	//Atributos
	private String identificacion;
	private String nombre;
	private String apellido;
	private String sexo;
	//Constructores
	public Persona() {
	
	}
	public Persona(String identificacion, String nombre, String apellido, String sexo){
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}

	//Metodos GET Y SET
	public String getIdentificacion(){
		return identificacion;
	}
	public void setIdentificacion(String identificacion){
		this.identificacion = identificacion;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public String getSexo(){
		return sexo;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}

	//METODO TO STRING
	public String toString(){
		return "Id: " + identificacion + " ,Nombre Completo: " + nombre + " " + apellido + ", sexo: " + sexo;
	}

}