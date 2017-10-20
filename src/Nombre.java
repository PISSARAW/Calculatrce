public interface Nombre {
    /**
     * Additione deux nombres
     * @param n
     * @return
     */
    public Nombre plus (Nombre n);
    /**
     * Soustrait deux nombres
     * @param n
     * @return
     */
    public Nombre moins (Nombre n);
    /**
     * Multiplie deux nombres
     * @param n
     * @return
     */
    public Nombre fois (Nombre n);
    /**
     * Divise deux nombres
     * @param n
     * @return
     */
    public Nombre quotient (Nombre n);

    /**
     * Inverse in nombre
     * @return
     */
    public Nombre inverse();

    /**
     * Renvoie l'opposé d'un nombre
     * @return
     */
    public Nombre oppose();




}
