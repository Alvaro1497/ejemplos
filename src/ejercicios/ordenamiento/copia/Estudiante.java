package ejercicios.ordenamiento.copia;

//por cada atributo debe de haber set y get
public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private int numeroLista;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		if (this.numeroLista > o.getNumeroLista()) {
			return 1;
		} else if (this.numeroLista == o.getNumeroLista()) {

			return 0;
			
		} else {
			return -1;
		}

	}

}
