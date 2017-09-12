import java.util.ArrayList;
import java.util.Random;

public class partidoTennis implements Reportero{
	
	private int indice=0;
	ArrayList<String> list = new ArrayList<String>(9);
	
	
	
	@Override
	public void calcularGanador(int a, int b) {
		if(indice < 9 ) {
			if(a==6) {
				if( (a-b)>=2 ) {
					list.add(indice, "Jugador A");
				}
			}else if(b==6) {
				if( (b-a)>=2 ) {
					list.add(indice, "Jugador B");
				}
			
			if(a==6 && b==6) {
				int c;
				Random rnd = new Random();
				c = rnd.nextInt(1);
				if(c==0){
					System.out.print("El jugador A Gano el set al ganar el ultimo partido. Resultado final: 7-6");
					list.add(indice, "Jugador A");
				}else if (c==1) {
					System.out.print("El jugador B Gano el set al ganar el ultimo partido. Resultado final: 7-6");
					list.add(indice, "Jugador B");
				}
			}
			
			if(a<=5 && b<=5) {
				System.out.println("El partido aun no a terminado");
			}
			
			if(a>7 || b>7) {
				System.out.print("Resultado no valido");
			}
			
			if (a>=6 && (a-b)>2) {
				System.out.print("Resultado no valido");
			} else if (b>=6 && (b-a)>2) {
				System.out.print("Resultado no valido");
			}
		  }
			indice ++;
		} 
		
    }

	
	/**
	 * @return   Regresa el campeon de 9 partidos
	 */
	@Override
	public String calcularCampeon() {
		int ganoA=0, ganoB=0;
		list.containsAll(list);
		for (int i =0; i<=9;i++) {
			if (list.get(i)=="Jugador A") {
				ganoA += 1;
			} else if (list.get(i)=="Jugador B") {
				ganoB += 1;
			}
		}
		
		if(ganoA>ganoB) {
			return ("ELcampeon es el Jugador A");
			
		}else if (ganoB>ganoA) {
			return ("El campeon es el Jugador B");
		}else {
		return null;
		}
	}

	/**
	 * @return   Regresa el ganado de un partido que el usuario escoge
	 */
	@Override
	public String recordarGanador(int juego) {
		return list.get(indice);	
	}

}
