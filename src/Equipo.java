import java.awt.Component;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class Equipo {
	@Embedded
	private ArrayList<Jugador> jugadores;
	//private ArrayList<Jugador> jugadores2;
	private String nombre;
	private String descripcion;
	
	public Equipo() {
		this.jugadores = new ArrayList();
		this.nombre = "";
		this.descripcion = "";
	}
	/**
	 * @param jugadores
	 * @param nombre
	 * @param descripcion
	 */
	public Equipo(String nombre) {
		this.jugadores = new ArrayList();
		this.nombre = nombre;
		this.descripcion = "";
	}
	public Equipo(ArrayList<Jugador> jugadores, String nombre, String descripcion) {
		this.jugadores = jugadores;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	//Jugador gustavo = new Jugador("Gustavo"," De Leon", 17085, "ccti" ,"dele17085@uvg.edu.gt", "54197531");
	//Jugador luis = new Jugador ("Luis ","Esturban", 17261, "ccti" ,"est17261@uvg.edu.gt", "23546552");
	
	//Jugador paul = new Jugador("Paul"," Belches" , 17088, "ccti", "bel17088@uvg.edu.gt", "123465");
	//Jugador toni = new Jugador ("Antonio"," Reyes" ,17100, "ccti", "rey17100@uvg.edu.gt", "54197530");
	
	
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void agregarJ(Jugador jugador) {
		jugadores.add(jugador);
	}
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < jugadores.size(); i++) {
			s = jugadores.get(i).toString();
		}
		return "Equipo [jugadores=" + s + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
