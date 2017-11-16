import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;

@Embedded
public class Torneo {
	@Embedded
	private Ronda partidos;
	@Embedded
	private ArrayList<Equipo> equipo;
	private String nombre;
	public Torneo () {
		this.setNombre("");
		equipo = new ArrayList<Equipo>();
		partidos = new Ronda();
	}
	public Torneo (String nombre) {
		this.setNombre(nombre);
		equipo = new ArrayList<Equipo>();
		setPartidos(new Ronda());
	}
	public  Torneo(Ronda partidos, ArrayList<Equipo> equipo ) {
		this.equipo =equipo;
		this.setPartidos(partidos);
	}
	public ArrayList<Equipo> getEquipo() {
		return equipo;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(ArrayList<Equipo> equipoN) {
		this.equipo = equipoN;
	}
	public void agregarE(Equipo equipo){
		this.equipo.add(equipo);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ronda getPartidos() {
		return partidos;
	}
	public void setPartidos(Ronda partidos) {
		this.partidos = partidos;
	}
	public void Crear() {
		partidos.setEquipos(equipo);
		partidos.generar();
	}
}
