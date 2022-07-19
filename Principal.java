//Importaciones y paquetes
import persona.*;

//Principal.java
public class Principal{
	public static void main(String args[]){
		//Instanciar
		//LLama al constructor vacio
		Persona familiar = new Persona();

		familiar.setIdentificacion("J-2 5486917");
		familiar.setNombre("Enrique");
		familiar.setApellido("Gonzales");
		familiar.setSexo("Masculino");
		System.out.println("Los datos son: " + familiar.getNombre());
		//System.out.println("Segunda opcion " + familiar); //Segunda opción de hacerlo

		Alumno alumnoA = new Alumno();
		alumnoA.setNombre("Juan");
		alumnoA.setApellido("Perez");
		alumnoA.setIdentificacion("K-6 1679334");
		alumnoA.setSexo("Masculino");
		alumnoA.setEdad(15);
		alumnoA.setCarnet(2020365);
		alumnoA.setGrado("4to");
		alumnoA.setSeccion("IN4BV");

		System.out.println("Edad: " + alumnoA.getEdad() + ", carnet:" + alumnoA.getCarnet() );
		System.out.println("Datos completos alumno: " + alumnoA.toString() );


		//System.out.println("EJECUTANDO");
		//metodo();	//MANDO A LLAMAR AL METODO ESTATICO
	}

	//BLOQUES ESTATICOS, SE EJECTURAN PRIMERO EN EL CODIGO
	/*static int a=3;
	static int b;
	static void metodo() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static {
		System.out.println("Bloque Estático");
		b = a * 10;
	}	*/
	
}