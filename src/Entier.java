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

    
   //************************ 
    /**
     * Additione deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre plus(Nombre n) {
    	 try {
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x + ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).plus(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
        return null;
    }

    /**
     * Soustrait deux nombres
     *
     * @param n
     * @return
     */
   @Override
    public Nombre moins(Nombre n) {
        try {
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x - ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).moins(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
        return null;
    }

    /**
     * Multiplie deux nombres
     *
     * @param n
     * @return
   */  
    @Override
    public Nombre fois(Nombre n) {
        try {
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x * ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).fois(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
        return null;
    }
    
    /**
     * Divise deux nombres
     *
     * @param n
     * @return
 */    
    @Override
    public Nombre quotient(Nombre n) {
        try {
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x / ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).quotient(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
        return null;
    }
    
    
    
 
   // @Override
  public Rationnel inverse() {
        Rationnel e=null;
        return Rationnel.faire((long)1,(long)this.getX());
    }
 
  @Override
  public Entier oppose() {
	  Entier e = null;
	  return (e.faire(-x));
  }

  /* 
    @Override
    public Object factorielle() {
        return Entier.faire(this.fact(this.getX()));
    }

  

    @Override
    public Object puissance2() {
        return null;
    }

    @Override
    public Object exponentielle() {
        double d= this.getX();
        return Entier.faire((long) Math.exp(d));
    }

    @Override
    public Object racineCarre() {
        Flottant e=null;
        return Flottant.faire(Math.sqrt(this.getX()));
    }

    public long fact(long n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return this.fact(n - 1) * n;
    }
	@Override
	public Nombre moins(Nombre n) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override*/

	
}
