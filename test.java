package tp_heritage2;

public class test {

	public static void main(String[] args) {
		point p=new point('A',1,2);
        pointcol p1=new pointcol('A',2,3,"red");
	    pointcol p2=new pointcol();
	    p1.affichier();
		p1.setCouleur("bleu");
		p1.affichier();
		p.affichier();
		p=p1;
		p.affichier();
	//p1=p ;erreur;
		
		
		
		
		
		
		
		
		
		 

	}

}
