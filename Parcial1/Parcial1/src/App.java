import java.io.IOException;
import java.util.Scanner;

/**
 * @author Jose Paz
 */
public class App {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre, color;
		int b = 0, jA=0, jB=0;
		int k=0;
		algoritmoChudnovsky a = new algoritmoChudnovsky();
		partidoTennis t = new partidoTennis();
		Monstruo m = new Monstruo();
		System.out.print("Ingrese\n1 para abrir Algoritmo Chuvnosky \n2 para abrir el Reportero\n3 para abrir la Fabrica de Monstruos\n");
		try {
			b = System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		if(b==49) {
			System.out.println("Ingrese numero de digitos");
		     try {
				k = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\n" + a.calcularChudnovsky(k-9));
		 }else if(b==50) {
			 for (int i =0; i<=9;i++) {
				 System.out.print("Ingrese partidos ganados por jugador A\n");
				 
				 try {
					jA = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 
				 System.out.print("Ingrese partidos ganados por jugador B\n");
				 try {
					jB = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 t.calcularGanador(jA, jB);
			 }
			 t.calcularCampeon();
			 System.out.print("Ingrese numero de partido que quiere recordar\n");
			 try {
				jB = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t.recordarGanador(jB);
		 }else if (b==51) {
			 
			 System.out.print("Ingrese nombre de su nuevo monstruo\n");
			 nombre = sc.nextLine();
			 m.setNombre(nombre);
			 System.out.print("Ingrese color de su nuevo monstruo\n");
			 color = sc.nextLine();
			 m.setColor(color);
			 m.Agigantarse();
			 m.caminarLento();
		 }
		
		
		
		
	}

}
