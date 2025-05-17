public class ComportamientoGuillenMagico implements EstrategiaBatalla{
    private int costeMana; //Valor para la cantida de mana necesaria por hechizo.
    private int poderMagico; //Daño que causa el hechizo lanzado.

    public ComportamientoGuillenMagico(int costeMana, int poderMagico) {
        this.costeMana = costeMana;
        this.poderMagico = poderMagico;
    }

    @Override
    public void actuar(Criatura criatura, Criatura enemigo) {
        if (criatura instanceof CriaturaMagica) {  //Ayuda a verifica si la criatura es de tipo CriaturaMagica.
            CriaturaMagica criaturaMagica = (CriaturaMagica) criatura;
            if (criaturaMagica.usarMana(costeMana)) {  //Accion de consumir el valor del mana para realizar hechizo y causar daño.
                int daño = criaturaMagica.getAtaque() + poderMagico + (int)(Math.random()*8);
                System.out.println(criaturaMagica.getNombre() + " procede a lanzar un hechizo poderoso causando " + daño + " puntos de daño a " + enemigo.getNombre());
                enemigo.reducirVida(daño);
            } else { //Llegado el caso si la criatura ya no tiene suficiente mana, entonces le da un puñetazo.
                System.out.println(criatura.getNombre() + " no tiene suficiente mana para lanzar hechizos, pero no se ha quedo sin opciones, entonces a realizado un ataque basico.");
                new ComportamientoAgresivo().actuar(criatura, enemigo);
            }
        } else {  //Si por casualidad se da el comportamiento a una criatura que no es mágica, entonces esta realiza un ataque muy débil.
            System.out.println(criatura.getNombre() + " no es una criatura mágica, no tiene el conocimiento para usar esta estrategia.");
            int daño = criatura.getAtaque() / 2;
            enemigo.reducirVida(daño);
            System.out.println(criatura.getNombre() + " intenta imitar un hechizo, pero sin el conocimiento suficiente solo causa " + daño + " puntos de daño");
        }
    }

}
