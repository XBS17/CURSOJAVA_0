import java.util.*;

public class AdivinaNumero {
	
	public static void main (String[] args){
		
		int aleatorio=(int)(Math.random()*100);
		
		//System.out.println(aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while(numero!=aleatorio){
			
			intentos++;
			
			System.out.println("Introduce un número, por favor");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero){
				
				System.out.println("El número aleatorio es más bajo");
				
				}
				
			else if(aleatorio>numero){
				
				System.out.println("El número aleatorio es más alto");
				
				}	
			}
			
			System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
		
		}
	
	}
