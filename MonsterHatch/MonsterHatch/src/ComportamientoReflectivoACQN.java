public class ComportamientoReflectivoACQN implements EstrategiaBatalla {
    boolean campoReflector = false;
    int turno = 0;

    @Override
    public void actuar(Criatura criatura, Criatura enemigo){
        turno ++;
        if(turno == 3){
            campoReflector = true;
            turno = 0;
            System.out.println(criatura.getNombre()+ "ha usado su campo reflector, devolviendo los "+ enemigo.getAtaque()+ " puntos de daño a " + enemigo.getNombre());
            criatura.reducirVida(0);
        }else{
            int daño = criatura.getAtaque() + (int)(Math.random()*5);
            System.out.println(criatura.getNombre() + " ataca a " + enemigo.getNombre() + " causando "+ daño + " puntos de daño");
        }
    }
}