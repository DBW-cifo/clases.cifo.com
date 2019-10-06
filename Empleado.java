package clases.cifo.com;

public class Empleado implements Saludo {
		private String nombre;
	    private String dni;
	    private double sueldo;
	    private double irpf;
	    private double sueldoneto;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		public double getSueldoneto() {
			return sueldoneto;
		}
		public void setSueldoneto(double sueldoneto) {
			this.sueldoneto = sueldoneto;
		}
		public Empleado(String nombre, String dni, double sueldo) {
			super();
			this.nombre = nombre;
			this.dni = dni;
			this.sueldo = sueldo;
		    
	    /*public double sueldoneto() { Método */
		    if (sueldo < 3000) {
			    irpf=0.85;
		    }
		    else {
			    irpf=0.75;
		    }
		    sueldoneto=sueldo*irpf;
		}
		public void Sldemp() {
		System.out.println("Estimado/a Empleado/a, ");
		}
		@Override
		public void Sldcli() {		
		}
		@Override
		public void Slddir() {
		}
		@Override
		public void Sldger() {
		}
}