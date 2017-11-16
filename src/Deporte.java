import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity
public class Deporte {
	@Embedded
	private ArrayList<Torneo> torneos;

	@Id private ObjectId Id;
	private String tipo;
	
	public Deporte() {
		this.tipo = "";
		this.torneos = new ArrayList<Torneo>();
	}
	public Deporte(String tipo) {
		this.tipo = tipo;
		this.torneos = new ArrayList<Torneo>();
	}
	public Deporte(ArrayList<Torneo> torneos, String tipo) {
		this.tipo = tipo;
		this.torneos = torneos;
	}
	/**
	 * @return the torneo
	 */
	public ArrayList<Torneo> getTorneo() {
		return torneos;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param torneos the torneos to set
	 */
	public void setTorneos(ArrayList<Torneo> torneos) {
		this.torneos = torneos;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void agregarTorneo(Torneo torneo) {
		this.torneos.add(torneo);
	}
	
}
