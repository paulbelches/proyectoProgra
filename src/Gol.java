
public class Gol {
	private Jugador jugador;
	private int cantidad;
	/**
	 * @param jugador
	 * @param cantidad
	 */
	public Gol(Jugador jugador, int cantidad) {
		this.jugador = jugador;
		this.cantidad = cantidad;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
