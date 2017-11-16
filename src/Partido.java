import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class Partido {
	@Embedded
	private Equipo[] equipo = new Equipo[2];
	private String fecha;
	private String locacion;
	private Estadisticas estadistica;
	
	public Partido() {
		fecha = "";
		locacion = "";
		estadistica = new Estadisticas();
	}
	/**
	 * @param equipo
	 * @param fecha
	 * @param locacion
	 * @param estadistica
	 * 
	 */
	public Partido(Equipo[] equipo, String fecha, String locacion, Estadisticas estadistica) {
		this.equipo = equipo;
		this.fecha = fecha;
		this.locacion = locacion;
		this.estadistica = estadistica;
	}
	/**
	 * @return the equipo
	 */
	public Equipo[] getEquipo() {
		return equipo;
	}
	public void Agregar(Equipo e1, Equipo e2) {
		equipo[0]=e1;
		equipo[1]=e2;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo[] equipo) {
		this.equipo = equipo;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the locacion
	 */
	public String getLocacion() {
		return locacion;
	}
	/**
	 * @param locacion the locacion to set
	 */
	public void setLocacion(String locacion) {
		this.locacion = locacion;
	}
	/**
	 * @return the estadistica
	 */
	public Estadisticas getEstadistica() {
		return estadistica;
	}
	/**
	 * @param estadistica the estadistica to set
	 */
	public void setEstadistica(Estadisticas estadistica) {
		this.estadistica = estadistica;
	}
}
