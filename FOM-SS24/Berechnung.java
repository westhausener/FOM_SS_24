public class Berechnung{

	public static void main(String[] args){
	
		int[] myArray = {1,2,3,4,5,0,7};
		
		System.out.println("Mittelwert = "+berechneMittelwert(myArray));
		
		
	}
	
	public static double berechneMittelwert(int[] werte) {
		
		int summe = 0;
		
		for(int i=0; i<werte.length; i++){
			
						
			summe += werte[i];
		}
		
		return (double)summe/werte.length;
	}
	
}
