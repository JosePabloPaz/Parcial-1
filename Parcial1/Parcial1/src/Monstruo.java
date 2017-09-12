import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Jose Pablo Paz
 */

public class Monstruo implements FabricaRanger {
	
	private String Nombre;
	private String Elemento;
	private int Edad;
	private String Color; 
	@SuppressWarnings("rawtypes")
	private Stack monsS = new Stack();
	Queue<Monstruo> MonsQ = new LinkedList<Monstruo>();

	/**
	 * @return  Agiganta al monstruo 
	 */
	public String Agigantarse(){
		return "Soy un monstruo y me agiganto";
	}
	
	/**
	 * @return   El monstruo camina lento
	 */
	public String caminarLento() {
		return "Soy un monstruo y camino";
	}
	
	/**
	 * @return   Hace que el monstruo golpee
	 */
	public String Golpear(){
		return "Soy un monstruo y golpeo";
	}
	
	/**
	 * @return   El monstruo vuela (si es tipo Viento)
	 */
	public String Volar() {
		return "Soy un monstruo y vuelo";
	}
	
	/**
	 * @return   El monstruo quema (si es tipo Fuego)
	 */
	public String Quemar() {
		return "Soy un monstruo y estoy quemando";
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void apilar(Monstruo monstruo) {
		monsS.push(monstruo);
	}

	@SuppressWarnings("null")
	@Override
	public void desapilar(Monstruo monstruo) {
		@SuppressWarnings("rawtypes")
		Stack monsS = null;
		monsS.pop();
	}

	@Override
	public void encolar(Monstruo monstruo) {
		MonsQ.add(monstruo);
	}

	@Override
	public void desencolar(Monstruo monstruo) {
		MonsQ.poll();
	}

	@SuppressWarnings("null")
	@Override
	public void fabricar(String elemento) {
		Object MonsS = null;
		MonsS.toString();
	}

	/**
	 * @return   El nombre del nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return   El elemento del monstruo
	 */
	public String getElemento() {
		return Elemento;
	}

	public void setElemento(String elemento) {
		Elemento = elemento;
	}

	/**
	 * @return   La edad del monstruo
	 */
	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	/**
	 * @return   El Color del monstruo
	 */
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	
	
}
