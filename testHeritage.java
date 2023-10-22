package iset.dsi2.animalerie;



public class testHeritage {

	public static void main(String[] args) {
		 Animal tab[]  = new Animal[3];
		 Animal A1  = new Animal("noir",44);
		 
		 chats c1=new chats("noir",45,true);
		 chien c2=new chien("noir",45,"Caniche" );
		 tab[0]=A1;
		 tab[1]=c1;
		 tab[2]=c2;
		
		 
		 for (int i = 0; i < tab.length; i++) {
			   tab[i]. decrisToi();
		       tab[i].boire();
		       tab[i].crier();;
		       tab[i].manger();
		 
	           
	            
	            if (tab[i] instanceof Animal) {
	                System.out.println("L'espèce de cet animal est inconnue.");
	            }
	        }
			
			
		 
		 

	}
}


