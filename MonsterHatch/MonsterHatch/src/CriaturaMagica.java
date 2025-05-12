public class CriaturaMagica extends Criatura{
    private int mana; //Cantidad de mana que posse la criatura.
    private int manaMaximo; //Limite de mana maximo que tiene la criatura.
    private int regeneracionMana; //Sera el comportamiento pasivo de la criatura magica, entonces en cada nuevo turno que ha atacado restablece el 10% de mana.   

    public CriaturaMagica(String nombre, int vida, int ataque, int defensa, EstrategiaBatalla estrategia, int manaMaximo) {
        super(nombre, vida, ataque, defensa, estrategia);
        this.manaMaximo = manaMaximo;
        this.mana = manaMaximo;
        this.regeneracionMana = calcularRegeneracionMana(); //Calular la regeneracion del 10% del mana maximo de la criatura.
    }

    /** Este codigo es para determinar el valor de regeneracion de mana:
     * Calcula la regeneracion de manáacon el 10% del valor que se puso en mana máximo
     * Ademas por seguridad asegura que sea al menos 1 punto por turno, siendo predeterminado
     */
    private int calcularRegeneracionMana() {
        int regeneracion = (int)(manaMaximo * 0.1); //Agarra del 10% del maná máximo.
        return Math.max(1, regeneracion); //que al menos tenga 1 punto de mana por turno.
    }

    //Metodo para actualizar el mana maximo y para poder recalcular ese valor.
      public void setManaMaximo(int nuevoMaximo) {
        this.manaMaximo = nuevoMaximo;
        this.regeneracionMana = calcularRegeneracionMana(); //Recalcula la regeneración para mantener la proporción del 10% del mana maximo.
    }

    //Ahora para regenerar el mana se debe sobreescribir el metodo ejecutarAccion antes de actuar, ya que este da error y no se ejecuta.
    @Override
    public void ejecutarAccion(Criatura enemigo) {
        regenerarMana();  //Se pondria como prioritario regenerar mana.
        super.ejecutarAccion(enemigo);  //Ahora si se ejecuta la acción segun su estrategia dada.
    }

    /**El comportamiento pasivo de la criatura magica:
     * Sera un metodo privado para esta criatura ser la unica que pueda regenerar mana en cada turno
     * Añadiendo que esta aumenta el mana actual que posee en la batalla hasta el limite maximo de manaMaximo que se puso
     * Esto para que no aumente el mana en la primera ronda y en las siguientes no sobre pase el limite establecido
     */
    private void regenerarMana() {
        mana = Math.min(mana + regeneracionMana, manaMaximo);
        System.out.println(getNombre() + " regenera " + regeneracionMana + " de maná (" + (int)(regeneracionMana * 100.0 / manaMaximo) + "%). Maná actual: " + mana);
    }

     /**Metodo al momento que la criatura use el mana:
     * @param cantidad La cantidad de mana a consumir.
     * @return true si habia suficiente mana y se consumio, false en caso contrario.
     */
    public boolean usarMana(int cantidad) {
        if (mana >= cantidad) {
            mana -= cantidad;
            System.out.println(getNombre() + " usa " + cantidad + " de maná. Maná restante: " + mana);
            return true;
        }
        System.out.println(getNombre() + " no tiene suficiente maná para usar esta habilidad");
        return false;
    }

    //Getter para obtener el valor del mana
    public int getMana() {
        return mana;
    }

    //Getter para obtener el valor del mana maximo
    public int getManaMaximo() {
        return manaMaximo;
    }

}
