public class Inconnue {
    Character inc;
    public Inconnue(char c){
        inc=c;
    }

    public Character getInc() {
        return inc;
    }

    public void setInc(Character inc) {
        this.inc = inc;
    }

    @Override
    public String toString() {
        return ""+ inc;
    }
}
