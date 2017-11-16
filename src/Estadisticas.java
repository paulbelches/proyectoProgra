import java.util.ArrayList;

public class Estadisticas {
	private int[] tFueras;
	private int[] tPuntos;
	private int[] tFaltas;
	
	public Estadisticas() {
		settFueras(new int[2]);
		settPuntos(new int[2]);
		settFaltas(new int[2]);
	}

	public int[] gettFueras() {
		return tFueras;
	}

	public void settFueras(int[] tFueras) {
		this.tFueras = tFueras;
	}

	public int[] gettPuntos() {
		return tPuntos;
	}

	public void settPuntos(int[] tPuntos) {
		this.tPuntos = tPuntos;
	}

	public int[] gettFaltas() {
		return tFaltas;
	}

	public void settFaltas(int[] tFaltas) {
		this.tFaltas = tFaltas;
	}
	
}
