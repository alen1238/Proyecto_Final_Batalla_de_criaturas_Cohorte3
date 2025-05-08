public class Criatura {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private boolean esquivaActiva;
    private EstrategiaBatalla estrategia;

    public Criatura( String nombre, int vida, int ataque, int defensa, EstrategiaBatalla estrategia){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.estrategia = estrategia;
        this.esquivaActiva = false;
    }

    public void setEstrategia(EstrategiaBatalla nuevaEstrategia){
        this.estrategia = nuevaEstrategia;
    }

    public void ejecutarAccion(Criatura enemigo){
        estrategia.actuar(this, enemigo);
    }

    public void reducirVida(int daño){
        if(esquivaActiva){
            System.out.println(nombre + " esquiva completamente el daño");
            esquivaActiva = false;
            return;
        }
        int dañoReal = Math.max(daño - defensa, 0);
        vida -= dañoReal;
        System.out.println(nombre + " recibe " + dañoReal + " de daño. Vida restante: " + vida);
    }

    public void aumentarDefensa(int cantidad){
        defensa += cantidad;
    }

    public void activarEsquiva(){
        esquivaActiva = true;
    }

    //getters
    public String getNombre(){return nombre;}
    public int getAtaque(){return ataque;}
    public int getVida(){return vida;}
}
