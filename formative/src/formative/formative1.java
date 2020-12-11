package formative;

public class formative1 {
	
	static int tab[] = {1,2,3,4};
	public static void main(String[] args) {
		System.out.println("le somme est " + addition());
	}
	static int addition() {
		
		 int somme = 0;
         int i; 
        
         for (i = 0; i < tab.length; i++) 
            somme +=  tab[i]; 
        
         return somme;
	
	}
	
}
