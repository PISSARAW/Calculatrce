public class Main {

    public static void main(String[] args) {
	// write your code here
        Nombre f = Flottant.faire(12.5);
        Nombre n = Flottant.faire(100.2);
        Nombre e= Flottant.faire(5);
        for(int i=0; i<20; i++){
            System.out.print("F+F "+e.plus(Flottant.faire(i))+ " ");
            System.out.print("F+E "+e.plus(Entier.faire(i))+" ");
            System.out.print("E+F "+Entier.faire(5).plus((Flottant.faire((double)i)))+ " ");
            System.out.print("E+E "+Entier.faire(5).plus(Entier.faire(i))+" ");
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<20; i++){
            System.out.print("F-F "+e.moins(Flottant.faire(i))+ " ");
            System.out.print("F-E "+e.moins(Entier.faire(i))+" ");
            System.out.print("E-F "+Entier.faire(5).moins((Flottant.faire((double)i)))+ " ");
            System.out.print("E-E "+Entier.faire(5).moins(Entier.faire(i))+" ");
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<20; i++){
            System.out.print("F*F "+e.fois(Flottant.faire(i))+ " ");
            System.out.print("F*E "+e.fois(Entier.faire(i))+" ");
            System.out.print("E*F "+Entier.faire(5).fois((Flottant.faire((double)i)))+ " ");
            System.out.print("E*E "+Entier.faire(5).fois(Entier.faire(i))+" ");
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<20; i++){
            System.out.print("F/F "+e.quotient(Flottant.faire(i))+ " ");
            System.out.print("F/E "+e.quotient(Entier.faire(i))+" ");
            System.out.print("E/F "+Entier.faire(5).quotient((Flottant.faire((double)i)))+ " ");
            System.out.print("E/E "+Entier.faire(5).quotient(Entier.faire(i))+" ");
            System.out.println();
        }
        System.out.println();

        Long xv= new Long(9);
        Inconnue x = new Inconnue('x');
        System.out.println(x);
        Expression ex= new Expression(Entier.faire(25),x,Entier.faire(3),"+");
        System.out.println(ex);
        System.out.println(ex.subt((Nombre) Entier.faire(-2)));

    }
}
