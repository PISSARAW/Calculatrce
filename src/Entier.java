public final class Entier implements Nombre{
    private final Long x;
    private Entier (long y){
        x=y;
    }
    public static Entier faire(long y){
        Entier en =null;
        en= new Entier(y);
        return en;
    }

    @Override
    public String toString() {
        return ""+x;
    }

    public Long getX() {
        return x;
    }
    
    /**
     * Additione deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre plus(Nombre n) {
    	
                 if(n instanceof Entier)
                     return Entier.faire((this.x + ((Entier) n).getX()));
                 else if(n instanceof Flottant)
                 {
                 	return Flottant.faire(this.getX().doubleValue()).plus(n);
                 	
                 }
                 else
                 {
                	 return n.plus(this);
                 }
    }

    /**
     * Soustrait deux nombres
     *
     * @param n
     * @return
     */
   @Override
    public Nombre moins(Nombre n) {
                return this.plus(n.oppose());
    }

    /**
     * Multiplie deux nombres
     *
     * @param n
     * @return
   */  
    @Override
    public Nombre fois(Nombre n) {
       
                 if(n instanceof Entier)
                     return Entier.faire((this.x * ((Entier) n).getX()));
                 else if(n instanceof Flottant)
                 {
                 	return n.fois(this);
                 	
                 }
                 else
                 {
                	 return n.fois(this);
                 }
    }
    
    /**
     * Divise deux nombres
     *
     * @param n
     * @return
 */    
    @Override
    public Nombre quotient(Nombre n) {
       return this.fois(n.inverse());
    }
 
    @Override
    public Rationnel inverse() {
        Rationnel e=null;
        return Rationnel.faire((long)1,(long)this.getX());
    }
 
    @Override
    public Entier oppose() {
	  Entier e = null;
	  return (e.faire(-x));
    }
}
