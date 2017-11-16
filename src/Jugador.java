import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Jugador {
	private String nombre;
	private String apellido;
	private int carne;
	private String carrera;
	private String email;
	private String telefono;
	/**
	 * @param nombre
	 * @param apellido
	 * @param carne
	 * @param carrera
	 * @param email
	 * @param telefono
	 */
	public Jugador() {
		this.nombre = null;
		this.apellido = null;
		this.carne = 0;
		this.carrera = null;
		this.email = null;
		this.telefono = null;
	}
	public Jugador(String nombre, String apellido, int carne, String carrera, String email, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.carne = carne;
		this.carrera = carrera;
		this.email = email;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCarne() {
		return carne;
	}
	public void setCarne(int carne) {
		this.carne = carne;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", carne=" + carne + ", carrera=" + carrera
				+ ", email=" + email + ", telefono=" + telefono + "]";
	}
	
	
	
	

}