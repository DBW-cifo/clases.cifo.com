package clases.cifo.com;

class Gerente extends Empleado implements Saludo {
      private String departamento;
      private double dietas;
      public String getDepartamento() {
		return departamento;
      }
      public void setDepartamento(String departamento) {
		this.departamento = departamento;
      }
      public double getDietas() {
  		return dietas;
        }
      public void setDietas(double dietas) {
  		this.dietas = dietas;
        }
public Gerente 
    (String nombre, String dni, double sueldo, String departamento, double dietas) {
    super(nombre,dni,sueldo);
	this.departamento=departamento;
	this.dietas=dietas;
}

void mostrarDepartamento() {
    System.out.println("    Departamento: "+departamento);    
}
public void Sldger() {
	System.out.println("Estimado/a Gerente/, ");
}
}