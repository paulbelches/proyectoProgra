import java.util.ArrayList;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Embedded;
@Entity
public class Admin {
	@Id private ObjectId Id;
	@Embedded
	private ArrayList<Deporte> deportes;
	@Embedded
	private ArrayList<Usuario> usuarios;
	
	/*
	Jugador toni = new Jugador("Antonio", "Re", 17273, "compu", "asdf@gmail.com", "1231");
	
	Jugador paul = new Jugador ("Paul", "Bel", 1234, "compu", "agrg", "312");
	
	Jugador gustavo = new Jugador ("Gustavo", "ass", 363, "compu", "33qg", "512");
	
	/*
	Usuario paulBelches = new Usuario(paul, "1252", false);
	
	Usuario antonio = new Usuario(toni, "123", false);
	
	Usuario gustavoLeon = new Usuario(gustavo, "523", false);

	*/
	public Admin(String[] deportes) {
		this.deportes = new ArrayList<Deporte>();
		usuarios = null;
		for (int i = 0; i<deportes.length;i++) {
			this.deportes.add(new Deporte(deportes[i]));
		}
	}
	public Admin(ArrayList<Deporte> deportes, ArrayList<Usuario> usuarios) {
		this.deportes=deportes;
		this.usuarios=usuarios;
		
	}
	/**
	 * @return the deportes
	 */
	public ArrayList<Deporte> getDeportes() {
		return deportes;
	}
	/**
	 * @param deportes the deportes to set
	 */
	public void setDeportes(ArrayList<Deporte> deportes) {
		this.deportes = deportes;
	}
	/**
	 * @return the usuarios
	 */
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	/**
	 * @return the usuarios
	 */
	public Usuario getUsuarios(int pos) {
		return usuarios.get(pos);
	}
	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
