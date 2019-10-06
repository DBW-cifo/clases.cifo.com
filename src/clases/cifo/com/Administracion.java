package clases.cifo.com;

class Administracion extends Empleado implements Saludo{
      private String seccion;
      public String getSeccion() {
		return seccion;
      }
      public void setSeccion(String seccion) {
		this.seccion = seccion;
      }
public Administracion 
    (String nombre, String dni, double sueldo, String seccion) {
    super(nombre, dni, sueldo);
	this.seccion=seccion;
}
void mostrarSeccion() {
    System.out.println("    Seccion: "+seccion);
}
}