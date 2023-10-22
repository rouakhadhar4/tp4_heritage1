package tp_heritage2;

public class point {

		protected char nom;
		protected int abs;
		protected int ord;
		
		void affichier()
		{
			System.out.println(nom+"("+abs+","+ord+")");

		}
		point()
		{
			nom='o';
			abs=5;
			ord=10;
		}

		point(point P)
		{
			nom=P.nom;
			abs=P.abs;
			ord=P.ord;
			
		}

	  point(char nom,int abs,int ord)
	  {
		    this.nom=nom;
			this.abs=abs;
			this.ord=ord;

	  }


		
		void deplacer(int x,int y)
		{
			abs+=x;
			ord+=y;
		}
		void reset(int x,int y)
		{
			abs-=x;
			ord-=y;
		}
	    @Override public String toString()
		{
			return nom+"("+abs+","+ord+")";
		}
	    
	    
	    boolean coincide_V1(point p) {
	    	
	    	return this.abs==p.abs && this.ord==p.ord;
	    		
	    	
	    }
	       static boolean coincide_V2(point p1,point p2) {
	    	
	    	return ((p1.abs==p2.abs) && (p1.ord==p2.ord));
	    		
	    	
	    }



}



