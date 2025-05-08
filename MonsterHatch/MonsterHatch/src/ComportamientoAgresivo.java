public class ComportamientoAgresivo implements EstrategiaBatalla{
    @Override
    public void actuar(Criatura criatura, Criatura enemigo){
        int daño = criatura.getAtaque() + (int)(Math.random()*5);
        enemigo.reducirVida(daño);
        System.out.println(criatura.getNombre() + "ataca violentamente causando " + daño +
        " puntos de daño a " + enemigo.getNombre());
    }
}
