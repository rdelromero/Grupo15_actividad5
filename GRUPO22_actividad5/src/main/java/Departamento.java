import java.util.Objects;

public class Departamento {
	//Atributos de instancia
	private int idDepar; private String descripcion; private Localidad localidad;

	//Métodos constructores
	public Departamento(int idDepar, String descripcion, Localidad localidad) {
		this.idDepar = idDepar; this.descripcion = descripcion; this.localidad = localidad;
	}
	public Departamento() {
	}

	//Métodos getter
	public int getIdDepar() {
		return idDepar;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getPaiss() {
		return localidad.getPais();
	}
	
	
	public String muestraDireccion() {
		return localidad.getDireccion();
	}
	public String muestraCiudad() {
		return localidad.getCiudad();
	}
	public String muestraPais() {
		return localidad.getPais();
	}
	
	//Método toString por defecto
	@Override
	public String toString() {
		return "Departamento [idDepar=" + idDepar + ", descripcion=" + descripcion + ", localidad=" + localidad + "]";
	}

	//Método hasCode
	@Override
	public int hashCode() {
		return Objects.hash(idDepar);
	}
	//Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return idDepar == other.idDepar;
	}
}
