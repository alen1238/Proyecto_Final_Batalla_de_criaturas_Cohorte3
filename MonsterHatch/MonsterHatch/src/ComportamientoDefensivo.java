public class ComportamientoDefensivo implements EstrategiaBatalla{
    @Override
    public void actuar(Criatura criatura, Criatura enemigo){
        int escudo = 5 + (int)(Math.random()*5);
        criatura.aumentarDefensa(escudo);
        System.out.println(criatura.getNombre() + " refuerza su defensa aumentando su " +
        "escudo en " + escudo + " puntos");
    }
}
