package clases.cifo.com;

class Direccion extends Empleado implements Saludo {
      private double StockOptions;
      public double getStockOptions() {
		return StockOptions;
      }
      public void setStockOptions(double StockOptions) {
		this.StockOptions = StockOptions;
      }
public Direccion 
    (String nombre, String dni, double sueldo, double StockOptions) {
    super(nombre,dni,sueldo);
	this.StockOptions=StockOptions;
}
void mostrarStockOptions() {
    System.out.println("*StockOptions: "+StockOptions);
}
public void Slddir() {
	  System.out.println("Estimado/a Director/ra, ");
	}
}