//import javax.swing.*;

/*public class UsoArraysII {
	
	public static void main(String[] args){
		
		String paises[]= new String[8];
		
		paises[0]= "España";
		
		paises[1]= "Portugal";
		
		paises[2]= "Colombia";
		
		paises[3]= "Francia";
		
		paises[4]= "Perú";
		
		paises[5]= "Chile";
		
		paises[6]= "Argentina";
		
		paises[7]= "Ecuador";
		
		
		for (int i=0; i<paises.length; i++){
			
			System.out.println("País " + (i+1) + " " +  paises[i]);
			
			} 
			
		String paises[]=("España","Portugal","Colombia","Francia","Perú","Chile","Argentina","Ecuador");
		
		
		for (int i=0;i<8;i++){
			
			paises[i]=JOptionpane.showInputDialog("Introduce país " + (i+1));
			
		}
				
		for (String elemento:paises){
			
			System.out.println("País: " + elemento);
			
		}
	}
}   */


public class UsoArraysII {
	
	public static void main(String[] args){
		
		int matriz_aleatorios= new int[150];
		
		for (int i=0; i<matriz_aleatorios.length; i++){
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
						
		}
		
		for (int numeros:matriz_aleatorios){
			
			System.out.println(numeros);
			
		}
	}
} //Matriz de números aleatorios
