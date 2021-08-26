package gpf;

public class Personal implements Comparable<Personal> {
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	
	

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Personal o) {
		if (this.salario > o.getSalario()) {
			return 1;
		} else if (this.salario == o.getSalario()) {

			return 0;

		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return "\nPersonal [nombre= " + nombre + ", apellido= " + apellido + ",  edad= " + edad + ",  salario= "
				+ salario + "]";
	}

}
