import java.util.ArrayList; import java.util.Arrays;
public class Empresa {
    //Atributos de instancia
	private String nombre; ArrayList<Empleado> plantilla;

    //Método constructor
	public Empresa(String nombre) {
		this.nombre = nombre;
	}
	
	public void cargarDatos() {
		Localidad localidad1=new Localidad(28001, "calle Serrano 28", "Madrid", "España");
		Localidad localidad2=new Localidad(516, "333 Oxford St", "Londres", "RUGBIN");
		Trabajo trabajo1=new Trabajo("i21", "contable", 25000, 40000);
		Trabajo trabajo2=new Trabajo("i22", "dependiente", 20000, 25000);
		Departamento depto1=new Departamento(3, "finanzas", localidad1);
		Departamento depto2=new Departamento(5, "atcn. cliente", localidad1);
		Departamento depto3=new Departamento(13, "finanzas", localidad2);
		Empleado e1=new Empleado(101, "Andrés", "Bueno Cruz", 'H', "anbucr90@gmail.com", 25000, 5000, trabajo1, depto1);
		Empleado e2=new Empleado(102, "Blanca", "Bueno Cruz", 'M', "blbucr90@gmail.com", 26000, 5000, trabajo1, depto3);
		Empleado e3=new Empleado(103, "Carlos", "Cruz Dolera", 'H', "cacrdo90@gmail.com", 27000, 5000, trabajo1, depto1);
		Empleado e4=new Empleado(104, "Dorleta", "Cruz Dolera", 'M', "docrdo90@gmail.com", 28000, 5000, trabajo1, depto3);
		Empleado e5=new Empleado(105, "Elias", "Dolera Espada", 'H', "eldoes90@gmail.com", 29000, 5000, trabajo1, depto2);
		Empleado e6=new Empleado(106, "Felisa", "Espado Fuertes", 'M', "feesfu90@gmail.com", 22000, 2000, trabajo2, depto3);
	    plantilla=new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5,e6));
	}
	
	//Métodos getter
	public String getNombre() {
		return nombre;
	}
    //Métodos setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Métodos listados en la interface;
	public boolean alta(Empleado empleado) {
		boolean booleano; int i=0;
		while (i<plantilla.size() && plantilla.get(i)!=empleado) {
			i=i+1;
		}
			if (i==plantilla.size()) {
				booleano=true;
				plantilla.add(empleado);
				System.out.println("Empleado dado de alta satisfactoriamente.");
		    }
			else {
				booleano=false;
			System.out.println("Error, el empleado ya está dado de alta.");
			}
		return booleano;
	}

	public boolean eliminarUno(Empleado empleado) {
		boolean booleano; int i=0;
		while (i<plantilla.size() && plantilla.get(i)!=empleado) {
			i=i+1;
		}
			if (i==plantilla.size()) {
				booleano=false;
				System.out.println("Error, el empleado no forma parte de la empresa.");
		    }
			else {
				booleano=true;
				plantilla.remove(empleado);
			    System.out.println("Empleado dado de baja satisfactoriamente.");
			}
		return booleano;
	}
	
	public boolean modificarUno(Empleado empleado) {
		boolean booleano;int i=0;
		while (i<plantilla.size() && plantilla.get(i)!=empleado) {
			i=i+1;
		}
			if (i==plantilla.size()) {
				booleano=false;
				System.out.println("Error, el empleado no forma parte de la empresa, luego no se pueden modificar sus datos.");
		    }
			else {
				booleano=true;
			System.out.println("Los datos del empleado se pueden modificar.");
			}
		return booleano;
	}
	
	public ArrayList<Empleado> buscarPorSexo(char sexo) {
		ArrayList<Empleado> listaporsexo=new ArrayList();
		for (int i=0;i<plantilla.size();i++) {
		      if (plantilla.get(i).getSexo()==sexo)
		    	  listaporsexo.add(plantilla.get(i));
		}
		System.out.println("El número de empleados de sexo "+sexo+" es " +listaporsexo.size()+".");
		return listaporsexo;
	}
	
	public Empleado buscarUno(int idEmpleado) {
		Empleado empleadobuscado;
		int i=0;
		while (plantilla.get(i).getIdEmpleado()!=idEmpleado) {
			i=i+1;
			}
	    return empleadobuscado=plantilla.get(i);
	}

	public ArrayList<Empleado> buscarTodos() {
		return plantilla;
	}
	
	public double masaSalarial() {
		double salariototal=0;
		for (int i=0;i<plantilla.size();i++) {
			salariototal+=plantilla.get(i).getSalario();
		}
		return salariototal;
	}

	public ArrayList<Empleado> buscarPorDepartamento(int idDepar) {
		ArrayList<Empleado> listapordpto=new ArrayList();
		for (int i=0;i<plantilla.size();i++) {
		      if (plantilla.get(i).getIdDepartamento()==idDepar)
		    	  listapordpto.add(plantilla.get(i));
		}
		System.out.println("El número de empleados del dpto. "+idDepar+" es " +listapordpto.size()+".");
		return listapordpto;
	}

	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		ArrayList<Empleado> listaportrabajo=new ArrayList();
		for (int i=0;i<plantilla.size();i++) {
		      if (plantilla.get(i).getIdTrabajo()==idTrabajo)
		    	  listaportrabajo.add(plantilla.get(i));
		}
		System.out.println("El número de empleados del trabajo "+idTrabajo+" es " +listaportrabajo.size()+".");
		return listaportrabajo;
	}
		
	public ArrayList<Empleado> buscarPorPais(String pais) {
	    ArrayList<Empleado> listaporpais=new ArrayList();
		for (int i=0;i<plantilla.size();i++) {
		      if (plantilla.get(i).getPaisss()==pais)
		    	  listaporpais.add(plantilla.get(i));
		}
		System.out.println("El número de empleados del pais "+pais+" es " +listaporpais.size()+".");
		return listaporpais;
	}
}