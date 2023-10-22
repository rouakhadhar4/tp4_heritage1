package iset.dsi2.animalerie;

public class chats extends Animal {
	private boolean sauvage;
	chats()
	{
		super();
		this.sauvage=false;
	}
	chats(String couleur, int poids,boolean sauvage)
	{
		super(couleur,poids);
		this.sauvage=true;;
	}

    @Override public String toString()
  {
	return (super.toString()+"sauvage:  "+sauvage);
   }
    public void affichier()
    {
  	  System.out.println(toString());
  	
    }
   
    
    
   
}

