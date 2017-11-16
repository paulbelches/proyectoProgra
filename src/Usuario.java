import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Embedded;
@Entity
public class Usuario {
	private String pass;
	private boolean tipo;
	@Id private ObjectId Id;
	@Embedded
	private Jugador alumno;
	/**
	 * @param alumno
	 * @param pass
	 * @param tipo
	 */
	public Usuario() {
		this.alumno = new Jugador();
		this.pass = "";
		this.tipo = false;
	}
	public Usuario(Jugador alumno, String pass, boolean tipo) {
		this.alumno = alumno;
		this.pass = pass;
		this.tipo = tipo;
	}
	public ObjectId getId() {
		return Id;
	}
	public Jugador getAlumno() {
		return alumno;
	}
	public void setAlumno(Jugador alumno) {
		this.alumno = alumno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "alumno:" + alumno ;
	}
	
	
}
