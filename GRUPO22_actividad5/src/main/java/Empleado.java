
import java.util.Objects;

public class Empleado {
	//Atributos de instancia
	private int idEmpleado; private String nombre, apellidos;
	private char sexo; private String email; private double salario, comision;
	private Trabajo trabajo; private Departamento departamento;
	
	//Métodos constructores
	public Empleado(int idEmpleado, String nombre, String apellidos, char sexo, String email, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		this.idEmpleado = idEmpleado; this.nombre = nombre; this.apellidos = apellidos; this.sexo = sexo;
		this.email = email; this.salario = salario; this.comision = comision; this.trabajo = trabajo;
		this.departamento = departamento;
	}
	public Empleado() {
	}

	//Métodos getter
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public char getSexo() {
		return sexo;
	}
	public double getSalario() {
		return salario;
	}
	//Métodos getter (para que muestre por consola datos legibles se necesita toString en clase Trabajo)
	public Trabajo getTrabajo() {
		return trabajo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	//Métodos getter (para que muestre por consola datos legibles se necesita toString en clase Departamento)
	public String getIdTrabajo() {
		return trabajo.getIdTrabajo();
	}
	public int getIdDepartamento() {
		return departamento.getIdDepar();
	}
	//Métodos getter (para que muestre por consola datos legibles se necesita toString en clase Departamento)
	public String getPaisss() {
		return departamento.getPaiss();
	}
	
	//Métodos public NOestáticos propios
	public double salarioBruto() {
		return salario+comision;
	}
	public String nombreCompleto() {
		return nombre+""+apellidos;
	}
	public double salarioMensual(int meses) {
		return salario/meses;
	}
	public String obtenerEmail() {
		String apellidosminusculas=this.apellidos.toLowerCase();
		int posprimerapellido=apellidosminusculas.indexOf(' ');
		return obtenerEmail().charAt(0)+apellidosminusculas.substring(0,posprimerapellido);
	}
	public String literalSexo() {
		if (this.sexo=='H') {
			return "Hombre";
		}
		if (this.sexo=='M') {
			return "Mujer";
		}
		else
			return "Desconocido";
	}
	
	//Método toString por defecto
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", email=" + email + ", salario=" + salario + ", comision=" + comision + ", trabajo=" + trabajo
				+ ", departamento=" + departamento + "]";
	}
	//Método hashCode
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
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
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	//Método Noestático propio
	public void infoEmpleado() {
		System.out.println(nombre+" "+apellidos+", del dpto. "+departamento.getDescripcion()+", es "+trabajo.getDescripcion()
        + " y su dpto. está en " +departamento.muestraDireccion()+" en el municipio de "+departamento.muestraCiudad()+"(" +
				departamento.muestraPais()+").");
	}

}
