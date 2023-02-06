import java.util.Objects;

public class Localidad {
    //Atributos de instancia
	private int idLocalidad; private String direccion, ciudad, pais;
	//Métodos constructores
	public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
		this.idLocalidad = idLocalidad; this.direccion = direccion; this.ciudad = ciudad; this.pais = pais;
	}
	public Localidad() {
	}
	
	//Métodos getter
	public String getDireccion() {
		return direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getPais() {
		return pais;
	}

	//Método toString por defecto
	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}

	//Método hashCode
	@Override
	public int hashCode() {
		return Objects.hash(idLocalidad);
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
		Localidad other = (Localidad) obj;
		return idLocalidad == other.idLocalidad;
	}
}
