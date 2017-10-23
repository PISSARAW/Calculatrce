import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class Calculatrice {
    /**
     * Liste d'objet (Nombre ou Inconnue) associé à la calculatrice
     */
    public LinkedList<Object> liste;

    /**
     * Constructeur de calculatrice
     */
    public Calculatrice(){
        liste=new LinkedList<>();
    }

    public void lancer(){
        String operation = "";
        while (true) {
            System.out.print("calc> ");
            Scanner sc = new Scanner(System.in);
            operation = sc.nextLine();
            this.calcul(operation);
        }
    }
    /**
     * Analyse le motif lié à une entrée dans la calculatrice
     * @param s
     * @return
     */
    public int pattern(String s){
        if(Pattern.matches("[0-9]*\\.[0-9]+", (String)s))
            return 1;
        else if (Pattern.matches("[0-9]*\\/[1-9]+", (String)s))
            return 2;
        else if(Pattern.matches("-*[0-9]*",s))
            return 3;
        else if(Pattern.matches("[a-z]",s))
            return 4;
        return 5;
    }

    /**
     * Vérifie si la chaine de caractère respecte l'une des condition pour être une commande ou un operateur
     * @param s
     * @return
     */
    public boolean operande(String s) {
        if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")&&!s.equals("exit")) {
            if (!s.equals("!") && !s.equals("%") && !s.equals("^") && !s.equals("tout")) {
                if (!s.equals("sortir") && !s.equals("nettoyer") && !s.equals("inv")&&!s.equals("opp"))
                    return false;
            }
        }
        return true;
    }

    public void calculintern(String s){
        Object x;
        Object y;
        Nombre n;
        Expression e=new Expression();
        if(liste.size()>=2) {
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    x = liste.pop();
                    y = liste.pop();
                    if (!(x instanceof Nombre) || ((x instanceof Nombre) && (!(y instanceof Nombre)))) {
                        e.operation(x, s, y);
                        liste.push(e);
                    } else {
                        switch (s){
                            case "+":
                                n = ((Nombre) x).plus((Nombre) y);
                                liste.push(n);
                                break;
                            case "-":
                                n = ((Nombre) x).moins((Nombre) y);
                                liste.push(n);
                                break;
                            case "*":
                                n = ((Nombre) x).fois((Nombre) y);
                                liste.push(n);
                                break;
                            case "/":
                                n = ((Nombre) x).quotient((Nombre) y);
                                liste.push(n);
                                break;
                        }

                    }
            }
        }
    }

    public void calcul(String s){
        String[] expre = s.split(" ");
        Object res;
        //System.out.println("Déclaration de res");
        for (String se:expre
                ) {
            //System.out.println("Entrée dans le foreach");
            if(!this.operande(se)){
                //System.out.println("Début de détection du design pattern");
                switch (this.pattern(se)){
                    case 1:
                        liste.push(Flottant.faire(Double.parseDouble(se)));
                        //this.commande("all");
                        break;
                    case 2:
                        String[] ex = se.split("/");
                        liste.push( Rationnel.faire(Long.parseLong(ex[0]), Long.parseLong(ex[1])));
                        //this.commande("all");
                        break;
                    case 3:
                        //System.out.println("C'est une long");
                        liste.push(Entier.faire(Long.parseLong(se)));
                        //this.commande("all");
                        break;
                    case 4:
                        liste.push(new Inconnue(se.charAt(0)));
                        //this.commande("all");
                        break;
                }

            }
            this.calculintern(se);
            this.commande(se);
        }
        //this.commande("tout");

    }
    public void commande(String s){
        switch (s){
            case "tout":
                for (Object x:liste
                     ) {
                    System.out.print(x+"  ");
                }
                System.out.println();
                break;
            case "nettoyer":
                liste.clear();
                break;
            case "subt":

            case "sortir":
                exit(0);
        }
    }
}
