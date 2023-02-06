
public class Trabajo {
	//Atributos de instancia
	private String idTrabajo, descripcion; private double minSalario, maxSalario;

	//Métodos constructores	
	public Trabajo(String idTrabajo, String descripcion, double minSala, double maxSalario) {
		this.idTrabajo = idTrabajo; this.descripcion = descripcion; this.minSalario = minSala; this.maxSalario = maxSalario;
	}
	public Trabajo() {
	}

    //Métodos getter
	public String getIdTrabajo() {
		return idTrabajo;
	}
	public String getDescripcion() {
		return descripcion;
	}

	//Método toString por defecto;
	@Override
	public String toString() {
		return "Trabajo [idTrabajo=" + idTrabajo + ", descripcion=" + descripcion + ", minSalario=" + minSalario
				+ ", maxSalario=" + maxSalario + "]";
	}
}