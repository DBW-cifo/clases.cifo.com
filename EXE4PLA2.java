package clases.cifo.com;
import java.util.Scanner;
public class EXE4PLA2 {
	public static void main (String arg []) {

	    String NOMBRE;
	    do {
	    System.out.println("Indica nombre: ");
	    Scanner no = new Scanner(System.in);
	    NOMBRE = no.nextLine();
	    System.out.println("*** Nombre indicado: "+NOMBRE);    
	    } while (NOMBRE == null || NOMBRE.isEmpty());
	    
		String DNI="";
		do {
		Scanner dn = new Scanner(System.in);
		System.out.println("Indica DNI: ");
	    DNI = dn.nextLine();
	    System.out.println("*** DNI indicado: "+DNI);
		} while (DNI == null || DNI.isEmpty());
	    
	    double SUELDO;
		do {
		System.out.println("Indica sueldo: "); 
		Scanner su = new Scanner(System.in);
		SUELDO = su.nextInt();
		System.out.println("*** Sueldo indicado: "+SUELDO);
		} while (SUELDO <= 0);
		
		String SECCION="";
		do {
		Scanner dn = new Scanner(System.in);
		System.out.println("Indica SECCION: ");
	    SECCION = dn.nextLine();
	    System.out.println("*** SECCION indicada: "+DNI);
		} while (SECCION == null || SECCION.isEmpty());
		
		String DEPARTAMENTO="";
		do {
		Scanner dn = new Scanner(System.in);
		System.out.println("Indica DEPARTAMENTO: ");
	    DEPARTAMENTO = dn.nextLine();
	    System.out.println("*** DEPARTAMENTO indicada: "+DNI);
		} while (DEPARTAMENTO == null || DEPARTAMENTO.isEmpty());
		
		double DIETAS;
		Scanner dn = new Scanner(System.in);
		System.out.println("Indica DIETAS(ó 0): ");
	    DIETAS = dn.nextInt();
	    System.out.println("*** DIETAS indicadas: "+DIETAS);
		
		double STOCKOPTIONS;
		Scanner st = new Scanner(System.in);
		System.out.println("Indica STOCKOPTIONS(ó 0): ");
		STOCKOPTIONS = st.nextInt();
	    System.out.println("*** STOCKOPTIONS indicadas: "+STOCKOPTIONS);
		
	    int tipo = 0;
		if (DIETAS != 0) {
			tipo = 1; /* es un gerente */
		}
		if (STOCKOPTIONS != 0) {
			tipo = 2; /* es un directivo */
		}
		
		Empleado e=new Empleado
			     (NOMBRE,DNI,SUELDO);
	                       
		Administracion a=new Administracion
				 (NOMBRE,DNI,SUELDO,SECCION);
		        
		Gerente g=new Gerente
			     (NOMBRE,DNI,SUELDO,DEPARTAMENTO,DIETAS);
			    		     
		Direccion d=new Direccion
				 (NOMBRE,DNI,SUELDO,STOCKOPTIONS);
		System.out.println("=============================");        	         
		switch (tipo) {
		case 0:  e.Sldemp();
		break;
		case 1:  g.Sldger();
		break;
		case 2:  d.Slddir();
		break;
		}
		NOMBRE = NOMBRE.toUpperCase();
		System.out.println("    Sr/Sra. "+NOMBRE);
		System.out.println("    (DNI: "+DNI+")");
		a.mostrarSeccion();
		g.mostrarDepartamento();
		System.out.println("=============================");
		System.out.println("*Sueldo bruto: "+SUELDO);
		System.out.println("*Sueldo neto : "+e.getSueldoneto());
		if (tipo == 1 || tipo == 2) {
		System.out.println("*Dietas      : "+g.getDietas());
		System.out.println("*Stock Opions: "+d.getStockOptions());
		}
		double total = e.getSueldoneto()+g.getDietas()+(d.getStockOptions()*0.1);
		System.out.println("*** TOTAL....: "+total+" ***");      
/* FINAL */
  }
}