package iset.dsi2.animalerie;

public class chien extends Animal {
	private String race;
	chien()
	{
		super();
		this.race="";
	}
	chien(String couleur, int poids,String race)
	{
		super(couleur,poids);
		this.race=race;
	}

    @Override public String toString()
  {
	return (super.toString()+"race:  "+race);
   }
    public void affichier()
    {
  	  System.out.println(toString());
  	
    }
    
    

}
