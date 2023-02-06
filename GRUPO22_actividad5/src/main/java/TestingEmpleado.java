
public class TestingEmpleado {
    public static void main (String args[]) {
    	
    	//Crear un objeto Localidad, un objeto Departamento con esa Localidad y un objeto Empleado con ese Departamento y ese Trabajo
		Localidad localidad0=new Localidad(28013, "Puerta del Sol S/N", "Madrid", "España");
		Departamento depto0=new Departamento(0, "Puestos de mando", localidad0);
    	Trabajo trabajo0=new Trabajo("i21", "jefe de producción", 50000, 100000);
    	Empleado empleado0=new Empleado(100, "Juan", "Felipe Guzman", 'H', "juanoso85@gmail.com", 81000, 20, trabajo0, depto0);
    	//La información completa de un empleado SIN usar to String.
    	empleado0.infoEmpleado();
    	//Extraer del empleado su trabajo y su departamento en variables de su tipo, y pintarlas con syso.
    	System.out.println(empleado0.getTrabajo());
    	System.out.println(empleado0.getDepartamento());

        //Creación de una empresa llamada "Zaratrusta" y asignación de empleados
        Empresa empresita=new Empresa("Zaratrusta");
        empresita.cargarDatos();
        System.out.println(empresita.alta(empleado0));
        System.out.println(empresita.eliminarUno(empleado0));
        System.out.println(empresita.modificarUno(empleado0));
        System.out.println(empresita.buscarPorSexo('H'));
        System.out.println(empresita.buscarUno(103));
        System.out.println(empresita.buscarTodos());
        System.out.println(empresita.masaSalarial());
        System.out.println(empresita.buscarPorDepartamento(5));
        System.out.println(empresita.buscarPorTrabajo("i22"));
        System.out.println(empresita.buscarPorPais("RUGBIN"));
    }
}
