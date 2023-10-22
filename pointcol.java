package tp_heritage2;

public class pointcol extends point {
	private String couleur;
	pointcol(char nom,int abs,int ord,String couleur)
	{
		super( nom,abs,ord);
		this.couleur=couleur;
		
	}
	pointcol()
	{
		super();
		this.couleur="";
		
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

      @Override public String toString()
    {
	return (super.toString()+"couleur:  "+couleur);
     }
      public void affichier()
      {
    	  System.out.println(toString());
    	
      }
      

	
	
	
	
}