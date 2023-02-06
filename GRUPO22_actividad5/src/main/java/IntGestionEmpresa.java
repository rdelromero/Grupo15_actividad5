import java.util.ArrayList;
public interface IntGestionEmpresa {
	public abstract boolean alta(Empleado empleado);
	public abstract boolean eliminarUno(Empleado empleado);
	public abstract boolean modificarUno(Empleado empleado);
	public abstract ArrayList<Empleado> buscarPorSexo(char sexo);
	public abstract Empleado buscarUno(int idEmpleado);
	public abstract ArrayList<Empleado> buscarTodos();
	public abstract double masaSalarial();
	public abstract ArrayList<Empleado> buscarPorDepartamento(int idDepar);
	public abstract ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	public abstract ArrayList<Empleado> buscarPorPais(String pais);
}
