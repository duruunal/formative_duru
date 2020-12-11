package formative;

public class formative2 {

	public static void main(String[] args){
		int [] nombre = {1,2,3,4,5,6,7,8,9,10};
		int trouver = 11;
		boolean trouve = false;
		
		for(int n: nombre) 
		{
			if(n==trouver)
			{
				trouve=true;
				break;


			}
			
			if(trouve)
				System.out.println("c'est true");
			else
				System.out.println("c'est false");
			break;
				
		}
				
		
	
	}

}
