public class ComportamientoReflectivoACQN implements EstrategiaBatalla {
    boolean campoReflector = false;
    int turno = 0;

    @Override
    public void actuar(Criatura criatura, Criatura enemigo){
        turno ++;
        if(turno == 3){
            campoReflector = true;
            turno = 0;
            System.out.println(criatura.getNombre()+ "ha usado su escudo reflector, devolviendo los "+ enemigo.getAtaque()+ " puntos de daño a " + enemigo.getNombre());
            enemigo.reducirVida(enemigo.getAtaque());
        }else{
            int daño = criatura.getAtaque() + (int)(Math.random()*5);
            System.out.println(criatura.getNombre() + " ataca a " + enemigo.getNombre() + " causando "+ daño + " puntos de daño");
        }
        System.out.println(criatura.getNombre() +" tiene "+ criatura.getVida() +" puntos de vida");
    }
}
