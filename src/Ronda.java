import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class Ronda {
	@Embedded
	private ArrayList<Equipo> equipos;
	@Embedded
	private ArrayList<Partido> partidos;
	public Ronda() {
		equipos = new ArrayList<Equipo>();
		partidos = new ArrayList<Partido>();
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}
	public void agregarEquipo(Equipo e) {
		equipos.add(e);
	}
	public Equipo Ganador() {
		int[] pts = new int[equipos.size()];
		int pos = 0;
		for (int i = 0; i<partidos.size();i++) {
			if (partidos.get(i).getEstadistica().gettPuntos()[0] > partidos.get(i).getEstadistica().gettPuntos()[1]) {
				pos = 0;
			} else {
				pos = 1;
			}
			for (int j = 0; j < equipos.size(); j++) {
				if (equipos.get(j).getNombre().equals(partidos.get(i).getEquipo()[pos].getNombre())) {
					pts[pos] = pts[pos] + 1;
				}
			}
		}
		int m =0;
		pos = 0;
		for (int i = 0; i < pts.length; i++ ) {
			if (pts[i] > m) {
				m = pts[i];
				pos = i;
			}
		}
		return equipos.get(pos);
	}
	public void generar() {
		for (int i = 0; i<equipos.size(); i++) {
			for (int j = 0; j<equipos.size(); j++) {
				if (i!=j){ 
					partidos.add(new Partido(null,"","Cancha",new Estadisticas()));
					partidos.get(partidos.size()).Agregar(equipos.get(i), equipos.get(j));
				}
			}
		}
	}
	
	
}
