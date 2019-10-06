package clases.cifo.com;

abstract class Clientes implements Saludo {	
	
	public String nombre="";
	public String email="";
	public String tipo="";
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Clientes(String nombre, String email, String tipo) {
	}  
	public void Sldcli() {
	  System.out.println("Estimado/a Cliente, "+nombre);
	}
}